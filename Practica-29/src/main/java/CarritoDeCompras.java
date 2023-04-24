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

    public void agregarItem(Item item) {
        productos.add(item);
    }

    public Double precioCarrito() {
        this.descuento();
        return productos.stream().mapToDouble(p -> p.precioTotal()).sum() - descuento;
    }

    public void descuento() {
        // EL DESCUENTO ESTA HARDCODEADO
        if (cliente.esPreferencial()) descuento = 10.0;
        else descuento = 0.0;
    }

    public void solicitarCompra(TarjetaDeCredito tarjeta) {
        tarjeta.pagar(this.precioCarrito());
    }

}
