package com.bilgeadam.boost.java.course01.lesson08;

public class Greeting {
	public String msg;
	public int nonSense;
	
	@Override
	public boolean equals(Object obj) {
		Greeting other = (Greeting)obj;
		return this.msg == other.msg;
	}    

	
	@Override
	public String toString() {
		
		return super.toString() + " " + this.msg;
	}
}
