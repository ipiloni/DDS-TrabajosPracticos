public class Item {
    private Producto producto;
    private Integer cantidad;
    private Double precioUnitario;

    public void setProducto(Producto producto) { this.producto = producto; }

    public Producto getProducto() { return producto; }

    public Double precioTotal() {
        this.precioUnitario = producto.precio();
        return precioUnitario * cantidad;
    }
}
