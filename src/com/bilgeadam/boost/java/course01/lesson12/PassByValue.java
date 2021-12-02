package com.bilgeadam.boost.java.course01.lesson12;

public class PassByValue {

	public static void main(String[] args) {
		int number = 2;
		number = changeNumber(number);
		System.out.println("In main: " + number);
	}

	private static int changeNumber (int number) {
		number = number * number;
		System.out.println("In method: " + number);
		return number;
	}
}
