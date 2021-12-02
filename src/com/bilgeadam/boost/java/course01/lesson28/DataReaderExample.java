package com.bilgeadam.boost.java.course01.lesson28;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class DataReaderExample {

	public static void main(String[] args) {
		File     file   = new File("C:\\Users\\babur.somer\\values.ddd");
		
		try {
			FileInputStream fis = new FileInputStream(file);
			DataInputStream dis = new DataInputStream(fis);
			while (dis.available() > 0) {
				System.out.println("--> " + dis.readDouble());
				System.out.println("--> " + dis.readInt());
			}
			dis.close();
		}
		
		catch (FileNotFoundException ex) {
			System.out.println("Dosya tümüyle okundu");
		}
		catch (EOFException ex) {
			System.out.println("Dosya tümüyle okundu");
		}
		catch (IOException ex) {
			ex.printStackTrace();
		}
	}

}
