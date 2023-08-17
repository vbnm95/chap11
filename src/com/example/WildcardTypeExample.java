package com.example;

import java.util.ArrayList;

public class WildcardTypeExample {
	
	static class A {
		
	}
	
	static class B extends A{
		
	}
	static class C extends A {
		
	}
	
	static class D extends B {
		
	}
	
	static class E extends D {
		
	}
	
	public static void main(String[] args) {
		ArrayList<?> list1 = new ArrayList<A>();
		list1 = new ArrayList<String>();
		
		ArrayList<? extends A> list2 = null;
		
		ArrayList<? super E> list3 = null;
		
	}
	
	public static void main2(String[] args) {
		ArrayList<?> list1 = null;
		
		list1 = new ArrayList<Integer>();
		list1 = new ArrayList<String>();
	
		int[] arr1 = null;
		double[] arr2 = null;
		
		arr1 = new int[] {1, 2, 3};
		//arr1 = new double[] {1, 2, 3};
		
	}
}
