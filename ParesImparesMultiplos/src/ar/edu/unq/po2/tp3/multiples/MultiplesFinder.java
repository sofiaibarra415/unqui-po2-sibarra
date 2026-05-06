package ar.edu.unq.po2.tp3.multiples;

public class MultiplesFinder {

	public int highestMultiple(int x, int y) {
	    for (int i = 1000; i >= 1; i--) {  // cambia >= 0 por >= 1
	        if (i % x == 0 && i % y == 0) {
	            return i;
	        }
	    }
	    return -1;
	}
}
