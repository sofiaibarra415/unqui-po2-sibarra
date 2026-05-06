package modelo;

public class Concepto {
    private String item;
    private int monto;

    public Concepto(String item, int monto) {
        this.item  = item;
        this.monto = monto;
    }

    public String getItem() { return item; }
    public int getMonto()   { return monto; }
}