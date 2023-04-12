import java.util.List;

public class Cliente {
    private String nombre;
    private String apellido;
    private List<Direccion> direccionesCobro;
    private List<Direccion> direccionesEnvio;
    private String email;
    private Boolean esPreferencial = false;
    private TarjetaDeCredito tarjetaDeCredito;

    public void setPreferencial(Boolean estado) { this.esPreferencial = estado; }

    public Boolean esPreferencial() { return this.esPreferencial; }

    public void agregarTarjeta(TarjetaDeCredito tarjeta) {
        if (tarjeta.esValida()) {
            this.tarjetaDeCredito = tarjeta;
        }
    }
}
