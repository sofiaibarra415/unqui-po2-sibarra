package ar.edu.unq.po2.tp3.multioperador;

import java.util.ArrayList;

public class Multioperador {

    private ArrayList<Integer> numbers;

    public Multioperador() {
        this.numbers = new ArrayList<>();
    }

    public void add(int number) {
        this.numbers.add(number);
    }

    public int sum() {
        int result = 0;
        for (int n : numbers) {
            result += n;
        }
        return result;
    }

    public int subtract() {
        int result = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            result -= numbers.get(i);
        }
        return result;
    }

    public int multiply() {
        int result = 1;
        for (int n : numbers) {
            result *= n;
        }
        return result;
    }
}