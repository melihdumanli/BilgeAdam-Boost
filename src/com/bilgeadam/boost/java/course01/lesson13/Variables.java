package com.bilgeadam.boost.java.course01.lesson13;

public class Variables {
	static String text;
	
	String anotherText;
	
	public static void main(String[] args) {
		String sss = "hjkhkj";
		
		text = "Nasýlsýnýz?";
		System.out.println(Variables.text);
		
		Variables vars = new Variables();
		
		System.out.println(vars.anotherText);

//		anotherText = "lkjkljlk";
		
	}

	void anotherMethod() {
		int i;
//		System.out.println(sss);
		System.out.println(Variables.text);
		System.out.println(anotherText);
	}
	
	static void aMethod() {
		int i = 0;
		System.out.println(i);
		System.out.println(Variables.text);
//		System.out.println(anotherText);
		
	}
}
