package com.qa.Collections;

import java.util.Arrays;

/**
 * Populating arrays and array lists
 *
 */
public class Runner {
	public static void main(String[] args) {
		Collections col = new Collections();
		System.out.println(Arrays.toString(col.populateArray()));
		col.populateList().forEach(System.out::println);
		col.multiplyByTen(col.populateList()).forEach(System.out::println);
	}
}
