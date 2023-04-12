import java.util.List;

public class Lector {
    private String nombre;
    private Integer cantidadDeLibros;
    private List<Prestamo> prestamos;
    private Boolean habilitado;


    public Boolean cumpleCondicionesDePrestamo() {
        return cantidadDeLibros < 3 && habilitado;
    }

    public void agregarPrestamo(Prestamo prestamo) {
        prestamos.add(prestamo);
        cantidadDeLibros++;
    }

    public void setHabilitado(Boolean habilitado) { this.habilitado = habilitado; }
}
