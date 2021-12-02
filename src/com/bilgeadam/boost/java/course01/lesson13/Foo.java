package com.bilgeadam.boost.java.course01.lesson13;

public class Foo {
	private int aa = 20;
	private int bb = 30;
	
	public int g(int a) {
		int b = 1;
		if (a == 2) {
			return a + b;
		}
		return this.aa + b;
	}

}
