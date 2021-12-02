package com.bilgeadam.boost.java.course01.lesson42.animal;

public class Dog implements Animal {

	@Override
	public String getType() {
		return "Köpek";
	}

	@Override
	public void makeSound() {
		System.out.println("hav hav");
	}
}
