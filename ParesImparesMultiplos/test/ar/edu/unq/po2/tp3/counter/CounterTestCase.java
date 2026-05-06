package ar.edu.unq.po2.tp3.counter;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ar.edu.unq.po2.tp3.Counter;

public class CounterTestCase {

    private Counter counter;

    @BeforeEach
    public void setUp() throws Exception {
        counter = new Counter();

        // 9 impares, 1 par (el 4)
        counter.addNumber(1);
        counter.addNumber(3);
        counter.addNumber(5);
        counter.addNumber(7);
        counter.addNumber(9);
        counter.addNumber(1);
        counter.addNumber(1);
        counter.addNumber(1);
        counter.addNumber(1);
        counter.addNumber(4);
    }

    @Test
    public void testEvenNumbers() {
        int amount = counter.getEvenOcurrences();
        assertEquals(1, amount);   // solo el 4 es par
    }

    @Test
    public void testOddNumbers() {
        int amount = counter.getOddOcurrences();
        assertEquals(9, amount);   // todos menos el 4
    }

    @Test
    public void testMultiplesOf3() {
        int amount = counter.getMultipleOcurrences(3);
        assertEquals(2, amount);   // el 3 y el 9
    }
}