package com.bilgeadam.boost.java.course01.lesson63;

public class Teacher extends Person{
	private double salary;

	public Teacher(String firstName, String lastName, double salary) {
		super(firstName, lastName);
		this.salary = salary;
	}
	
	public double getSalary() {
		return this.salary;
	}

	@Override
	public String toString() {
		return "Teacher [salary=" + this.salary + ", getFirstName()=" + this.getFirstName() + ", getLastName()="
				+ this.getLastName() + "]";
	}
}
