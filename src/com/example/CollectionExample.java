package com.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

public class CollectionExample {
	public static void main(String[] args) {
		int[] arr1 = new int[10];
		String[] arr2 = new String[10];
		
		ArrayList<Integer> arr3 = new ArrayList<Integer>();
		ArrayList<String> arr4 = new ArrayList<String>();
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("A", 1);
		map.put("B", 2);
		map.put("C", 3);
		
		Comparator<Integer> c = new Comparator<Integer>() {
			
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return 0;
			}
		};
	}
}
