package com.bilgeadam.boost.java.course01.lesson42;

public class AbstractFactoryTest {

	public static void main(String[] args) {
		
		FactoryProvider fP = new FactoryProvider();
		AnimalFactory aF = (AnimalFactory)fP.getFactory("hayvan");
		ColorFactory cF = (ColorFactory)fP.getFactory("renk");
		
		aF.create("kedi").makeSound();
		System.out.println(cF.create("mavi").getColor());
	}
}
