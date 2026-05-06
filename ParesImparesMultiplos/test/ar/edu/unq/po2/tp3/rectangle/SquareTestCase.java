package ar.edu.unq.po2.tp3.rectangle;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ar.edu.unq.po2.tp3.point.Point;

public class SquareTestCase {

    private Square square;

    @BeforeEach
    public void setUp() {
        // cuadrado de lado 5
        square = new Square(new Point(0, 0), 5);
    }

    @Test
    public void testArea() {
        assertEquals(25, square.getArea());
    }

    @Test
    public void testPerimeter() {
        // 2 * (5 + 5) = 20
        assertEquals(20, square.getPerimeter());
    }

    @Test
    public void testNiHorizontalNiVertical() {
        // un cuadrado no es ni horizontal ni vertical
        assertFalse(square.isHorizontal());
        assertFalse(square.isVertical());
    }

    @Test
    public void testWidthEqualsHeight() {
        assertEquals(square.getWidth(), square.getHeight());
    }
}