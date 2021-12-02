package com.bilgeadam.boost.java.course01.lesson09;

public class TryAndError {

	public static void main(String[] args) {

		/*
		 * C = (F - 32) x (5/9)
		 */

		final double X = 5.0 / 9;
		System.out.println(X);
		final int Y = 32;
		double f = 123;
		double c = (f - Y ) * X;
		System.out.println(c);
		
		int i = 5;
		
		int j = ++i;
		i++;
	}
}
