package ar.edu.unq.po2.tp3.multioperador;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MultioperadorTestCase {

    private Multioperador multi;

    @BeforeEach
    public void setUp() {
        multi = new Multioperador();
        multi.add(10);
        multi.add(3);
        multi.add(2);
    }

    @Test
    public void testSum() {
        // 10 + 3 + 2 = 15
        assertEquals(15, multi.sum());
    }

    @Test
    public void testSubtract() {
        // 10 - 3 - 2 = 5
        assertEquals(5, multi.subtract());
    }

    @Test
    public void testMultiply() {
        // 10 * 3 * 2 = 60
        assertEquals(60, multi.multiply());
    }

    @Test
    public void testSumEmpty() {
        Multioperador empty = new Multioperador();
        assertEquals(0, empty.sum());
    }

    @Test
    public void testMultiplySingleElement() {
        Multioperador single = new Multioperador();
        single.add(5);
        assertEquals(5, single.multiply());
    }
}