package com.bilgeadam.boost.java.course01.lesson63;

public class Person {
	private String firstName;
	private String lastName;
	
	public Person(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName  = lastName;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + this.firstName + ", lastName=" + this.lastName + "]";
	}
}
