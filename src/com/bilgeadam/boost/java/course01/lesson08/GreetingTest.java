package com.bilgeadam.boost.java.course01.lesson08;

import java.util.Scanner;

/**
 * 
 * @author babur.somer
 * @version 1.01
 * �lkfl�dsklf� ldsf�ldsk�lfkds�lf ds�
 */

public class GreetingTest {

	/**
	 * 
	 * @param args flgjsdglkfjglkjgk
	 */
	public static void main(String[] args) {
		Greeting /* lkdjlksajkdasjkl */ x = new Greeting();
		x.msg = "Hello";
		System.out.println(x);
		Greeting y = x;
		System.out.println(y);
		Greeting z = x;
		System.out.println(z);
//		z = new Greeting();
		System.out.println(z);

		if (x == y)
			System.out.println("x y'ye e�ittir");
		else
			System.out.println("x y'ye e�it de�ildir");

		if (x == z)
			System.out.println("x z'ye e�ittir");
		else
			System.out.println("x z'ye e�it de�ildir");

		z.msg = "Hello";

		if (x == z)
			System.out.println("x z'ye e�ittir");
		else
			System.out.println("x z'ye e�it de�ildir");

		if (x.equals(z))
			System.out.println("x z'ye e�ittir");
		else
			System.out.println("x z'ye e�it de�ildir");

		x.msg = "FFFFFF";
		System.out.println(x);
		System.out.println(y);
		y.msg = "hjkjhkjkj";
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);

//		int l = 42;
//		{
//			int i = 0;
//			int j = 5, k = 10; 
//
//			int l = i + k;
//			System.out.println(l);
//		}
//		System.out.println(l);
		
		
		System.out.println("ali \n\nbana \rtopu \"DO�RU\" at!");
		
		long l  = 123_456_789L;
		long ll = 123_456_789L;
		System.out.println(l + ll);
		
		Scanner input = new Scanner(System.in);
		System.out.print("L�tfen bir satam say� giriniz: ");
		double i = input.nextDouble();
		System.out.println("\n" + i);
		
		System.out.println(args[0] + " " + args[1] + " " + args[2] + " " + args[3]);
		input.close();
	}
}
