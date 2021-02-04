package javaCalculator;

public class MagicCalculator extends Calculator{
	
	public static double squareRoot(double number) {
		return Math.pow(number, 0.5);
	}
	public static double sin(double number) {
		return Math.sin(number);
	}
	public static double cos(double number) {
		return Math.cos(number);
	}
	public static double tan(double number) {
		return Math.tan(number);
	}
	public static int factorial(int number) {
		int result =1; 
		for (int i=0; i<=number; i++) {
			
			if (i==0) {
				result = 1; 
			}
			else {
				result = Calculator.multiply(i, result);
			}
		}
		return result; 
	}

}
