import java.util.ArrayList;
import java.util.List;
import java.lang.Exception;

public class RepoBiblioteca {
    private List<Lector> lectores;
    private List<CopiaLibro> libros;
    
    private static RepoBiblioteca instancia = null;

    public static RepoBiblioteca getInstancia(){
        if(instancia == null){
            instancia = new RepoBiblioteca();
        }
        return instancia;
    }
    private RepoBiblioteca(){
        this.lectores = new ArrayList<>();
        this.libros = new ArrayList<>();
    }

    public void prestarLibro(Lector lector, CopiaLibro copia) throws Exception {
        if (!lector.quedanDiasDeMulta() && lector.devolvioATiempo() && lector.getPrestamosEnCurso() < 3) {
            Prestamo prestamo = new Prestamo(copia, lector);
            lector.agregarPrestamo(prestamo);
        } else throw new Exception("El lector se encuentra inhabilitado.");
    }

    public void recibirLibro(Prestamo prestamo) {
        prestamo.finalizarPrestamo();
    }

}
