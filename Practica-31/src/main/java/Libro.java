import java.util.List;

public class Libro {
    private String nombre;
    private Categoria categoria;
    private List<Autor> autores;
    private Integer anio;
    private List<CopiaLibro> copias;

    public List<CopiaLibro> getCopias() {
        return copias;
    }
}
