package modelo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

public class EmpresaTestCase {

    private Empresa empresa;
    private EmpleadoPermanente permanente;
    private EmpleadoTemporario temporario;
    private EmpleadoContratado contratado;

    @BeforeEach
    public void setUp() {
        empresa = new Empresa("MiEmpresa", "30-12345678-9");

        permanente = new EmpleadoPermanente(
            "Juan", "Calle 1", "casado",
            LocalDate.of(1990, 1, 1),
            1000, 2, 5
        );

        temporario = new EmpleadoTemporario(
            "Maria", "Calle 3", "soltera",
            LocalDate.of(1995, 1, 1),
            1000,
            LocalDate.of(2025, 12, 31),
            5
        );

        contratado = new EmpleadoContratado(
            "Ana", "Calle 5", "soltera",
            LocalDate.of(1995, 1, 1),
            1000, 123, "transferencia"
        );

        empresa.agregarEmpleado(permanente);
        empresa.agregarEmpleado(temporario);
        empresa.agregarEmpleado(contratado);
    }

    @Test
    public void testTotalBrutos() {
        // 1650 + 1200 + 1000 = 3850
        assertEquals(3850, empresa.calcularSueldosBrutos());
    }

    @Test
    public void testTotalRetenciones() {
        // 452 + 265 + 50 = 767
        assertEquals(767, empresa.calcularRetenciones());
    }

    @Test
    public void testTotalNetos() {
        // 1198 + 935 + 950 = 3083
        assertEquals(3083, empresa.calcularSueldosNetos());
    }

    @Test
    public void testLiquidarSueldo() {
        Recibo recibo = empresa.liquidarSueldo(permanente);
        assertEquals("Juan", recibo.getNombreEmpleado());
        assertEquals(1650, recibo.getSueldoBruto());
        assertEquals(1198, recibo.getSueldoNeto());
    }

    @Test
    public void testCantidadRecibos() {
        empresa.liquidarSueldo(permanente);
        empresa.liquidarSueldo(temporario);
        assertEquals(2, empresa.getRecibos().size());
    }
}