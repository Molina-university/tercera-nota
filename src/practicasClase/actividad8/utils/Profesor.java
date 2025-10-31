package practicasClase.actividad8.utils;

import java.util.ArrayList;
import java.util.List;

public class Profesor {
    private String id;
    private String nombre;
    private String departamento;
    private List<Curso> cursosAsignados;
    private List<Proyecto> proyectosDirigidos;

    public Profesor(String id, String nombre, String departamento) {
        this.id = id;
        this.nombre = nombre;
        this.departamento = departamento;
        this.cursosAsignados = new ArrayList<>();
        this.proyectosDirigidos = new ArrayList<>();
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getDepartamento() { return departamento; }
    public void setDepartamento(String departamento) { this.departamento = departamento; }
    public List<Curso> getCursosAsignados() { 
        return cursosAsignados; 
    }
    public void setCursosAsignados(List<Curso> cursosAsignados) { 
        this.cursosAsignados = cursosAsignados; 
    }
    public List<Proyecto> getProyectosDirigidos() { 
        return proyectosDirigidos; 
    }
    public void setProyectosDirigidos(List<Proyecto> proyectosDirigidos) { 
        this.proyectosDirigidos = proyectosDirigidos; 
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", departamento='" + departamento + '\'' +
                '}';
    }
}
