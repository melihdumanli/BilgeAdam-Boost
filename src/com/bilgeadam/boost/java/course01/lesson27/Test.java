package com.bilgeadam.boost.java.course01.lesson27;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Test {

	public static void main(String[] args) {
		RealEstateAgency agency = null;
		try {
			FileInputStream file = new FileInputStream("C:\\Users\\babur.somer\\Downloads\\agency.data");
            ObjectInputStream ois = new ObjectInputStream(file);
            agency = (RealEstateAgency)ois.readObject();
            ois.close();
            
		}
		catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}
		catch (IOException ex) {
			ex.printStackTrace();
		}
		catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		}
		System.out.println(agency);;
	}

}
