package com.bilgeadam.boost.java.course01.lesson27;

import java.io.Serializable;

public class Address implements Serializable{
	
	private static final long serialVersionUID = -1016471676675536486L;
	private String street;
	private String city;
	private String country;
	private int number;
	
	public Address(String street, String city, String country, int number) {
		super();
		this.street  = street;
		this.city    = city;
		this.country = country;
		this.number  = number;
	}

	public String getStreet() {
		return this.street;
	}

	public String getCity() {
		return this.city;
	}

	public String getCountry() {
		return this.country;
	}

	public int getNumber() {
		return this.number;
	}

	@Override
	public String toString() {
		return "Address [getStreet()=" + this.getStreet() + ", getCity()=" + this.getCity() + ", getCountry()="
				+ this.getCountry() + ", getNumber()=" + this.getNumber() + "]";
	}
	
	
}
