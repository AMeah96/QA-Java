package com.qa.Calculator;

/**
 * Basic Calculator
 *
 */
public class Runner {
	private static int input1 = 65;
	private static int input2 = 5;
	
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		System.out.println("First Number:" + input1 + " Second Number:" + input2 + "\n");
		System.out.println("addition: " + calc.add(input1, input2));
		System.out.println("subtraction: " + calc.subtract(input1, input2));
		System.out.println("multiplication: " + calc.multiply(input1, input2));
		System.out.println("division: " + calc.divide(input1, input2));
		
	}
}
