import java.util.ArrayList;
import java.util.List;

public class Libro {
    private String nombre;
    private Integer anio;
    private List<Autor> autores;
    private Categoria categoria;
    private List<CopiaLibro> copias;

    public Libro(){
        this.autores = new ArrayList<>();
        this.copias = new ArrayList<>();
    }
}
