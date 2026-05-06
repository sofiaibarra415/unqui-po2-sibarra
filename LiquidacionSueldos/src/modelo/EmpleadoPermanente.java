package modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EmpleadoPermanente extends Empleado {
    private int cantidadHijos;
    private int antiguedad;

    public EmpleadoPermanente(String nombre, String direccion, String estadoCivil,
                               LocalDate fechaNac, int sueldoBasico,
                               int cantidadHijos, int antiguedad) {
        super(nombre, direccion, estadoCivil, fechaNac, sueldoBasico);
        this.cantidadHijos = cantidadHijos;
        this.antiguedad    = antiguedad;
    }

    @Override
    public int calcularBruto() {
        int bruto = sueldoBasico;
        bruto += cantidadHijos * 150;
        if (estadoCivil.equalsIgnoreCase("casado") ||
            estadoCivil.equalsIgnoreCase("casada")) {
            bruto += 100;
        }
        bruto += antiguedad * 50;
        return bruto;
    }

    @Override
    public int calcularRetenciones() {
        int ret = 0;
        ret += (int)(calcularBruto() * 0.10);
        ret += cantidadHijos * 20;
        ret += (int)(calcularBruto() * 0.15);
        return ret;
    }

    @Override
    public List<Concepto> getConceptos() {
        List<Concepto> lista = new ArrayList<>();
        // Bruto
        lista.add(new Concepto("Sueldo Básico", sueldoBasico));
        lista.add(new Concepto("Asignación por hijo (" + cantidadHijos + ")", cantidadHijos * 150));
        if (estadoCivil.equalsIgnoreCase("casado") ||
            estadoCivil.equalsIgnoreCase("casada")) {
            lista.add(new Concepto("Asignación por cónyuge", 100));
        }
        lista.add(new Concepto("Antigüedad (" + antiguedad + " años)", antiguedad * 50));
        // Retenciones
        lista.add(new Concepto("Obra Social (10% bruto)", -(int)(calcularBruto() * 0.10)));
        lista.add(new Concepto("Obra Social por hijo (" + cantidadHijos + ")", -(cantidadHijos * 20)));
        lista.add(new Concepto("Aportes Jubilatorios (15% bruto)", -(int)(calcularBruto() * 0.15)));
        return lista;
    }

    public int getCantidadHijos() { return cantidadHijos; }
    public int getAntiguedad()    { return antiguedad; }
}