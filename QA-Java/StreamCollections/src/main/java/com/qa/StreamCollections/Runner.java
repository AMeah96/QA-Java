package com.qa.StreamCollections;

import java.util.Arrays;

/**
 * Collections maven project using streams
 *
 */
public class Runner {
	public static void main(String[] args) {
		StreamCollections col = new StreamCollections();
		System.out.println(Arrays.toString(col.populateArray()));
		col.populateList().forEach(System.out::println);
		col.multiplyByTen(col.populateList()).forEach(System.out::println);
	}
}
