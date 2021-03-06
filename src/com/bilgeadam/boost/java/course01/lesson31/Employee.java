package com.bilgeadam.boost.java.course01.lesson31;

import java.time.LocalDate;
import java.util.Arrays;

public abstract class Employee extends Person {
	protected static int numOfEmployees = 0;

	private String registrationNumber;
	private LocalDate startDate;
	private LocalDate endDate;
	private double	startSalary;

	public Employee(Name name, Gender gender, CivilStatus marriageStatus, LocalDate birthDate, LocalDate startDate, double startSalary) {
		super(name, gender, marriageStatus, birthDate);
		this.startDate = startDate;
		this.endDate = LocalDate.MAX;
		this.setRegistrationNumber();
		this.telephonNumbers = new int[2];
		this.startSalary = startSalary;
	}

	public abstract void setRegistrationNumber();
	public abstract double currentSalary();
	
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public boolean isOldEmployee() {
		return this.endDate.isBefore(LocalDate.MAX);
	}

	public String getRegistrationNumber() {
		return this.registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public LocalDate getStartDate() {
		return this.startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return this.endDate;
	}

	public double getStartSalary() {
		return this.startSalary;
	}
	
	public void setHomePhone(int number) {
		this.setTelephonNumber(TELEPHONE_TYPE.HOME, number);
	}
	
	public void setCellPhone(int number) {
		this.setTelephonNumber(TELEPHONE_TYPE.CELLPHONE, number);
	}

	@Override
	public String toString() {
		return "Employee [registrationNumber=" + this.registrationNumber + ", startDate=" + this.startDate
						+ ", endDate=" + this.endDate + ", startSalary=" + this.startSalary + ", telephonNumbers="
						+ Arrays.toString(this.telephonNumbers) + "]";
	}
	
}
