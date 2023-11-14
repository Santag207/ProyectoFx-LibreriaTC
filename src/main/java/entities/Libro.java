package entities;

public class Libro {
    private String titulo;
    private String autor;
    private String clasificacion;
    private int Nlibros;

    public Libro(String titulo, String autor, String clasificacion, int Nlibros) {
        this.titulo = titulo;
        this.autor = autor;
        this.clasificacion = clasificacion;
        this.Nlibros = Nlibros;
    }

    public void setNlibros(int Nlibros) {
        this.Nlibros = Nlibros;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public int getNlibros() {
        return Nlibros;
    }

}