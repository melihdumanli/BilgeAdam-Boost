package com.bilgeadam.boost.java.course01.lesson31;

public class Name {
	private String firstName;
	private String middleName;
	private String lastName;

	public Name(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = "";
	}

	public Name(String firstName, String middleName, String lastName) {
		super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public String getMiddleName() {
		return this.middleName;
	}

	public String getLastName() {
		return this.lastName;
	}

	@Override
	public String toString() {
		return "Name [" + this.firstName + " " + this.middleName + " " + this.lastName + "]";
	}

	
}
