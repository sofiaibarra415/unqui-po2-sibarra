package supermercado;

public class ProductoPrimeraNecesidad extends Producto {

    public ProductoPrimeraNecesidad(String nombre, double precio, boolean precioCuidado) {
        super(nombre, precio * 0.9, precioCuidado);
    }
}