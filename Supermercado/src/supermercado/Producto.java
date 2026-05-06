package supermercado;

public class Producto {

    private String nombre;
    private double precio;
    private boolean precioCuidado;

    public Producto(String nombre, double precio, boolean precioCuidado) {
        this.nombre        = nombre;
        this.precio        = precio;
        this.precioCuidado = precioCuidado;
    }

    // constructor sin precioCuidado → false por defecto
    public Producto(String nombre, double precio) {
        this(nombre, precio, false);
    }

    public void aumentarPrecio(double aumento) {
        this.precio += aumento;
    }

    public String getNombre()      { return nombre; }
    public double getPrecio()      { return precio; }
    public boolean esPrecioCuidado() { return precioCuidado; }
}