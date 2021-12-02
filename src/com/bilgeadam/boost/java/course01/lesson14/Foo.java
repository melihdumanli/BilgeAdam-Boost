package com.bilgeadam.boost.java.course01.lesson14;

public class Foo {
	int a = 100;
	int b = 200;

	public static void main(String[] args) {
		
		Foo foo = new Foo();
		com.bilgeadam.boost.java.course01.lesson13.Foo fff = new com.bilgeadam.boost.java.course01.lesson13.Foo();
		System.out.println(foo.f(2));
		System.out.println(foo.f(3));
		System.out.println(fff.g(2));
		System.out.println(fff.g(3));
		
		System.out.println(foo);
	}
	
	int f(int a) {
		int b = 1;
		if (a == 2) {
//			int b = 5;  // olmaz, gölgeleme sadece nesne özniteliklerinde yapýlabilir
			return a + b;
		}
		return this.a + this.f(2);
	}
}
