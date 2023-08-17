package com.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

public class CollectionExample2 {
	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		arr.add(10);
		arr.add("Hello");
		
		Object o1 = 10;
		Object o2 = "Hello";
		
		Object[] al = {1, 10.5, "Hello", false};
		System.out.println(al[1]);
		System.out.println(al[2]);
		System.out.println(al[3]);

	}
}
