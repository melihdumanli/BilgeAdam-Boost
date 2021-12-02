package com.bilgeadam.boost.java.course01.lesson18;

import java.util.ArrayList;
import java.util.LinkedList;

public class Intro2Generics {

	public static void main(String[] args) {
		LinkedList<String> strArray = new LinkedList<String>();
		strArray.add("1");
		strArray.add("" + 1);

		for (String string : strArray) {
			System.out.println(string);
		}

		ArrayList<MyObject> arrayList = new ArrayList<MyObject>();
		
		MyObject obj1 = new MyObject();
		obj1.name = "Fiat";
		obj1.type = "Araba";
		obj1.power = 143;
		arrayList.add(obj1);

		MyObject obj2 = new MyObject();
		obj2.name = "G�vercin";
		obj2.type = "Ku�";
		obj2.power = 22;

		MyObject obj3 = new MyObject();
		obj3.name = "Vapur";
		obj3.type = "Deniz Ta��t�";
		obj3.power = 259;

		arrayList.add(obj2);
		arrayList.add(obj3);
		for (MyObject myObject : arrayList) {
			System.out.println(myObject);
		}
		for (int i=0; i<arrayList.size(); i++) {
			MyObject obj = arrayList.get(i);
			System.out.println(obj);
		}

		MyObject obj4 = new MyObject();
		obj4.name = "Java";
		obj4.type = "Programlama Dili";
		obj4.power = 1;

		arrayList.add(1, obj4);   // etkisi ==> obj1 obj4 obj2 obj3
		for (MyObject myObject : arrayList) {
			System.out.println(myObject);
		}
		
		obj1.name = "Mercedes";
		System.out.println(arrayList.get(0));
		
		MyObject abj = obj1;
		abj.type = "Binek Araba";
		System.out.println(arrayList.get(0));
		
	}

}
