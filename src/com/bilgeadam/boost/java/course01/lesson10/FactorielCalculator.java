package com.bilgeadam.boost.java.course01.lesson10;

public class FactorielCalculator {

	public static void main(String[] args) {

		int inp = 1000;
		double fact = 1;

		if (inp == 0) {
			fact = 1;
		} else {
			for (int i = 1; i <= inp; i++) {
				fact *= i;  // fact = fact * i
			}
		}

		System.out.println(fact);
	}

}
