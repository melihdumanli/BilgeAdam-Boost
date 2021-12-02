package com.bilgeadam.boost.java.course01.lesson22;

public class Teacher extends Employee implements Accountable{
	private int workingHours;
	
	public Teacher(long identityNumber, Gender gender, String firstName, String lastName, double salary, boolean fullTime) {
		super(identityNumber, gender, firstName, lastName, salary, fullTime);
	}

	@Override
	public double getSalary() {
		
		return this.salary;
	}

	@Override
	public void setWorkingHours(int hours) {
		this.workingHours = hours;
		
	}

	@Override
	public int getWorkingHours() {
		return this.workingHours;
	}

	@Override
	public double getHourlyRate() {
		return this.salary/(20*8);
	}

	public boolean isWorkingFullTime() {
		return this.isFullTime();
	}
}
