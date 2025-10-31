package practicasClase.actividad8;

import practicasClase.actividad8.utils.Curso;
import practicasClase.actividad8.utils.Estudiante;
import practicasClase.actividad8.utils.Profesor;
import practicasClase.actividad8.utils.Proyecto;
import practicasClase.actividad8.utils.UnidadTematica;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Profesor profesor = new Profesor("P-01", "Yisus", "Ing. Sistemas");
        
        Estudiante estudiante1 = new Estudiante("E-01", "Paula", "Ing. Sistemas");
        Estudiante estudiante2 = new Estudiante("E-02", "Lucho", "Ing. Mecanica");

        Curso programacion = new Curso("PRG-101", "Fundamentos de Programación", 4);
        programacion.setProfesor(profesor);

        UnidadTematica ut1 = new UnidadTematica("UT1", "Introducción a la Programación", 
            "Conceptos básicos de programación", 2, 2);
        UnidadTematica ut2 = new UnidadTematica("UT2", "Control de Flujo", 
            "Condicionales y ciclos", 2, 2);
        
        programacion.getUnidadesTematicas().addAll(Arrays.asList(ut1, ut2));

        programacion.matricularEstudiante(estudiante1);
        programacion.matricularEstudiante(estudiante2);

        Proyecto proyectoFinal = new Proyecto("PF-001", "Desarrollo de Aplicación Console", 
            "Proyecto final de programación");
        proyectoFinal.setProfesorDirector(profesor);
        proyectoFinal.agregarParticipante(estudiante1);
        proyectoFinal.agregarParticipante(estudiante2);
        
        programacion.getProyectosAsociados().add(proyectoFinal);

        System.out.println("=== Información del Curso ===");
        System.out.println(programacion.toString());
        System.out.println("\nUnidades Temáticas:");
        programacion.getUnidadesTematicas().forEach(System.out::println);
        System.out.println("\nEstudiantes Matriculados:");
        programacion.getEstudiantesMatriculados().forEach(System.out::println);
        System.out.println("\nProyecto Asociado:");
        System.out.println(proyectoFinal.toString());
    }
}