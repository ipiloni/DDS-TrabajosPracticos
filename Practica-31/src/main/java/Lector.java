import java.util.ArrayList;
import java.util.List;

public class Lector {
    private String nombre;
    private List<Prestamo> prestamos;
    private Multa multaActual;
    private Integer prestamosEnCurso;

    public Lector(){
        this.prestamos = new ArrayList<>();
        this.multaActual = new Multa(0);
        this.prestamosEnCurso = 0;
    }

    // DIAGRAMA DE SECUENCIA
    public Multa getMultaActual(){
        return this.multaActual;
    }
    public void serMultado(Multa multa) {
        this.multaActual = multa;
    }
    // DIAGRAMA DE SECUENCIA

    public Integer getPrestamosEnCurso() { return this.prestamosEnCurso; }

    public Boolean devolvioATiempo() {
        List<Prestamo> prestamosAtrasados = (List<Prestamo>) this.prestamos.stream().filter(prestamo -> prestamo.estaRetrasado());
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
