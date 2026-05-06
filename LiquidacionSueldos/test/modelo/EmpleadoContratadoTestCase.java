package modelo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

public class EmpleadoContratadoTestCase {

    private EmpleadoContratado empleado;

    @BeforeEach
    public void setUp() {
        empleado = new EmpleadoContratado(
            "Ana", "Calle 5", "soltera",
            LocalDate.of(1995, 1, 1),
            1000, 123, "transferencia"
        );
    }

    @Test
    public void testCalcularBruto() {
        assertEquals(1000, empleado.calcularBruto());
    }

    @Test
    public void testCalcularRetenciones() {
        assertEquals(50, empleado.calcularRetenciones());
    }

    @Test
    public void testCalcularNeto() {
        // 1000 - 50 = 950
        assertEquals(950, empleado.calcularNeto());
    }
}