package com.bilgeadam.boost.java.course01.lesson19;

public class CacheString {
	private String[] message = new String[10];
	private int count = 0;
	
	public void add(String msg) {
		message[count] = msg;
		count++;
	}
	
	public String get(int index) {
		return message[index];
	}
	
}
