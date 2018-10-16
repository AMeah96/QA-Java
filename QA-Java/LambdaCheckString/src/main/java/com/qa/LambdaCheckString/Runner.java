package com.qa.LambdaCheckString;

/**
 * Check if two strings are equal using Lambdas
 *
 */
public class Runner {
	
	private static final String base = "hello";
	
	public static void main(String[] args) {
		CheckingOperator checker = (str1,str2) -> str1.equals(str2);
		checker.compareTwoStrings("hello", "hello");
		System.out.println(checker.compareTwoStrings("hello", "hello"));
		
		BaseComparer comparer = str1 -> str1.equals(base);
		comparer.compareToBase("hello");
		System.out.println(comparer.compareToBase("hello"));
		
	}
}
