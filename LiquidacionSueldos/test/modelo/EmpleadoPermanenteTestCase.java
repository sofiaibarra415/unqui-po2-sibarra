package modelo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

public class EmpleadoPermanenteTestCase {

    private EmpleadoPermanente empleado;

    @BeforeEach
    public void setUp() {
        // casado, 2 hijos, 5 años antigüedad, sueldo básico 1000
        empleado = new EmpleadoPermanente(
            "Juan", "Calle 1", "casado",
            LocalDate.of(1990, 1, 1),
            1000, 2, 5
        );
    }

    @Test
    public void testCalcularBruto() {
        // 1000 + (2*150) + 100 + (5*50) = 1000+300+100+250 = 1650
        assertEquals(1650, empleado.calcularBruto());
    }

    @Test
    public void testCalcularRetenciones() {
        // 10% de 1650 + (2*20) + 15% de 1650
        // 165 + 40 + 247 = 452
        assertEquals(452, empleado.calcularRetenciones());
    }

    @Test
    public void testCalcularNeto() {
        // 1650 - 452 = 1198
        assertEquals(1198, empleado.calcularNeto());
    }

    @Test
    public void testSinConyuge() {
        EmpleadoPermanente soltero = new EmpleadoPermanente(
            "Pedro", "Calle 2", "soltero",
            LocalDate.of(1990, 1, 1),
            1000, 0, 0
        );
        // 1000 (sin hijos, sin cónyuge, sin antigüedad)
        assertEquals(1000, soltero.calcularBruto());
    }
}
