package com.bilgeadam.boost.java.course01.lesson27;

import java.io.Serializable;

public class Name  implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String firstName;
	private String lastName;
	private String middleName;
	
	public Name(String firstName, String middleName, String lastName) {
		super();
		this.firstName  = firstName;
		this.lastName   = lastName;
		this.middleName = middleName;
	}
	
	public Name(String firstName, String lastName) {
		super();
		this.firstName  = firstName;
		this.lastName   = lastName;
		this.middleName = "";
	}

	public String getFirstName() {
		return this.firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public String getMiddleName() {
		return this.middleName;
	}

	@Override
	public String toString() {
		return "Name [getFirstName()=" + this.getFirstName() + ", getLastName()=" + this.getLastName()
				+ ", getMiddleName()=" + this.getMiddleName() + "]";
	}
	
	
}
