import java.util.List;
import java.util.stream.Collectors;

public class Biblioteca {
    private List<Libro> libros;
    private List<Lector> lectores;

    public void prestarLibro(Libro libro, Lector lector) {
        if (this.hayDisponibilidad(libro) && lector.cumpleCondicionesDePrestamo()) {
            Prestamo nuevoPrestamo = new Prestamo(lector, this.getCopiaLibro(libro));
            this.getCopiaLibro(libro).cambiarEstado(Estado.PRESTADO);
            lector.agregarPrestamo(nuevoPrestamo);
        } else throw new RuntimeException("No se puede realizar el prestamo.");
    }

    public void recibirPrestamo(Prestamo prestamo) {
        prestamo.finalizarPrestamo();
    }

    public CopiaLibro getCopiaLibro(Libro libro) {
        return libro.getCopias().stream().filter(copiaLibro -> copiaLibro.getEstado() == Estado.BIBLIOTECA).collect(Collectors.toList()).get(0);
    }

    public Boolean hayDisponibilidad(Libro libro) {
        if (libro.getCopias().stream().anyMatch(l -> l.getEstado() == Estado.BIBLIOTECA)) {
            return true;
        } else return false;
    }
}
