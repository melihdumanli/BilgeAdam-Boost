package com.bilgeadam.boost.java.course01.lesson42.animal;

public class Cat implements Animal {

	@Override
	public String getType() {
		return "Kedi";
	}

	@Override
	public void makeSound() {
		System.out.println("miyav miyav");
	}
}
