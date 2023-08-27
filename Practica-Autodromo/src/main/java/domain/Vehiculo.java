package domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import javax.persistence.*;

@Entity
@Table(name = "vehiculo")
public class Vehiculo {
    @Id
    @GeneratedValue
    @Setter @Getter
    private Integer idVehiculo;

    @Column(name = "marca")
    @Setter @Getter
    private String marca;

    @Column(name = "modelo")
    @Setter @Getter
    private String modelo;

    @ManyToOne
    @JoinColumn(name = "idEquipo", referencedColumnName = "idEquipo")
    @Getter @Setter
    private Equipo equipo;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, Equipo equipo){
        this.marca = marca;
        this.modelo = modelo;
        this.equipo = equipo;
        equipo.agregarVehiculo(this);
    }

}
