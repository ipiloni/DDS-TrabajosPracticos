import java.time.LocalDate;

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

    // DIAGRAMA DE SECUENCIA
    public Integer calcularDiasMulta(){
        return fechaDevolucion.compareTo(fechaVencimiento)*2;
    }

    public Lector getLector(){
        return this.lector;
    }

    public Boolean estaRetrasado(){
        return fechaDevolucion.isAfter(fechaVencimiento);
    }
    // DIAGRAMA DE SECUENCIA

    public void finalizar() {
        this.fechaDevolucion = LocalDate.now();
        this.getLibro().setEstado(EstadoCopia.EN_BIBLIOTECA);
        this.lector.descontarPrestamosEnCurso();
    }

    public CopiaLibro getLibro(){
        return this.libro;
    }




}

