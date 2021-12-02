package com.bilgeadam.boost.java.course01.lesson41;

public enum ProductCategory {
	BEVERAGES(1, "Beverages"), Condiments(2, "Condiments"), Confections(3, "Confections"), DAIRY(4, "Cheeses");

	private int id;
	private String name;

	ProductCategory(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public static ProductCategory string2ProductCategory(String name) {
		if (name.equalsIgnoreCase("Beverages")) {
			return BEVERAGES;
		}
		if (name.equalsIgnoreCase("Condiments")) {
			return Condiments;
		}
		if (name.equalsIgnoreCase("Cheeses")) {
			return DAIRY;
		}

		return Confections;
	}
	
	public int getID () {
		return this.id;
	}
}
