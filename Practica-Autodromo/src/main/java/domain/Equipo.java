package domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="equipo")
public class Equipo {
    @Id
    @GeneratedValue
    private Integer idEquipo;

    @Column(name="nombre")
    @Setter @Getter
    private String nombre;

    @OneToMany(mappedBy = "equipo", cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    @Setter @Getter
    private List<Persona> integrantes;

    @Setter @Getter
    @OneToMany(mappedBy = "equipo", cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    private List<Vehiculo> vehiculos;

    public Equipo() {
        this.integrantes = new ArrayList<>();
        this.vehiculos = new ArrayList<>();
    }

    public Equipo(String nombre) {
        this.integrantes = new ArrayList<>();
        this.vehiculos = new ArrayList<>();
        this.setNombre(nombre);
    }

    public void agregarPersona(Persona persona) {
        this.integrantes.add(persona);
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        this.vehiculos.add(vehiculo);
    }
}
