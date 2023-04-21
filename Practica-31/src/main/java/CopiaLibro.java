public class CopiaLibro {
    private Libro libro;
    private Integer identificador;
    private EstadoCopia estado;


    public void setEstado(EstadoCopia nuevoEstado) {
        this.estado = nuevoEstado;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }
}
