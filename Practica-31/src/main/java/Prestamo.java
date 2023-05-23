import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;

public class Prestamo{
    private CopiaLibro libro;
    private LocalDate fechaAlta;
    private LocalDate fechaVencimiento;
    private LocalDate fechaDevolucion;
    private Lector lector;

    public Prestamo(CopiaLibro libro, Lector lector) {
        this.libro = libro;
        this.fechaAlta = LocalDate.now();
        this.fechaVencimiento = LocalDate.now().plusDays(30);
        this.libro.setEstado(EstadoCopia.PRESTADA);
        this.lector = lector;
    }

    public void finalizarPrestamo() {
        this.fechaDevolucion = LocalDate.now();
        this.getLibro().setEstado(EstadoCopia.EN_BIBLIOTECA);
        if(fechaDevolucion.isAfter(fechaVencimiento)) { // esta parte va en otro lado
            this.crearMulta(lector);
        }
        this.lector.descontarPrestamosEnCurso();
    }

    public void crearMulta(Lector lector) {
        Multa multa = new Multa(this.calcularDiasMulta());
        lector.serMultado(multa);
    }

    public Integer calcularDiasMulta(){
        return fechaDevolucion.compareTo(fechaVencimiento)*2;
    }

    public CopiaLibro getLibro(){
        return this.libro;
    }


    public LocalDate getFechaVencimiento() {
        return this.fechaVencimiento;
    }

    public LocalDate getFechaDevolucion() {
        return this.fechaDevolucion;
    }

    public Lector getLector(){
        return this.lector;
    }
}

