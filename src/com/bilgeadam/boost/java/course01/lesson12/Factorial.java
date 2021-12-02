package com.bilgeadam.boost.java.course01.lesson12;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		System.out.print("n: ");
		Scanner inp = new Scanner(System.in);
		int n = inp.nextInt();
		inp.close();
		long start = System.nanoTime();
		double fact = calcFactoriel(n);
		long stop = System.nanoTime();

		System.out.println(n + " sayýsýnýn faktöriyeli " + fact + " " + (stop - start) + " nano saniyede hesaplandý");
		
		start = System.nanoTime();
		fact = calcFactorielRecursive(n);
		stop = System.nanoTime();
		System.out.println(n + " sayýsýnýn faktöriyeli " + fact + " " + (stop - start) + " nano saniyede özyenilemeli olarak hesaplandý");

	}

	private static double calcFactoriel(int n) {
		double fact = 1;

		if (n == 0) {
			fact = 1;
		} else {
			for (int i = 1; i <= n; i++) {
				fact *= i;
			}
		}
		return fact;
	}

	private static double calcFactorielRecursive(int n) {
		if (n == 0 || n == 1)
			return 1;
		else {
			double araSonuc = calcFactorielRecursive(n - 1);
			return n * araSonuc;
		}
	}
}
