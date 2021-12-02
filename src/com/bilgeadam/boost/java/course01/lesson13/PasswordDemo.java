package com.bilgeadam.boost.java.course01.lesson13;

public class PasswordDemo {

	public static void main(String[] args) {
		Password pwd = new Password();
		pwd.assign("", "TeutoburgerWald");
		pwd.assign("TeutoburgerWald", "Doppelkeks");
		pwd.assign("Dopplerkeks", "panic");
//		System.out.println(pwd.password);
	}
}
