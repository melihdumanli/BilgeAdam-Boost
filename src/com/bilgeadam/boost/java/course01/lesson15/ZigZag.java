package com.bilgeadam.boost.java.course01.lesson15;

import java.util.Arrays;

import com.bilgeadam.boost.java.course01.util.BAUtils;

public class ZigZag {

	public static void main(String[] args) {
		String str = "BA Boost Java Öðrencileri En Ýyileri";
		int numberOfRows = 5;
		
		ZigZag zag = new ZigZag();
		
		BAUtils.header("ZIGZAG Example");
		
		String result = zag.convert(str, numberOfRows);
		System.out.println(result);
		
		BAUtils.footer();
	}

	/*
	 * 0) Eðer tek bir satýra bölmek gerekiyorsa veya satýr adedi kelimenin uzunluðundan fazla ise, kelimeyi çaðrýldýðý yere iade et 
	 * 1) satýrAdedi kadar öðesi olan bir array oluþtur
	 * 2) array'in tüm elemanlarýný boþ olarak tanýmla
	 * 3) Girdi String'ini harf harf iþleyebilmek için bir character array'e dönüþtür
	 * 4) Satýrlar arasý dolaþabilmek için bir satýr sayacý tanýmla
	 * 5) Dolaþýrken gidilen yönü belirlemek için bir yönBelirleyici tanýmla
	 * 6) Girdi String'inden oluþturulmuþ array'in her bir öðesini birer birer ziyaret et ve aþaðýdaki iþleri yap
	 * 		(a)	Geçerli satýrý içeren array öðesine geçerli karakteri ekleyin
	 * 		(b) Satýr numarasý n-1 ise, yönü 'yukarý' olarak deðiþtir  (yani en dibe vardýk)
	 * 		(c) Satýr numarasý 0 ise, yönü 'aþaðý' olarak deðiþtir  (yani en tepeye vardýk)
	 * 		(d) Yön 'aþaðý' ise, satýr++ (bir alt satýra geç) yapýn. Yoksa satýr-- (bir üst satýra geç)
	 * 7) Tüm satýr string'lerini birbirleri ile birleþtir 
	 * 
	 *  
	 */
	// TODO: NOT: Bunun akýþ diyagramýný çizmeye çalýþýn!
	private String convert(String str, int numberOfRows) {
		String retVal = "";
		int len = str.length();
		
		if ((len <= numberOfRows) || (numberOfRows == 1))
			return str;
		
		
		String[] rows;						// (1)
		rows = new String[numberOfRows];
		
		Arrays.fill(rows, "");				// (2)
		
		char[] chars = str.toCharArray();	//  (3)
				// "BA Boost"  ==>  'B', 'A', 'B', 'o', 'o', 's', 't' metni characterarray yaptýk
		
		int row = 0;						// (4)
		boolean goingDown = true;			// (5)
		
		for (int i = 0; i < len; i++) {		// (6) character array'in öðerlerini gez
			rows[row] += chars[i];			// 		(a)	"" + 'x' {boþ string + bir karakter, karacterden oluþan bir string yaratýr
			
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
