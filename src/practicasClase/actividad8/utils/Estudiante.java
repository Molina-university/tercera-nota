package practicasClase.actividad8.utils;

import java.util.ArrayList;
import java.util.List;

public class Estudiante {
    private String id;
    private String nombre;
    private String programa;
    private List<Curso> cursosMatriculados;
    private List<Proyecto> proyectosParticipantes;

    public Estudiante(String id, String nombre, String programa) {
        this.id = id;
        this.nombre = nombre;
        this.programa = programa;
        this.cursosMatriculados = new ArrayList<>();
        this.proyectosParticipantes = new ArrayList<>();
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getPrograma() { return programa; }
    public void setPrograma(String programa) { this.programa = programa; }
    public List<Curso> getCursosMatriculados() { return cursosMatriculados; }
    public void setCursosMatriculados(List<Curso> cursosMatriculados) { 
        this.cursosMatriculados = cursosMatriculados; 
    }
    public List<Proyecto> getProyectosParticipantes() { 
        return proyectosParticipantes; 
    }
    public void setProyectosParticipantes(List<Proyecto> proyectosParticipantes) { 
        this.proyectosParticipantes = proyectosParticipantes; 
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", programa='" + programa + '\'' +
                '}';
    }
}