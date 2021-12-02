package com.bilgeadam.boost.java.course01.lesson16;

public class VelisGame {

	public static void main(String[] args) {
		int numOfElements = 15000;
		boolean[] spints = new boolean[numOfElements];

		// ilk de�er atama
		for (int i = 0; i < spints.length; i++) {   // i�i garantiye almak i�in. asl�nda array tan�mland���nda zaten hepsi false
			spints[i] = false; // t�m dolaplar� kapad�k
		}
		
		//Velinin oyunu burada ba�l�yor
		for (int tour = 1; tour <= spints.length; tour++) {   // tur say�s� ile atlanmas� gereken dolap say�s� ayn�

			for (int spintCount = 0; spintCount < spints.length; ) {
				
				spints[spintCount] = !spints[spintCount];    // mant�ksal ters �evirme false ==> true ve true ==> false
				spintCount = spintCount + tour;
			}
		}
		
		// A��k kalan dolaplar� listeliyor ve a��k dolap adedini say�yor
		int openSpinCount = 0;
		for (int i = 0; i < spints.length; i++) {   //a��k kalan dolaplar� g�ster
			if (spints[i]) {
				System.out.print(i + "  ");
				openSpinCount++;
			}
		}
		System.out.println("\nA��k kalan dolap adedi: " + openSpinCount);
	}
}
