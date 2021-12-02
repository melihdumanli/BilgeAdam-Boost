package com.bilgeadam.boost.java.course01.lesson63;

public class Student extends Person {
	private int regNumber;

	public Student(String firstName, String lastName, int regNumber) {
		super(firstName, lastName);
		this.regNumber = regNumber;
	}

	public int getRegNumber() {
		return this.regNumber;
	}

	@Override
	public String toString() {
		return "Teacher [salary=" + this.regNumber + ", getFirstName()=" + this.getFirstName() + ", getLastName()="
				+ this.getLastName() + "]";
	}

}
