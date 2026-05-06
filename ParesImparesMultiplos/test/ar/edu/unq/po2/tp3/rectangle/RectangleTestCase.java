package ar.edu.unq.po2.tp3.rectangle;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ar.edu.unq.po2.tp3.point.Point;

public class RectangleTestCase {

    private Rectangle horizontal;
    private Rectangle vertical;

    @BeforeEach
    public void setUp() {
        // rectángulo horizontal: 10 de ancho, 4 de alto
        horizontal = new Rectangle(new Point(0, 0), new Point(10, 4));
        // rectángulo vertical: 4 de ancho, 10 de alto
        vertical = new Rectangle(new Point(0, 0), new Point(4, 10));
    }

    @Test
    public void testArea() {
        assertEquals(40, horizontal.getArea());
    }

    @Test
    public void testPerimeter() {
        // 2 * (10 + 4) = 28
        assertEquals(28, horizontal.getPerimeter());
    }

    @Test
    public void testIsHorizontal() {
        assertTrue(horizontal.isHorizontal());
        assertFalse(vertical.isHorizontal());
    }

    @Test
    public void testIsVertical() {
        assertTrue(vertical.isVertical());
        assertFalse(horizontal.isVertical());
    }

    @Test
    public void testWidth() {
        assertEquals(10, horizontal.getWidth());
    }

    @Test
    public void testHeight() {
        assertEquals(4, horizontal.getHeight());
    }
}