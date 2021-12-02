package com.bilgeadam.boost.java.course01.lesson09;

import java.util.Scanner;

public class Exchange {

	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		
		System.out.print("Lütfen güncel dolar kurunu virgüllü sayý olarak giriniz: ");
		double exchangeRate = klavye.nextDouble();
		
		System.out.print("Lütfen bozdurmak istediðiniz TL miktarýný tam sayý olarak giriniz: ");
		int amount = klavye.nextInt();
		klavye.close();
		
		System.out.println("\n" + amount + "TL'nin karþýlýðý " + amount/exchangeRate + "$'dýr.");		
		
		System.out.printf("\n%d TL'nin karþýlýðý %.1f $'dýr.", amount, amount/exchangeRate );
		

	}

}
