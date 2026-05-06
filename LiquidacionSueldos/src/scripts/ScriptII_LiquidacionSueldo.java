package scripts;

import modelo.*;
import java.time.LocalDate;

public class ScriptII_LiquidacionSueldo {

    public static void main(String[] args) {

        Empresa empresa = new Empresa("TechCorp SA", "30-12345678-9");

        empresa.agregarEmpleado(new EmpleadoPermanente(
            "Ana García", "Av. Corrientes 1234", "casada",
            LocalDate.of(1985, 4, 10), 1000, 2, 5));

        empresa.agregarEmpleado(new EmpleadoTemporario(
            "Carlos Ruiz", "Belgrano 789", "soltero",
            LocalDate.of(1992, 6, 20), 1000,
            LocalDate.of(2026, 6, 30), 8));

        empresa.agregarEmpleado(new EmpleadoContratado(
            "Pedro Sosa", "Rivadavia 999", "soltero",
            LocalDate.of(2000, 3, 5), 1000,
            1001, "Transferencia bancaria"));

        // *** DISPARO: liquidación de sueldo ***
        for (Empleado e : empresa.getEmpleados()) {
            Recibo r = empresa.liquidarSueldo(e);
            System.out.println("========================================");
            System.out.println("RECIBO — " + r.getNombreEmpleado());
            System.out.println("Dirección : " + r.getDireccion());
            System.out.println("Emisión   : " + r.getFechaEmision());
            System.out.println("----------------------------------------");
            System.out.println("CONCEPTOS:");
            for (Concepto c : r.getConceptos()) {
                System.out.println("  " + c.getItem() + ": $" + c.getMonto());
            }
            System.out.println("----------------------------------------");
            System.out.println("Bruto : $" + r.getSueldoBruto());
            System.out.println("Neto  : $" + r.getSueldoNeto());
            System.out.println("========================================\n");
        }

        System.out.println("Total recibos generados: " + empresa.getRecibos().size());
    }
}