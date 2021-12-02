package com.bilgeadam.boost.java.course01.lesson22;

public class Employee extends Person {
	protected double salary;
	private boolean fullTime;
	
	public Employee(long identityNumber, Gender gender, String firstName, String lastName, double salary, boolean fullTime) {
		super(identityNumber, gender, firstName, lastName);
		this.salary = salary;
		this.fullTime = fullTime;
	}

	public boolean isFullTime() {
		return fullTime;
	}

	public void setFullTime(boolean fullTime) {
		this.fullTime = fullTime;
	}
	
	
}
