package scripts;

import modelo.*;
import java.time.LocalDate;

public class ScriptI_TotalSueldosNetos {

    public static void main(String[] args) {

        Empresa empresa = new Empresa("TechCorp SA", "30-12345678-9");

        // Permanente: casada, 2 hijos, 5 años antigüedad
        // Bruto: 1000 + (2*150) + 100 + (5*50) = 1000+300+100+250 = 1650
        empresa.agregarEmpleado(new EmpleadoPermanente(
            "Ana García", "Av. Corrientes 1234", "casada",
            LocalDate.of(1985, 4, 10), 1000, 2, 5));

        // Permanente: soltero, 0 hijos, 2 años antigüedad
        // Bruto: 1000 + 0 + 0 + (2*50) = 1100
        empresa.agregarEmpleado(new EmpleadoPermanente(
            "Luis Pérez", "Calle Falsa 123", "soltero",
            LocalDate.of(1990, 8, 22), 1000, 0, 2));

        // Temporario: 30 años, 10 horas extra
        // Bruto: 1000 + (10*40) = 1400
        empresa.agregarEmpleado(new EmpleadoTemporario(
            "María López", "San Martín 456", "divorciada",
            LocalDate.of(1995, 2, 15), 1000,
            LocalDate.of(2026, 12, 31), 10));

        // Contratado
        // Bruto: 1000, Retención: $50 fijos
        empresa.agregarEmpleado(new EmpleadoContratado(
            "Pedro Sosa", "Rivadavia 999", "soltero",
            LocalDate.of(2000, 3, 5), 1000,
            1001, "Transferencia bancaria"));

        // *** DISPARO: cálculo total sueldos netos ***
        System.out.println("=== RESUMEN DE SUELDOS — " + empresa.getNombre() + " ===");
        System.out.println("Empleados    : " + empresa.getEmpleados().size());
        System.out.println("Total Bruto  : $" + empresa.calcularSueldosBrutos());
        System.out.println("Total Retenc.: $" + empresa.calcularRetenciones());
        System.out.println("TOTAL NETO   : $" + empresa.calcularSueldosNetos());
    }
}