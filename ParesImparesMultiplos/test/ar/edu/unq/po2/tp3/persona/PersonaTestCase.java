package ar.edu.unq.po2.tp3.persona;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

public class PersonaTestCase {

    private Persona joven;
    private Persona mayor;

    @BeforeEach
    public void setUp() {
        joven = new Persona("Juan", LocalDate.of(2000, 1, 1));
        mayor = new Persona("Carlos", LocalDate.of(1970, 1, 1));
    }

    @Test
    public void testGetNombre() {
        assertEquals("Juan", joven.getNombre());
    }

    @Test
    public void testGetFechaNacimiento() {
        assertEquals(LocalDate.of(2000, 1, 1), joven.getFechaNacimiento());
    }

    @Test
    public void testGetEdad() {
        assertEquals(26, joven.getEdad());
    }

    @Test
    public void testMenorQue() {
        assertTrue(joven.menorQue(mayor));
        assertFalse(mayor.menorQue(joven));
    }
}