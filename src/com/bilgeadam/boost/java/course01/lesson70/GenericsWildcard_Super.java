package com.bilgeadam.boost.java.course01.lesson70;

import java.util.ArrayList;
import java.util.List;

public class GenericsWildcard_Super {
	public static void main(String[] args) {
		List<Animal> animalList = new ArrayList<Animal>();
		List<Dog> dogList = new ArrayList<Dog>();
		List<Kangal> kangalList = new ArrayList<Kangal>();
		addAnimal(animalList);
		addAnimal(dogList);

//		 addAnimal(kangalList);
		// derleme hatasi verir.

		genericsRulesList(animalList);
		genericsRulesList(kangalList);
		genericsRulesList(dogList);
	}

	
	public static void genericsRulesList(List<? extends Animal> animals) {
		for (Animal animal : animals) {
			animal.eat();
	    }
	}

	// ? super Dog , buraya Dog ve super/ust sinif tipinde arguman kabul eder.
	public static void addAnimal(List<? super Dog> dogList) {
		dogList.add(new Kangal());
		dogList.add(new Dog());
		//Burada Dog veya alt sinif tipinde obje ekleyebiliriz
		
//		 dogList.add(new Animal());
	}
}
