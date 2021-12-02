package com.bilgeadam.boost.java.course01.lesson42;

public class FactoryProvider {
	
	public AbstractFactory getFactory(String factoryType){
		
		if (factoryType.equalsIgnoreCase("hayvan"))
			return new AnimalFactory();
		else
			return new ColorFactory();
	}
}
