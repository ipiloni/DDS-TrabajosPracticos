package domain;

import domain.utils.BDUtils;

import javax.persistence.EntityManager;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PersistenciaTest {
    public static void main(String[] args) {
        Equipo ferrari = new Equipo("Ferrari");
        Equipo mercedes = new Equipo("Mercedes");
        Equipo rb = new Equipo("Red Bull");
        Equipo aston = new Equipo("Aston Martin");

        Persona carlitos = new Persona("Carlos", "Sainz", TipoDocumento.DNI, 43222444, LocalDate.of(2000, 4, 20), ferrari);
        Persona luis = new Persona("Lewis", "Hamilton", TipoDocumento.CEDULA, 456856, LocalDate.of(1998,5,19), mercedes);
        Persona max = new Persona("Max", "ElCampeon", TipoDocumento.DNI, 42145235, LocalDate.of(1990,2,10), rb);
        Persona fernanfloo = new Persona("Fernando", "Alonso", TipoDocumento.PASAPORTE, 4587895, LocalDate.of(1925, 12, 18), aston);

        Vehiculo elDeCarlos = new Vehiculo("petronas","R4",ferrari);
        Vehiculo elDeLuigi = new Vehiculo("mercedes", "A200", mercedes);
        Vehiculo elDeMaxi = new Vehiculo("Energizante", "RedBull", rb);
        Vehiculo elDeFernando = new Vehiculo("La copia de max", "RedBull", aston);

        EntityManager em = BDUtils.getEntityManager();
        BDUtils.comenzarTransaccion(em);

        em.persist(ferrari);
        em.persist(mercedes);
        em.persist(rb);
        em.persist(aston);
        em.persist(carlitos);
        em.persist(luis);
        em.persist(max);
        em.persist(fernanfloo);
        em.persist(elDeCarlos);
        em.persist(elDeLuigi);
        em.persist(elDeMaxi);
        em.persist(elDeFernando);

        BDUtils.commit(em);
    }
}
