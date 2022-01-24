package com.bilgeadam.boost.java.course01.lesson70;

public class PolymorphismTest {

	public static void main(String[] args) {
		Dog    dog       = new Dog();
		Animal animal    = new Animal();
		Animal animalCat = new Cat();

		polymorphismTest(dog);
		polymorphismTest(animal);
		polymorphismTest(animalCat);

	}

	public static void polymorphismTest(Animal a) {
		a.eat();
	}
}
