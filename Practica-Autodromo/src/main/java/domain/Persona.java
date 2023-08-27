package domain;

import lombok.Getter;
import lombok.Setter;
import retrofit2.http.GET;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="persona")
public class Persona {
    
    @Id
    @GeneratedValue
    private Integer idPersona;

    @Column(name = "nombre")
    @Setter @Getter
    private String nombre;

    @Setter @Getter
    @Column(name = "apellido")
    private String apellido;

    @Enumerated(EnumType.STRING)
    @Setter @Getter
    private TipoDocumento tipoDocumento;

    @Column(name = "nroDocumento")
    @Setter @Getter
    private Integer nroDocumento;

    @Column(name = "fechaDeNacimiento")
    @Setter @Getter
    private LocalDate fechaDeNacimiento;

    @ManyToOne
    @JoinColumn(name="idEquipo", referencedColumnName="idEquipo")
    @Setter @Getter
    private Equipo equipo;

    public Persona() {
    }

    public Persona(String nombre, String apellido, TipoDocumento tipo, Integer nro, LocalDate fecha, Equipo equipo) {
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setTipoDocumento(tipo);
        this.setNroDocumento(nro);
        this.setFechaDeNacimiento(fecha);
        this.setEquipo(equipo);
        equipo.agregarPersona(this);
    }

}
