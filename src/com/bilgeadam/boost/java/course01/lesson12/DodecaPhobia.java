package com.bilgeadam.boost.java.course01.lesson12;

public class DodecaPhobia {

	public static void main(String[] args) {
		System.out.println("Seçilen sayý: " + createRandomNumber());
		
		System.out.println(createRandomNumber());
	}

	private static int createRandomNumber() {
		int retVal = 0;

		retVal = (int) (Math.random() * 20) + 1;
		if (retVal == 12)
			retVal = createRandomNumber();
		
//		do {
//			retVal = (int) (Math.random() * 20) + 1;
//		} while (retVal == 12);

		return retVal;
	}

}
