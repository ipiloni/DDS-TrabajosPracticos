public class CopiaLibro {
    private Integer identificador;
    private Libro libro;
    private Estado estado;

    public void cambiarEstado(Estado nuevoEstado) {
        this.estado = nuevoEstado;
    }

    public Estado getEstado() { return estado; }

}
