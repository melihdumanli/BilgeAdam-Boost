package com.bilgeadam.boost.java.course01.lesson42;

import java.util.Random;

public class SingleRandomNumber {
	private static SingleRandomNumber instance = null;
	private int number;
	
	
	private SingleRandomNumber() {
		super();
		Random rnd = new Random();
		number = rnd.nextInt(100);
	}
	
	public static SingleRandomNumber getInstance() {
		if (instance == null) {
			instance = new SingleRandomNumber();
		}
		return instance;
	}
	
	public int getNumber() {
		return this.number;
	}

}
