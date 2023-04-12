import java.time.LocalDate;

public class TarjetaDeCredito {
    private String numero;
    private LocalDate fechaVencimiento;
    private String nombre;
    private String codigoDeSeguridad;
    private Cliente cliente;

    public Cliente getCliente() { return cliente; }

    public void setCliente(Cliente cliente) { this.cliente = cliente; }

    public Boolean contieneSaldoSuficiente(Double saldoNecesario) {
        // SE DEBE VERIFICAR EL SALDO
        return true;
    }

    public Boolean esValida() {
        // SE DEBE VERIFICAR VALIDEZ
        return true;
    }

    public void pagar(Double precio) {
        if(this.contieneSaldoSuficiente(precio)) {
            // PAGAR A TRAVES DE UNA API
        } else throw new RuntimeException("La tarjeta no contiene suficiente saldo.");
    }
}
