package com.bilgeadam.boost.java.course01.lesson09;

import java.util.Scanner;

public class InputExample {

	public static void main(String[] args) {
		System.out.print("L�tfen bir de�er giriniz: ");
		Scanner inp = new Scanner(System.in);
		int x = inp.nextInt();
		System.out.println(x);
		System.out.print("L�tfen bir metin giriniz: ");
		String xyz = inp.next();
		System.out.print("L�tfen bir virg�ll� say� giriniz: ");
		double d = inp.nextDouble();
		
		System.out.println("String: " + xyz + " Double: " + d);
		inp.close();
	}
}
