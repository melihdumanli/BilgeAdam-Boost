package com.bilgeadam.boost.java.course01.lesson27;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serializing {

	public static void main(String[] args) throws MaxNumberOfAddressesReachedException {
		
		Person person = new Person(new Name("Babür", "Somer"));
		person.addAddress(new Address("Bağdat Caddesi", "�stanbul", "Turkey", 10));

		try {
			FileOutputStream file = new FileOutputStream("C:\\Users\\babur.somer\\Downloads\\persons.txt");
            ObjectOutputStream oos = new ObjectOutputStream(file);
            oos.writeObject(person);
            oos.close();

		}
		catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}
		catch (IOException ex) {
			ex.printStackTrace();
		}
		
		Person readPerson = readPerson();
		System.out.println(readPerson);
	}

	private static Person readPerson() {
		Person pers = null;
        try{
            FileInputStream file = new FileInputStream("C:\\Users\\babur.somer\\Downloads\\persons.txt");
            ObjectInputStream ois = new ObjectInputStream(file);
            pers = (Person)ois.readObject();
            ois.close();
      }
      catch(Exception e){
            System.out.println(e.getMessage());
      }
        return pers;
	}

}
