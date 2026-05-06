package ar.edu.unq.po2.tp3.evendigit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EvenDigitFinderTestCase {

    private EvenDigitFinder finder;

    @BeforeEach
    public void setUp() {
        finder = new EvenDigitFinder();
    }

    @Test
    public void testNumberWithMostEvenDigits() {
        int[] numbers = {1234, 222, 135, 4860};
        assertEquals(4860, finder.numberWithMostEvenDigits(numbers));
    }

    @Test
    public void testAllOddDigits() {
        int[] numbers = {111, 333, 135};
        assertEquals(111, finder.numberWithMostEvenDigits(numbers));
    }

    @Test
    public void testNegativeNumbers() {
        int[] numbers = {-246, 13, 800};
        assertEquals(-246, finder.numberWithMostEvenDigits(numbers));
    }
}