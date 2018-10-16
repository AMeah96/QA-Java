package com.qa.LambdaCalculator;

/**
 * Calculator using lambdas
 *
 */
public class Runner {
	private static int a = 20;
	private static int b = 5;
	
	public static void main(String[] args) {
		LambdaCalculator calc = new LambdaCalculator();
		
		System.out.println("addition: " + calc.calculate(a, b, calc.add));
		System.out.println("multiplication: " + calc.calculate(a, b, calc.multiply));
		System.out.println("subtracttion: " + calc.calculate(a, b, calc.subtract));
		System.out.println("division: " + calc.calculate(a, b, calc.divide));

	}
}
