import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private String apellido;
    private List<Direccion> direccionesCobro;
    private List<Direccion> direccionesEnvio;
    private List<CarritoDeCompras> carritos;
    private String email;
    private Boolean esPreferencial = false;
    private TarjetaDeCredito tarjetaDeCredito;

    public Cliente(String nombre, String apellido, String email, TarjetaDeCredito tarjetaDeCredito) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccionesCobro = new ArrayList<>();
        this.direccionesEnvio = new ArrayList<>();
        this.carritos = new ArrayList<>();
        this.email = email;
        this.tarjetaDeCredito = tarjetaDeCredito;
    }

    public void agregarCarrito(CarritoDeCompras carrito){
        carritos.add(carrito);
    }

    public void setPreferencial(Boolean estado) { this.esPreferencial = estado; }

    public Boolean esPreferencial() { return this.esPreferencial; }

    public void agregarTarjeta(TarjetaDeCredito tarjeta) {
        if (tarjeta.esValida()) {
            tarjeta.setCliente(this);
            this.tarjetaDeCredito = tarjeta;
        }
    }
}
