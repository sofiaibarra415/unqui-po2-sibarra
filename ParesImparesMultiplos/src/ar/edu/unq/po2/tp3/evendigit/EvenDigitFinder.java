package ar.edu.unq.po2.tp3.evendigit;

public class EvenDigitFinder {

    public int numberWithMostEvenDigits(int[] numbers) {
        int result = numbers[0];
        int maxEvenDigits = countEvenDigits(numbers[0]);

        for (int i = 1; i < numbers.length; i++) {
            int evenDigits = countEvenDigits(numbers[i]);
            if (evenDigits > maxEvenDigits) {
                maxEvenDigits = evenDigits;
                result = numbers[i];
            }
        }

        return result;
    }

    private int countEvenDigits(int n) {
        int count = 0;
        n = Math.abs(n);

        if (n == 0) return 1;

        while (n > 0) {
            int digit = n % 10;
            if (digit % 2 == 0) {
                count++;
            }
            n = n / 10;
        }

        return count;
    }
}
