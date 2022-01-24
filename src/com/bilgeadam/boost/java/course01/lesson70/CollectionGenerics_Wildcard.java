package com.bilgeadam.boost.java.course01.lesson70;

import java.util.ArrayList;
import java.util.List;

public class CollectionGenerics_Wildcard {

	public static void main(String[] args) {
		List<Animal> animalList = new ArrayList<Animal>();
		List<Dog>    dogList    = new ArrayList<Dog>();

//		List animalDogList = new ArrayList();
		// Derleme uyarısı verir! Referans degisken olarak tanimliysa,
		// new anahtar kelimesinden sonra olmalidir.

		genericsRules(animalList);
//		 genericsRules(dogList);
		// dogList'i arguman olarak veremeyiz. Ilgili metot List tipinde
		// bir parametre almaktadir.
		// Dog IS-A Animal olsa da buraya List tipine bir degisken
		// gonderemeyiz !
		
		genericsRulesList(animalList);
		genericsRulesList(dogList);
	
	}

	public static void genericsRules(List<Animal> animals) {
		for (Animal animal : animals) {
	        animal.eat();
	    }
	}
	
	public static void genericsRulesList(List<?> animals) {
		for (Object animal : animals) {
			if (animal.getClass().isInstance(Animal.class))
				((Animal)animal).eat();
	    }
	}
}
