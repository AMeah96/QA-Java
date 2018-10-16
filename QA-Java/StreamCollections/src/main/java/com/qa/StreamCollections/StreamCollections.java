package com.qa.StreamCollections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;

public class StreamCollections {
	public int[] populateArray() {
		int[] arr = new int[100];
		IntStream.range(0, 100).forEach(i -> arr[i] = i + 1);
		return arr;
	}
	
	public List<Integer> populateList() {
		List<Integer> newList = new ArrayList<Integer>();
		IntStream.range(100,1000).forEach(i -> newList.add(i));
		return newList;
	}
	
	public List<Integer> multiplyByTen(List<Integer> list) {
		List<Integer> newList = new ArrayList<Integer>();
		newList = list.stream().map(i -> i*10).collect(Collectors.toList());
		return newList;
	}
}
