package com.bilgeadam.boost.java.course01.lesson27;

import java.io.Serializable;
import java.util.Arrays;

public class Person implements Serializable {
	private static final long serialVersionUID = 1L;
	private static int MAX_ADDRESSES = 3;
	private Name name;
	private Address[] address;
	private int currentIndex;
	
	public Person(Name name) {
		super();
		this.name = name;
		this.address = new Address[MAX_ADDRESSES];
		this.currentIndex = 0;
	}
	
	public void addAddress(Address address) throws MaxNumberOfAddressesReachedException {
		if (currentIndex < Person.MAX_ADDRESSES)
			this.address[currentIndex++] = address;
		else 
			throw new MaxNumberOfAddressesReachedException("Ekliyebilecek baþka adres alaný kalmadý");
	}

	public Name getName() {
		return this.name;
	}

	public Address[] getAddress() {
		return this.address;
	}

	@Override
	public String toString() {
		return "Person [getName()=" + this.getName() + ", getAddress()=" + Arrays.toString(this.getAddress()) + "]";
	}

	
}
