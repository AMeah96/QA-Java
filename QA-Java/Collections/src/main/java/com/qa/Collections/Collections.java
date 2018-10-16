package com.qa.Collections;

import java.util.ArrayList;
import java.util.List;

public class Collections {
	public int[] populateArray() {
		int[] arr = new int[100];
		for (int i = 0; i < 100; i++) {
			arr[i] = i+1;
		}
		return arr;
	}
	
	public List<Integer> populateList() {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 100; i < 1000; i++) {
			list.add(i);
		}
		return list;
	}
	
	public List<Integer> multiplyByTen(List<Integer> list) {
		List<Integer> newList = new ArrayList<Integer>();
		for(Integer i : list) {
			newList.add(i*10);
		}
		return newList;
	}
	

}
