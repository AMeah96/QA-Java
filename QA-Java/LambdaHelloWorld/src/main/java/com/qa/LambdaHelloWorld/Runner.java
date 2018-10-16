package com.qa.LambdaHelloWorld;

/**
 * Hello world! Using Lambda
 *
 */
public class Runner {
	public static void main(String[] args) {
		StringOperator greeter = name -> "Hello " + name;
		
		greeter.greet("Hello");
		System.out.println(greeter.greet("World"));
	}
}
