package com.bilgeadam.boost.java.course01.lesson16;

public class VelisGame {

	public static void main(String[] args) {
		int numOfElements = 15000;
		boolean[] spints = new boolean[numOfElements];

		// ilk deðer atama
		for (int i = 0; i < spints.length; i++) {   // iþi garantiye almak için. aslýnda array tanýmlandýðýnda zaten hepsi false
			spints[i] = false; // tüm dolaplarý kapadýk
		}
		
		//Velinin oyunu burada baþlýyor
		for (int tour = 1; tour <= spints.length; tour++) {   // tur sayýsý ile atlanmasý gereken dolap sayýsý ayný

			for (int spintCount = 0; spintCount < spints.length; ) {
				
				spints[spintCount] = !spints[spintCount];    // mantýksal ters çevirme false ==> true ve true ==> false
				spintCount = spintCount + tour;
			}
		}
		
		// Açýk kalan dolaplarý listeliyor ve açýk dolap adedini sayýyor
		int openSpinCount = 0;
		for (int i = 0; i < spints.length; i++) {   //açýk kalan dolaplarý göster
			if (spints[i]) {
				System.out.print(i + "  ");
				openSpinCount++;
			}
		}
		System.out.println("\nAçýk kalan dolap adedi: " + openSpinCount);
	}
}
