package ar.edu.unq.po2.tp3.multiples;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MultiplesFinderTestCase {

    private MultiplesFinder finder;

    @BeforeEach
    public void setUp() {
        finder = new MultiplesFinder();
    }

    @Test
    public void testMultiplesOf3And9() {
        assertEquals(999, finder.highestMultiple(3, 9));
    }

    @Test
    public void testMultiplesOf7And11() {
        assertEquals(924, finder.highestMultiple(7, 11));  // cambia 994 por 924
    }

    @Test
    public void testNoMultipleExists() {
        assertEquals(-1, finder.highestMultiple(501, 502));
    }

    @Test
    public void testMultiplesOf1And1() {
        assertEquals(1000, finder.highestMultiple(1, 1));
    }
}
