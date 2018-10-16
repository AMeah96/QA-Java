package com.qa.LambdaCalculator;

public class LambdaCalculator {
	MathOperator add = (a,b) -> a + b;
	MathOperator subtract = (a,b) -> a - b;
	MathOperator multiply = (a,b) -> a * b;
	MathOperator divide = (a,b) -> a/b;
	
	public double calculate(double a, double b, MathOperator operation) {
		return operation.operate(a, b);
	}
	
	
}
