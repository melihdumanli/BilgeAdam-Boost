package com.bilgeadam.boost.java.course01.lesson09;

import java.util.Scanner;

public class Exchange {

	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		
		System.out.print("L�tfen g�ncel dolar kurunu virg�ll� say� olarak giriniz: ");
		double exchangeRate = klavye.nextDouble();
		
		System.out.print("L�tfen bozdurmak istedi�iniz TL miktar�n� tam say� olarak giriniz: ");
		int amount = klavye.nextInt();
		klavye.close();
		
		System.out.println("\n" + amount + "TL'nin kar��l��� " + amount/exchangeRate + "$'d�r.");		
		
		System.out.printf("\n%d TL'nin kar��l��� %.1f $'d�r.", amount, amount/exchangeRate );
		

	}

}
