package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Counter {

    private ArrayList<Integer> numbers;

    public Counter() {
        this.numbers = new ArrayList<>();
    }

    public void addNumber(int number) {        // renombrado
        this.numbers.add(number);
    }

    public int getEvenOcurrences() {           // nombre exacto que usa el test
        int count = 0;
        for (int n : numbers) {
            if (n % 2 == 0) count++;
        }
        return count;
    }

    public int getOddOcurrences() {
        int count = 0;
        for (int n : numbers) {
            if (n % 2 != 0) count++;
        }
        return count;
    }

    public int getMultipleOcurrences(int n) {
        int count = 0;
        for (int num : numbers) {
            if (num % n == 0) count++;
        }
        return count;
    }
}