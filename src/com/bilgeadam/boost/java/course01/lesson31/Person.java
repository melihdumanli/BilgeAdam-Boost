package com.bilgeadam.boost.java.course01.lesson31;

import java.time.LocalDate;

public abstract class Person {
	private Name name;
	private Gender gender;
	protected CivilStatus marriageStatus;
	private LocalDate birthDate;
	protected int[] telephonNumbers;

	public abstract void getMaried() throws CannotGetMarriedException;
	
	public Person(Name name, Gender gender, CivilStatus marriageStatus, LocalDate birthDate) {
		super();
		this.name = name;
		this.gender = gender;
		this.marriageStatus = marriageStatus;
		this.birthDate = birthDate;
	}

	public CivilStatus getMarriageStatus() {
		return this.marriageStatus;
	}

	public int[] getTelephonNumbers() {
		return this.telephonNumbers;
	}

	public void setTelephonNumber(TELEPHONE_TYPE type, int telephonNumber) {
		this.telephonNumbers[type.getTelephoneIndex()] = telephonNumber;
	}

	public Name getName() {
		return this.name;
	}

	public Gender getGender() {
		return this.gender;
	}

	public LocalDate getBirthDate() {
		return this.birthDate;
	}

}
