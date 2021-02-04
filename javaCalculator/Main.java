package javaCalculator;

public class Main {

	public static void main(String[] args) {
		//printing out using the methods from the calculators
		System.out.println("Adding: 10+20 = " + Calculator.add(10, 20));
		System.out.println("Subtracting: 20-10 = " + Calculator.subtract(20, 10));
		System.out.println("Multiplying: 2*10 = "+ Calculator.multiply(2, 10));
		System.out.println("Dividing: 10 / 2 = " + Calculator.divide(10, 2));
		System.out.println("Square root of 64 = " + MagicCalculator.squareRoot(64));
		System.out.println("Sine of 0 = " + MagicCalculator.sin(0));
		System.out.println("Cosine of 0 = " + MagicCalculator.cos(0));
		System.out.println("Tangent of 0 = " + MagicCalculator.tan(0));
		System.out.println("5! = " + MagicCalculator.factorial(5));
	}

}
