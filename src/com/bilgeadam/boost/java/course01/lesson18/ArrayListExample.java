package com.bilgeadam.boost.java.course01.lesson18;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList();
		
		arrayList.add(1);
		arrayList.add(1.4);
		arrayList.add("Bilge");
		arrayList.add(true);
		
		MyObject myObject = new MyObject();
		myObject.name = "Babür";
		myObject.type = "Ýnsan";
		myObject.power= 12;
		arrayList.add(myObject);
		

		MyObject myObject2 = new MyObject();
		myObject2.name = "Sarman";
		myObject2.type = "Kedi";
		myObject2.power= 32;
		arrayList.add(myObject2);
		
		for (Iterator iterator = arrayList.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			System.out.println(object);
//			MyObject obj = (MyObject)object;
//			System.out.println(obj.name);
		}
	}
}
