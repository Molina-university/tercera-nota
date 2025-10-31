package practicasClase.actividad8.utils;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String codigo;
    private String nombre;
    private int creditos;
    private Profesor profesor;
    private List<Estudiante> estudiantesMatriculados;
    private List<UnidadTematica> unidadesTematicas;
    private List<Proyecto> proyectosAsociados;

    public Curso(String codigo, String nombre, int creditos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.creditos = creditos;
        this.estudiantesMatriculados = new ArrayList<>();
        this.unidadesTematicas = new ArrayList<>();
        this.proyectosAsociados = new ArrayList<>();
    }

    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public int getCreditos() { return creditos; }
    public void setCreditos(int creditos) { this.creditos = creditos; }
    public Profesor getProfesor() { return profesor; }
    public void setProfesor(Profesor profesor) { this.profesor = profesor; }
    public List<Estudiante> getEstudiantesMatriculados() { 
        return estudiantesMatriculados; 
    }
    public void setEstudiantesMatriculados(List<Estudiante> estudiantesMatriculados) { 
        this.estudiantesMatriculados = estudiantesMatriculados; 
    }
    public List<UnidadTematica> getUnidadesTematicas() { 
        return unidadesTematicas; 
    }
    public void setUnidadesTematicas(List<UnidadTematica> unidadesTematicas) { 
        this.unidadesTematicas = unidadesTematicas; 
    }
    public List<Proyecto> getProyectosAsociados() { 
        return proyectosAsociados; 
    }
    public void setProyectosAsociados(List<Proyecto> proyectosAsociados) { 
        this.proyectosAsociados = proyectosAsociados; 
    }

    public void matricularEstudiante(Estudiante estudiante) {
        this.estudiantesMatriculados.add(estudiante);
        estudiante.getCursosMatriculados().add(this);
    }

    @Override
    public String toString() {
        return "Curso{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", creditos=" + creditos +
                '}';
    }
}