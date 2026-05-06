package supermercado;

import java.util.ArrayList;

public class Supermercado {

    private String nombre;
    private String direccion;
    private ArrayList<Producto> productos;

    public Supermercado(String nombre, String direccion) {
        this.nombre    = nombre;
        this.direccion = direccion;
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public int getCantidadDeProductos() {
        return productos.size();
    }

    public double getPrecioTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.getPrecio();
        }
        return total;
    }

    public String getNombre()   { return nombre; }
    public String getDireccion() { return direccion; }
}