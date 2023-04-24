package domain;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BibliotecaTest {
    public static void main(String[] args) throws IOException {



        /* DEJO COMENTADO UNOS TEST ANTERIORES */

/*      Pais argentina = new Pais(1, "Argentina");
        Provincia caba = new Provincia(174, "CABA", argentina);
        Municipio m_caba = new Municipio(241, "CABA", caba);
        Localidad palermo = new Localidad(5354, "Palermo", 2659, m_caba);
        Ubicacion ubicacion = new Ubicacion(argentina, caba, m_caba, palermo, "A", 20);

        SectorTerritorial sectorTerritorial = new SectorTerritorial(caba);
        AgenteSectorial agenteSectorial = new AgenteSectorial(sectorTerritorial);

        Organizacion google   = new Organizacion("Google",   EMPRESA, ubicacion, EMPRESA_SECTOR_PRIMARIO);
        Organizacion apple    = new Organizacion("Apple",    EMPRESA, ubicacion, EMPRESA_SECTOR_PRIMARIO);
        Organizacion ibm      = new Organizacion("IBM",      EMPRESA, ubicacion, EMPRESA_SECTOR_PRIMARIO);
        Organizacion facebook = new Organizacion("Facebook", EMPRESA, ubicacion, EMPRESA_SECTOR_PRIMARIO);

        google.cargarExcel("src/main/resources/TestDA11Mediciones.xlsx");
        apple.cargarExcel("src/main/resources/TestDA11Mediciones.xlsx");
        ibm.cargarExcel("src/main/resources/TestDA11Mediciones.xlsx");
        facebook.cargarExcel("src/main/resources/TestDA11Mediciones.xlsx");

        List<Organizacion> organizaciones = new ArrayList<>();
        Collections.addAll(organizaciones, google, apple, ibm, facebook);

        System.out.println(agenteSectorial.calcularHC(2020, organizaciones));*/
    }
}
