package ar.edu.unq.po2.tp3.equipo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EquipoDeTrabajoTestCase {

    private EquipoDeTrabajo equipo;

    @BeforeEach
    public void setUp() {
        equipo = new EquipoDeTrabajo("Team Alpha");

        equipo.agregarIntegrante(new Persona("Juan",   "Lopez",    20));
        equipo.agregarIntegrante(new Persona("Maria",  "Garcia",   30));
        equipo.agregarIntegrante(new Persona("Pedro",  "Martinez", 40));
        equipo.agregarIntegrante(new Persona("Ana",    "Rodriguez",25));
        equipo.agregarIntegrante(new Persona("Carlos", "Fernandez",35));
    }

    @Test
    public void testGetNombre() {
        assertEquals("Team Alpha", equipo.getNombre());
    }

    @Test
    public void testPromedioEdad() {
        // (20 + 30 + 40 + 25 + 35) / 5 = 150 / 5 = 30.0
        assertEquals(30.0, equipo.promedioEdad());
    }

    @Test
    public void testCantidadIntegrantes() {
        assertEquals(5, equipo.getIntegrantes().size());
    }

    @Test
    public void testImprimirPromedio() {
        // punto 5 del enunciado
        System.out.println("Promedio de edad del equipo '"
            + equipo.getNombre() + "': "
            + equipo.promedioEdad());
    }
}