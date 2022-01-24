package com.bilgeadam.boost.java.course01.lesson70;

import java.util.ArrayList;
import java.util.List;

public class GenericsWildcard_Extends {
	public static void main(String[] args) {
		List<Animal> animalList = new ArrayList<Animal>();

		List<Dog> dogList = new ArrayList<Dog>();

		addAnimal(animalList);
		addAnimal(dogList);

		genericsRulesList(animalList);
		genericsRulesList(dogList);
	}

	public static void genericsRulesList(List<? extends Animal> animals) {
		for (Animal animal : animals) {
			animal.eat();
	    }
	}

	public static void addAnimal(List<? extends Animal> animalList) {
		// <? extends Animal> olarak tanimli oldugu zaman yeni bir elaman
		// ekleyemeyiz. sadece null ekleyebiliriz.

		// animalList.add(new Animal());
		// animalList.add(new Dog());

		animalList.add(null);
	}
}
