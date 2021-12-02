package com.bilgeadam.boost.java.course01.lesson11;

public class Typecasting {

	public static void main(String[] args) {
		int lowerType = 234;
		long higherType = lowerType;
		higherType = 999_999_999_999L;
		System.out.println(lowerType + " " + higherType);
		
		lowerType = (int) higherType;
		System.out.println(lowerType + " " + higherType);

	}

}
