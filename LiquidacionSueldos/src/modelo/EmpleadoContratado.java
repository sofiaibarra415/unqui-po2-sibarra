package modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EmpleadoContratado extends Empleado {
    private int nroContrato;
    private String medioDePago;

    public EmpleadoContratado(String nombre, String direccion, String estadoCivil,
                               LocalDate fechaNac, int sueldoBasico,
                               int nroContrato, String medioDePago) {
        super(nombre, direccion, estadoCivil, fechaNac, sueldoBasico);
        this.nroContrato = nroContrato;
        this.medioDePago = medioDePago;
    }

    @Override
    public int calcularBruto() {
        return sueldoBasico;
    }

    @Override
    public int calcularRetenciones() {
        return 50;
    }

    @Override
    public List<Concepto> getConceptos() {
        List<Concepto> lista = new ArrayList<>();
        lista.add(new Concepto("Sueldo Básico", sueldoBasico));
        lista.add(new Concepto("Gastos Administrativos Contractuales", -50));
        return lista;
    }

    public int getNroContrato()    { return nroContrato; }
    public String getMedioDePago() { return medioDePago; }
}