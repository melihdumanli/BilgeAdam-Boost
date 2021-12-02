package com.bilgeadam.boost.java.course01.lesson42;

public class RandomNumberTest {

	public static void main(String[] args) {
		System.out.println("Normal Yapı");
		System.out.println("instance 1= " + new RandomNumber().getNumber());
		System.out.println("instance 2= " + new RandomNumber().getNumber());
		System.out.println("instance 3= " + new RandomNumber().getNumber());

		System.out.println("-----------------");

	
		System.out.println("Singleton Yapı");
		System.out.println("instance 1= " + SingleRandomNumber.getInstance().getNumber());
		System.out.println("instance 2= " + SingleRandomNumber.getInstance().getNumber());
		System.out.println("instance 3= " + SingleRandomNumber.getInstance().getNumber());
}
}
