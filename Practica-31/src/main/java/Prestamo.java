import java.time.LocalDate;

public class Prestamo {
    private LocalDate fechaInicio;
    private LocalDate fechaVencimiento;
    private LocalDate fechaDevolucion;
    private Lector lector;
    private CopiaLibro libro;

    public Prestamo(Lector lector, CopiaLibro copia) {
        this.fechaInicio = LocalDate.now();
        this.fechaVencimiento = fechaInicio.plusDays(30);
        this.lector = lector;
        this.libro = copia;
    }

    public void finalizarPrestamo() {
        this.fechaDevolucion = LocalDate.now();
        if (fechaDevolucion.isAfter(fechaVencimiento)) {
            lector.set
        }

        this.libro.cambiarEstado(Estado.BIBLIOTECA);

    }

    public CopiaLibro getLibro() { return libro; }

    public Lector getLector() { return lector; }
}
