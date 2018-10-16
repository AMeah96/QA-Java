package com.qa.HelloWorld;

/**
 * Hello world!
 *
 */
public class Runner {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		staticPrintHelloWorld();
		staticPrintParam("Hello");
		Runner application = new Runner();
		
		
		application.printHelloWorld();
		application.printParam("Hello");

	}

	public static void staticPrintHelloWorld() {
		System.out.println("\n Static HelloWorld Method");
		System.out.println("Hello World!");
	}
	
	public static void staticPrintParam(String input) {
		System.out.println(input);
	}

	public String printHelloWorld() {
		System.out.println("\n Non-static HelloWorld Method");
		return "Hello World";
	}
	
	public String printParam(String input) {
		return input;
	}
	
	
}
