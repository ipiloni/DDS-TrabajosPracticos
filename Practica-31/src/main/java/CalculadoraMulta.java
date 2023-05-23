import java.time.LocalDate;

public class CalculadoraMulta {
    private Prestamo prestamo;

    public LocalDate getFechaDevolucion(Prestamo prestamo){
        return prestamo.getFechaDevolucion();
    }

    public LocalDate getFechaVencimiento(Prestamo prestamo){
        return prestamo.getFechaVencimiento();
    }
    public Multa CalcularMulta(Prestamo prestamo){
        if(compararFechas(prestamo)){
            if(this.chequearMultaMasGrande(prestamo)){
                Multa multa = new Multa(prestamo.calcularDiasMulta());
                prestamo.getLector().serMultado(multa);
                return multa;
            }
        }
        return prestamo.getLector().getMultaActual();
    }
    public boolean compararFechas(Prestamo prestamo){
        return (this.getFechaVencimiento(prestamo)).isAfter(this.getFechaDevolucion(prestamo));
    }

    public boolean chequearMultaMasGrande(Prestamo prestamo){
        return prestamo.getLector().getMultaActual().getDiasRestantes()<prestamo.calcularDiasMulta();
    }

}
