package com;

interface I1 {
	default void m() {
		System.out.println("I1 :: m()");
	}
}

interface I2 {
	default void m() {
		System.out.println("I2 :: m()");
	}
}

class MyClass implements I1, I2 {

	@Override
	public void m() {
		I1.super.m();
	}

}

public class Ex2 {
	public static void main(String[] args) {

	}
}
