package modelo;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class EmpleadoTemporario extends Empleado {
    private LocalDate fechaFinDesignacion;
    private int cantHorasExtra;

    public EmpleadoTemporario(String nombre, String direccion, String estadoCivil,
                               LocalDate fechaNac, int sueldoBasico,
                               LocalDate fechaFinDesignacion, int cantHorasExtra) {
        super(nombre, direccion, estadoCivil, fechaNac, sueldoBasico);
        this.fechaFinDesignacion = fechaFinDesignacion;
        this.cantHorasExtra      = cantHorasExtra;
    }

    @Override
    public int calcularBruto() {
        int bruto = sueldoBasico;
        bruto += cantHorasExtra * 40;
        return bruto;
    }

    @Override
    public int calcularRetenciones() {
        int edad = Period.between(fechaNac, LocalDate.now()).getYears();
        int ret  = 0;
        ret += (int)(calcularBruto() * 0.10);
        if (edad > 50) {
            ret += 25;
        }
        ret += (int)(calcularBruto() * 0.10);
        ret += cantHorasExtra * 5;
        return ret;
    }

    @Override
    public List<Concepto> getConceptos() {
        int edad = Period.between(fechaNac, LocalDate.now()).getYears();
        List<Concepto> lista = new ArrayList<>();
        // Bruto
        lista.add(new Concepto("Sueldo Básico", sueldoBasico));
        lista.add(new Concepto("Horas Extra (" + cantHorasExtra + "hs)", cantHorasExtra * 40));
        // Retenciones
        lista.add(new Concepto("Obra Social (10% bruto)", -(int)(calcularBruto() * 0.10)));
        if (edad > 50) {
            lista.add(new Concepto("Obra Social adicional (+50 años)", -25));
        }
        lista.add(new Concepto("Aportes Jubilatorios (10% bruto)", -(int)(calcularBruto() * 0.10)));
        lista.add(new Concepto("Jubilación por hora extra (" + cantHorasExtra + "hs)", -(cantHorasExtra * 5)));
        return lista;
    }

    public LocalDate getFechaFinDesignacion() { return fechaFinDesignacion; }
    public int getCantHorasExtra()            { return cantHorasExtra; }
}