package modelo;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

public abstract class Empleado {
    protected String nombre;
    protected String direccion;
    protected String estadoCivil;
    protected LocalDate fechaNac;
    protected int sueldoBasico;

    public Empleado(String nombre, String direccion, String estadoCivil,
                    LocalDate fechaNac, int sueldoBasico) {
        this.nombre       = nombre;
        this.direccion    = direccion;
        this.estadoCivil  = estadoCivil;
        this.fechaNac     = fechaNac;
        this.sueldoBasico = sueldoBasico;
    }

    public int calcularEdad() {
        return Period.between(fechaNac, LocalDate.now()).getYears();
    }

    public abstract int calcularBruto();
    public abstract int calcularRetenciones();
    public abstract List<Concepto> getConceptos();

    public int calcularNeto() {
        return calcularBruto() - calcularRetenciones();
    }

    public String getNombre()    { return nombre; }
    public String getDireccion() { return direccion; }
    public int getSueldoBasico() { return sueldoBasico; }
}