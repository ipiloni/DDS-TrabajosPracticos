import java.util.ArrayList;
import java.util.List;

public class CarritoDeCompras {
    private Cliente cliente;
    private List<Item> productos;
    private Double descuento;

    public CarritoDeCompras() {
        this.productos = new ArrayList<>();
    }

    public Cliente getCliente() { return cliente; }

    public void setCliente(Cliente cliente) { this.cliente = cliente; }

    public void agregarProducto(Item producto) {
        productos.add(producto);
    }

    public Double precioCarrito() {
        this.descuento();
        return productos.stream().mapToDouble(p -> p.precioTotal()).sum() - descuento;
    }

    public void descuento() {
        if (cliente.esPreferencial()) descuento = 10.0;
        else descuento = 0.0;
    }

    public void pagar(TarjetaDeCredito tarjeta) {
        if (tarjeta.contieneSaldoSuficiente(this.precioCarrito())) {
            tarjeta.pagar(this.precioCarrito());
        } else throw new RuntimeException("No tiene saldo suficiente.");
    }

}
