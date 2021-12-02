package com.bilgeadam.boost.java.course01.lesson09;

import java.util.Scanner;

public class ExchangeExtented {

	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);

		System.out.print("L�tfen g�ncel dolar kurunu virg�ll� say� olarak giriniz: ");
		double exchangeRateDolar = klavye.nextDouble();

		System.out.print("L�tfen g�ncel avro kurunu virg�ll� say� olarak giriniz: ");
		double exchangeRateEuro = klavye.nextDouble();
		String yesOrNo;
		do  {
			System.out.print("L�tfen bozdurmak istedi�iniz miktar� tam say� olarak giriniz: ");
			int amount = klavye.nextInt();
			System.out.print("L�tfen dolar->TL bozdurmak i�in 1, TL->$ bozdurmak i�in 0,\n avro->TL bozdurmak i�in 2, TL->� bozdurmak i�in 3 giriniz: ");
			int direction = klavye.nextInt();
			
			switch (direction) {
			case 0:
				System.out.printf("\n%d TL'nin kar��l��� %.1f $'d�r.", amount, amount / exchangeRateDolar);
				break;
			case 1: 
				System.out.printf("\n%d $'lar�n kar��l��� %.1f TL'dir.", amount, amount * exchangeRateDolar);
				break;
			case 2:
				System.out.printf("\n%d TL'nin kar��l��� %.1f �'dur.", amount, amount / exchangeRateEuro);
				break;
			case 3: 
				System.out.printf("\n%d �'nun kar��l��� %.1f TL'dir.", amount, amount * exchangeRateEuro);
				break;
			default:
				System.out.println("Yanl�� y�n: TL ->$ Bozdurma se�ildi");
				System.out.printf("\n%d TL'nin kar��l��� %.1f $'d�r.", amount, amount / exchangeRateDolar);
			}
			
			System.out.print("\n\nYeni i�lem yapmak istiyor musunuz (evet i�in E): ");
			yesOrNo = klavye.next();

		} while(!yesOrNo.equalsIgnoreCase("E"));
		
		klavye.close();
		System.out.println("\nBye bye");
	}
}
