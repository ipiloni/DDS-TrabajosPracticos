import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Lector {
    private String nombre;
    private List<Prestamo> prestamos;
    private Multa multaActual;
    private Integer prestamosEnCurso;

    public Lector(){
        this.prestamos = new ArrayList<>();
        this.multas = new ArrayList<>();
        this.prestamosEnCurso = 0;
    }

    public Multa getMultaActual(){
        return this.multaActual;
    }
    public void serMultado(Multa multa) {
        this.multas.add(multa);
    }

    public Integer getPrestamosEnCurso() { return this.prestamosEnCurso; }

    public Boolean quedanDiasDeMulta() {
        if (this.multas.stream().filter(m -> m.getDiasRestantes() > 0).count() > 0) {
            return true;
        } else {
            return false;
        }
    }

    public Boolean devolvioATiempo() {
        List<Prestamo> prestamosAtrasados = (List<Prestamo>) this.prestamos.stream().filter(prestamo -> LocalDate.now().isAfter(prestamo.getFechaVencimiento()));
        prestamosAtrasados.forEach(p -> p.getLibro().setEstado(EstadoCopia.CON_RETRASO));
        if (prestamosAtrasados.size() > 0) {
            return false;
        } else return true;
    }

    public void agregarPrestamo(Prestamo nuevoPrestamo){
        this.prestamos.add(nuevoPrestamo);
        this.prestamosEnCurso++;
    }

    public void descontarPrestamosEnCurso() {
        this.prestamosEnCurso--;
    }
}
