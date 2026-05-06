package modelo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

public class EmpleadoTemporarioTestCase {

    private EmpleadoTemporario empleado;

    @BeforeEach
    public void setUp() {
        // menor de 50 años, 5 horas extra, sueldo básico 1000
        empleado = new EmpleadoTemporario(
            "Maria", "Calle 3", "soltera",
            LocalDate.of(1995, 1, 1),
            1000,
            LocalDate.of(2025, 12, 31),
            5
        );
    }

    @Test
    public void testCalcularBruto() {
        // 1000 + (5*40) = 1200
        assertEquals(1200, empleado.calcularBruto());
    }

    @Test
    public void testCalcularRetenciones() {
        // 10% de 1200 + 10% de 1200 + (5*5)
        // 120 + 120 + 25 = 265
        assertEquals(265, empleado.calcularRetenciones());
    }

    @Test
    public void testCalcularNeto() {
        // 1200 - 265 = 935
        assertEquals(935, empleado.calcularNeto());
    }

    @Test
    public void testMayorDe50() {
        EmpleadoTemporario mayor = new EmpleadoTemporario(
            "Carlos", "Calle 4", "casado",
            LocalDate.of(1970, 1, 1),
            1000,
            LocalDate.of(2025, 12, 31),
            0
        );
        // 10% de 1000 + 25 + 10% de 1000 + 0
        // 100 + 25 + 100 = 225
        assertEquals(225, mayor.calcularRetenciones());
    }
}