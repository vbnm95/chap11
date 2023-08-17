package com.example;

class Box<T> {
	private T value;
	
	T getValue( ) {
		return value;
	}
	
	void setValue(T value) {
		this.value = value;
	}
}

public class GenericExample {
	
	public static void main(String[] args) {
		
		Box<String> box1 = new Box<>();
		Box<Byte> box2 = new Box<>();
		Box<Short> box3 = new Box<>();
		Box<Character> box4 = new Box<>();
		Box<Integer> box5 = new Box<>();
		Box<Long> box6 = new Box<>();
		Box<Float> box7 = new Box<>();
		Box<Double> box8 = new Box<>();
		Box<Boolean> box9 = new Box<>();
		
		box5.setValue(100);
		System.out.println(box5.getValue());
		

		
	}
}
