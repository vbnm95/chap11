package com.example;

public class GenericMethodExample {
	
	static <T> void xxx(T x) {
		System.out.println(x.getClass());
	}
	
	static <T extends B> void yyy(T y) {
		
	}
	
	static class A {
		
	}
	
	static class B extends A {
		
	}
	
	static class C extends A {
		
	}
	
	static class D extends B {
		
	}
	
	public static void main(String[] args) {
		xxx(10);
		xxx(10.3);
		
		A a = new A();
		B b = new B();
		C c = new C();
		D d = new D();
		
		yyy(d);

	}
}
