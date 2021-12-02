package com.bilgeadam.boost.java.course01.lesson15;

import java.util.Arrays;

import com.bilgeadam.boost.java.course01.util.BAUtils;

public class ZigZag {

	public static void main(String[] args) {
		String str = "BA Boost Java ��rencileri En �yileri";
		int numberOfRows = 5;
		
		ZigZag zag = new ZigZag();
		
		BAUtils.header("ZIGZAG Example");
		
		String result = zag.convert(str, numberOfRows);
		System.out.println(result);
		
		BAUtils.footer();
	}

	/*
	 * 0) E�er tek bir sat�ra b�lmek gerekiyorsa veya sat�r adedi kelimenin uzunlu�undan fazla ise, kelimeyi �a�r�ld��� yere iade et 
	 * 1) sat�rAdedi kadar ��esi olan bir array olu�tur
	 * 2) array'in t�m elemanlar�n� bo� olarak tan�mla
	 * 3) Girdi String'ini harf harf i�leyebilmek i�in bir character array'e d�n��t�r
	 * 4) Sat�rlar aras� dola�abilmek i�in bir sat�r sayac� tan�mla
	 * 5) Dola��rken gidilen y�n� belirlemek i�in bir y�nBelirleyici tan�mla
	 * 6) Girdi String'inden olu�turulmu� array'in her bir ��esini birer birer ziyaret et ve a�a��daki i�leri yap
	 * 		(a)	Ge�erli sat�r� i�eren array ��esine ge�erli karakteri ekleyin
	 * 		(b) Sat�r numaras� n-1 ise, y�n� 'yukar�' olarak de�i�tir  (yani en dibe vard�k)
	 * 		(c) Sat�r numaras� 0 ise, y�n� 'a�a��' olarak de�i�tir  (yani en tepeye vard�k)
	 * 		(d) Y�n 'a�a��' ise, sat�r++ (bir alt sat�ra ge�) yap�n. Yoksa sat�r-- (bir �st sat�ra ge�)
	 * 7) T�m sat�r string'lerini birbirleri ile birle�tir 
	 * 
	 *  
	 */
	// TODO: NOT: Bunun ak�� diyagram�n� �izmeye �al���n!
	private String convert(String str, int numberOfRows) {
		String retVal = "";
		int len = str.length();
		
		if ((len <= numberOfRows) || (numberOfRows == 1))
			return str;
		
		
		String[] rows;						// (1)
		rows = new String[numberOfRows];
		
		Arrays.fill(rows, "");				// (2)
		
		char[] chars = str.toCharArray();	//  (3)
				// "BA Boost"  ==>  'B', 'A', 'B', 'o', 'o', 's', 't' metni characterarray yapt�k
		
		int row = 0;						// (4)
		boolean goingDown = true;			// (5)
		
		for (int i = 0; i < len; i++) {		// (6) character array'in ��erlerini gez
			rows[row] += chars[i];			// 		(a)	"" + 'x' {bo� string + bir karakter, karacterden olu�an bir string yarat�r
			
			if (row == (numberOfRows - 1)) {//		(b)
				goingDown = false;
			}
			
			if (row == 0) {					//		(c)
				goingDown = true;
			}
			
			if (goingDown) {				//		(d)
				row++;
			}
			else {
				row--;
			}
		}
		
		for (int i=0; i<numberOfRows; i++) {//		(7)
			retVal += rows[i];
		}
		return retVal;
	}
}
