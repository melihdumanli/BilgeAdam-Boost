package com.bilgeadam.boost.java.course01.lesson42;

import java.util.Random;

public class RandomNumber {
	private int number;
	
	public RandomNumber() {
		super();
		Random rnd = new Random();
		number = rnd.nextInt(100);
	}
	
	public int getNumber() {
		return this.number;
	}
}
