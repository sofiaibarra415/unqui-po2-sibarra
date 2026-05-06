package modelo;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nombre;
    private String cuit;
    private List<Empleado> empleados;
    private List<Recibo>   recibos;

    public Empresa(String nombre, String cuit) {
        this.nombre    = nombre;
        this.cuit      = cuit;
        this.empleados = new ArrayList<>();
        this.recibos   = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado e) {
        empleados.add(e);
    }

    public int calcularSueldosNetos() {
        int total = 0;
        for (Empleado e : empleados) total += e.calcularNeto();
        return total;
    }

    public int calcularSueldosBrutos() {
        int total = 0;
        for (Empleado e : empleados) total += e.calcularBruto();
        return total;
    }

    public int calcularRetenciones() {
        int total = 0;
        for (Empleado e : empleados) total += e.calcularRetenciones();
        return total;
    }

    public Recibo liquidarSueldo(Empleado e) {
        Recibo r = new Recibo(e);
        recibos.add(r);
        return r;
    }

    public List<Empleado> getEmpleados() { return empleados; }
    public List<Recibo>   getRecibos()   { return recibos; }
    public String getNombre()            { return nombre; }
    public String getCuit()              { return cuit; }
}