package practicasClase.actividad8.utils;

import java.util.ArrayList;
import java.util.List;

public class Proyecto {
    private String codigo;
    private String titulo;
    private String descripcion;
    private Profesor profesorDirector;
    private List<Estudiante> participantes;
    private List<Curso> cursosRelacionados;
    private EstadoProyecto estado;

    public Proyecto(String codigo, String titulo, String descripcion) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.participantes = new ArrayList<>();
        this.cursosRelacionados = new ArrayList<>();
        this.estado = EstadoProyecto.ACTIVO;
    }

    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public Profesor getProfesorDirector() { return profesorDirector; }
    public void setProfesorDirector(Profesor profesorDirector) { 
        this.profesorDirector = profesorDirector; 
    }
    public List<Estudiante> getParticipantes() { 
        return participantes; 
    }
    public void setParticipantes(List<Estudiante> participantes) { 
        this.participantes = participantes; 
    }
    public List<Curso> getCursosRelacionados() { 
        return cursosRelacionados; 
    }
    public void setCursosRelacionados(List<Curso> cursosRelacionados) { 
        this.cursosRelacionados = cursosRelacionados; 
    }
    public EstadoProyecto getEstado() { return estado; }
    public void setEstado(EstadoProyecto estado) { this.estado = estado; }

    public void agregarParticipante(Estudiante estudiante) {
        this.participantes.add(estudiante);
        estudiante.getProyectosParticipantes().add(this);
    }

    @Override
    public String toString() {
        return "Proyecto{" +
                "codigo='" + codigo + '\'' +
                ", titulo='" + titulo + '\'' +
                ", estado=" + estado +
                '}';
    }
}

enum EstadoProyecto {
    ACTIVO,
    FINALIZADO,
    SUSPENDIDO
}