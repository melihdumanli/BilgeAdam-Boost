package com.bilgeadam.boost.java.course01.lesson26;

import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

import com.bilgeadam.boost.java.course01.util.BAUtils;

public class ExceptionHandling {

	public static void main(String[] args) throws Exception {
//		double i = BAUtils.readDouble("Lütfen sayý");
//		System.out.println(i);
		
		Scanner sc = new Scanner(System.in);
		int[] arr = {1, 2, 0, 6, 99};
		
		try {
			for (int i=0; i<arr.length; i++) {
				try {
					System.out.println(arr[i] / arr[i+1]);
				}
				catch (ArithmeticException ex) {
					System.out.println("I got an arithmetic exception");
				}
			}
		}
		catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("I got a index out of bounds");
		}
		
//		try {
//			FileInputStream fis = new FileInputStream(new File("jadshfjhdkjf.txt"));
//		}
//		catch (FileNotFoundException ex) {
//			// TODO Auto-generated catch block
//			ex.printStackTrace();
//		}
		
//		try (FileInputStream fis = new FileInputStream(new File("jadshfjhdkjf.txt")) {
//			
//		}
		
		int age = BAUtils.readInt("Lütfen yaþýnýzý giriniz");
		if (age < 18) {
			throw new TooYoungException("yaþýnýz seçime girmek için ço küçük " + age);
		}
	}
}
