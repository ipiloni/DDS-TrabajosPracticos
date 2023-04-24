public class Producto {
    private String codigo;
    private String descripcion;
    private Double precioActual;

    public Producto(String codigo, String descripcion, Double precioActual) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precioActual = precioActual;
    }

    public Double precio() { return precioActual; }

    public void actualizarPrecio(Double nuevoPrecio) {
        this.precioActual = nuevoPrecio;
    }
}
