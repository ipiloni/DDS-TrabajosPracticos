import java.time.LocalDate;

public class Multa {
    private LocalDate fechaAltaMulta;
    private LocalDate fechaFinMulta;

    // DIAGRAMA DE SECUENCIA
    public Multa(Integer diasDeMulta) {
        this.fechaAltaMulta = LocalDate.now();
        this.fechaFinMulta = LocalDate.now().plusDays(diasDeMulta);
    }

    public Integer getDiasRestantes() {
        return LocalDate.now().compareTo(fechaFinMulta);
    }
    // DIAGRAMA DE SECUENCIA
}
