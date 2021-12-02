package com.bilgeadam.boost.java.course01.lesson31;

import java.util.HashMap;

import com.bilgeadam.boost.java.course01.util.BAUtils;

public class SchoolManagementSystem {
	private static final int EXIT = 10;
	
	public static void main(String[] args) {

		BAUtils.header(" O K S - Okul Yönetim Sistemi");
		
		SchoolManagement school = new SchoolManagement();
		
		HashMap<Integer, String> menu = school.initMenu();
		
		int selection = 0;
		boolean cont = true;
		do {
			selection = BAUtils.menu(menu);
			if (selection != SchoolManagementSystem.EXIT) {
				school.processMenu(selection);
				cont = true;
			}
			else {
				cont = BAUtils.wantToEnd("Ger�ekten (Evet/Hay�r)?", "Evet");
			}
		}
		while (cont);
		BAUtils.footer();
	}
}
