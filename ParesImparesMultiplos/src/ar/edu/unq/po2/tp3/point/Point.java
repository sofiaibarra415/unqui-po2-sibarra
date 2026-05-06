package ar.edu.unq.po2.tp3.point;

public class Point {

    private int x;
    private int y;

    // Constructor con parámetros
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Constructor sin parámetros -> (0,0)
    public Point() {
        this(0, 0);
    }

    // Mueve el punto a otra posición
    public void moveTo(int newX, int newY) {
        this.x = newX;
        this.y = newY;
    }

    // Suma con otro punto y devuelve un nuevo punto
    public Point add(Point other) {
        return new Point(this.x + other.x, this.y + other.y);
    }

    public int getX() { return x; }
    public int getY() { return y; }
}