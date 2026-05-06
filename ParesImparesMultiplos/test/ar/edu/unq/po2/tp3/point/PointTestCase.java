package ar.edu.unq.po2.tp3.point;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PointTestCase {

    @Test
    public void testConstructorConParametros() {
        Point p = new Point(3, 5);
        assertEquals(3, p.getX());
        assertEquals(5, p.getY());
    }

    @Test
    public void testConstructorSinParametros() {
        Point p = new Point();
        assertEquals(0, p.getX());
        assertEquals(0, p.getY());
    }

    @Test
    public void testMoveTo() {
        Point p = new Point(1, 1);
        p.moveTo(10, 20);
        assertEquals(10, p.getX());
        assertEquals(20, p.getY());
    }

    @Test
    public void testAdd() {
        Point p1 = new Point(3, 5);
        Point p2 = new Point(2, 4);
        Point result = p1.add(p2);
        assertEquals(5, result.getX());
        assertEquals(9, result.getY());
    }

    @Test
    public void testAddNoModificaOriginales() {
        Point p1 = new Point(3, 5);
        Point p2 = new Point(2, 4);
        p1.add(p2);
        // p1 y p2 no deben cambiar
        assertEquals(3, p1.getX());
        assertEquals(2, p2.getX());
    }
}