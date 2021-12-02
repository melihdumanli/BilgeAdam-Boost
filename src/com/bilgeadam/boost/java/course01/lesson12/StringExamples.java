package com.bilgeadam.boost.java.course01.lesson12;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringExamples {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		String input;
		String str = "";
		do {
			System.out.print("Bir metin giriniz: ");
			input = inp.nextLine();
			
			if (!input.endsWith("it")) {
				str += input;
			}
			else {
				break;
			}

			int idx = str.indexOf("ý");
			char[] chars = str.toCharArray();
			if (idx >= 0) {
				chars[idx] = 'i';
			}
			str.replace('ý', 'i'); //replace all ý's with i's
			
			StringTokenizer tokens = new StringTokenizer(str, "|")	;
			int i = 0;
			while (tokens.hasMoreElements()) {
				String s = tokens.nextToken();
				if (i == 1) {
					s.concat(" ").concat("Tavuk").concat(str);
				}
				i++;
				System.out.println(s);
				System.out.println(s.toUpperCase());
			}
		} while (!input.equalsIgnoreCase("exit"));

		System.out.println(str);
		inp.close();
	}
}
