import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private String apellido;
    private List<CarritoDeCompras> carritos;
    private Direccion direccionCobro;
    private Direccion direccionEnvio;
    private String email;
    private Boolean esPreferencial = false;
    private TarjetaDeCredito tarjetaDeCredito;

    public Cliente() {
        this.carritos = new ArrayList<>();
    }

    public void agregarTarjeta(TarjetaDeCredito tarjeta) {
        if (tarjeta.esValida()) {
            this.tarjetaDeCredito = tarjeta;
        }
    }

    public void agregarItemACarrito(Item producto, CarritoDeCompras carrito) {
        carrito.agregarProducto(producto);
    }

    public void crearNuevoCarrito() {
        CarritoDeCompras nuevoCarrito = new CarritoDeCompras();
        carritos.add(nuevoCarrito);
    }

    public void serPreferencial() { this.esPreferencial = true; }

    public Boolean esPreferencial() { return this.esPreferencial; }

    public void solicitarCompra(CarritoDeCompras carrito) {
        if (carritos.contains(carrito)) {
            carrito.pagar(tarjetaDeCredito);
        } else throw new RuntimeException("No se puede pagar un carrito qeue no es propio.");
    }
}
