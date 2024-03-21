package calculator;

public class calculator {
	 public double diff(double a, double b) {
	        if (a > b) {
	            return a - b;
	        } else {
	            return b - a;
	        }
	    }

	    public double times(double a, double b) {
	        if (a > b) {
	            return a / b;
	        } else {
	            return b / a;
	        }
	    }
	}

