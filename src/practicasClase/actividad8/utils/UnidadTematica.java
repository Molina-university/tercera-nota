package practicasClase.actividad8.utils;

public class UnidadTematica {
    private String codigo;
    private String titulo;
    private String descripcion;
    private double horasTeoricas;
    private double horasPracticas;

    public UnidadTematica(String codigo, String titulo, String descripcion, 
                          double horasTeoricas, double horasPracticas) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.horasTeoricas = horasTeoricas;
        this.horasPracticas = horasPracticas;
    }

    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public double getHorasTeoricas() { return horasTeoricas; }
    public void setHorasTeoricas(double horasTeoricas) { this.horasTeoricas = horasTeoricas; }
    public double getHorasPracticas() { return horasPracticas; }
    public void setHorasPracticas(double horasPracticas) { this.horasPracticas = horasPracticas; }

    @Override
    public String toString() {
        return "UnidadTematica{" +
                "codigo='" + codigo + '\'' +
                ", titulo='" + titulo + '\'' +
                '}';
    }
}