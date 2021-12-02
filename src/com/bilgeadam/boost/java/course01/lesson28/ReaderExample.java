package com.bilgeadam.boost.java.course01.lesson28;

import java.io.*;

public class ReaderExample {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\babur.somer\\mektup.txt");
		if (file.exists()) {
			System.out.println("mektup belgesi zaten var");
		}
		else {
			System.out.println("mektup belgesi henüz yok");
		}
		
		try {
			FileReader reader = new FileReader(file);
			BufferedReader bR = new BufferedReader(reader);
			while (true) {
				String line = bR.readLine();
				if (line == null) {
					break;
				}
				System.out.println("--> " + line);
			}
			bR.close();
		}
		catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}
		catch (IOException ex) {
			ex.printStackTrace();
		}
	}
	
}
