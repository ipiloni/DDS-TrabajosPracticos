public class Producto {
    private String codigo;
    private String descripcion;
    private Double precioActual;

    public Double precio() { return precioActual; }

    public void actualizarPrecio(Double nuevoPrecio) {
        this.precioActual = nuevoPrecio;
    }
}
