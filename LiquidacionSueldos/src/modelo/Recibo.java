package modelo;

import java.time.LocalDate;
import java.util.List;

public class Recibo {
    private String nombreEmpleado;
    private String direccion;
    private LocalDate fechaEmision;
    private int sueldoBruto;
    private int sueldoNeto;
    private List<Concepto> conceptos;

    public Recibo(Empleado empleado) {
        this.nombreEmpleado = empleado.getNombre();
        this.direccion      = empleado.getDireccion();
        this.fechaEmision   = LocalDate.now();
        this.sueldoBruto    = empleado.calcularBruto();
        this.sueldoNeto     = empleado.calcularNeto();
        this.conceptos      = empleado.getConceptos();
    }

    public String getNombreEmpleado()    { return nombreEmpleado; }
    public String getDireccion()         { return direccion; }
    public LocalDate getFechaEmision()   { return fechaEmision; }
    public int getSueldoBruto()          { return sueldoBruto; }
    public int getSueldoNeto()           { return sueldoNeto; }
    public List<Concepto> getConceptos() { return conceptos; }
}