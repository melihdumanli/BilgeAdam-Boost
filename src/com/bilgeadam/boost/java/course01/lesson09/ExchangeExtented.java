package com.bilgeadam.boost.java.course01.lesson09;

import java.util.Scanner;

public class ExchangeExtented {

	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);

		System.out.print("Lütfen güncel dolar kurunu virgüllü sayý olarak giriniz: ");
		double exchangeRateDolar = klavye.nextDouble();

		System.out.print("Lütfen güncel avro kurunu virgüllü sayý olarak giriniz: ");
		double exchangeRateEuro = klavye.nextDouble();
		String yesOrNo;
		do  {
			System.out.print("Lütfen bozdurmak istediðiniz miktarý tam sayý olarak giriniz: ");
			int amount = klavye.nextInt();
			System.out.print("Lütfen dolar->TL bozdurmak için 1, TL->$ bozdurmak için 0,\n avro->TL bozdurmak için 2, TL->€ bozdurmak için 3 giriniz: ");
			int direction = klavye.nextInt();
			
			switch (direction) {
			case 0:
				System.out.printf("\n%d TL'nin karþýlýðý %.1f $'dýr.", amount, amount / exchangeRateDolar);
				break;
			case 1: 
				System.out.printf("\n%d $'larýn karþýlýðý %.1f TL'dir.", amount, amount * exchangeRateDolar);
				break;
			case 2:
				System.out.printf("\n%d TL'nin karþýlýðý %.1f €'dur.", amount, amount / exchangeRateEuro);
				break;
			case 3: 
				System.out.printf("\n%d €'nun karþýlýðý %.1f TL'dir.", amount, amount * exchangeRateEuro);
				break;
			default:
				System.out.println("Yanlýþ yön: TL ->$ Bozdurma seçildi");
				System.out.printf("\n%d TL'nin karþýlýðý %.1f $'dýr.", amount, amount / exchangeRateDolar);
			}
			
			System.out.print("\n\nYeni iþlem yapmak istiyor musunuz (evet için E): ");
			yesOrNo = klavye.next();

		} while(!yesOrNo.equalsIgnoreCase("E"));
		
		klavye.close();
		System.out.println("\nBye bye");
	}
}
