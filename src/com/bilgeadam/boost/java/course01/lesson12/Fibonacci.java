package com.bilgeadam.boost.java.course01.lesson12;

import java.util.Scanner;

public class Fibonacci {

	
	public static void main(String[] args) {
		System.out.print("n: ");
		Scanner inp = new Scanner(System.in);
		int n = inp.nextInt();
		inp.close();
		long start = System.nanoTime();
		long fib = calcFibonacci(n);
		long stop = System.nanoTime();

		System.out.println("\n" + n + "\'ncu Fibonacci sayýsý " + fib + " hesaplanmasý " + (stop - start) + " nano saniye sürdü");

		start = System.nanoTime();
		fib = (long)calcFibonacciExplicit(n);
		stop = System.nanoTime();
		System.out.println("\n" + n + "\'ncu Fibonacci sayýsý " + fib + " hesaplanmasý matematiksel formül kullanarak " + (stop - start) + " nano saniye sürdü");

		start = System.nanoTime();
		fib = calcFibonacciRecursive(n);
		stop = System.nanoTime();
		System.out.println("\n" + n + "\'ncu Fibonacci sayýsý " + fib + " hesaplanmasý özyinenemeli olarak " + (stop - start) + " nano saniye sürdü");


	}

	private static long calcFibonacci(int n) {
		long n1 = 0;
		long n2 = 1;
		long nth = 0;
//		System.out.print(n1 + " " + n2); 
		for (int i = 1; i < n; ++i) {
			nth = n1 + n2;
//			System.out.print(" " + nth);
			n1 = n2;
			n2 = nth;
		}
		return nth;
	}

	private static long calcFibonacciRecursive(int n) {
		if (n == 1 || n == 2)
			return 1;
		else
			return calcFibonacciRecursive(n - 1) + calcFibonacciRecursive(n - 2);
	}
	
	private static double calcFibonacciExplicit(int n) {
		double sqrtOfFive = Math.sqrt(5);
		return (1 / sqrtOfFive) * (Math.pow( ((1 + sqrtOfFive)/2),n) - Math.pow(((1 - sqrtOfFive)/2),n));
	}
	
	
}
