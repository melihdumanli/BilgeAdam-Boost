package com.bilgeadam.boost.java.course01.lesson27;

import java.io.Serializable;
import java.time.LocalDate;

public abstract class Realty implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String    name;
	private Address   adr;
	private Dimension dim;
	private LocalDate listingDate;
	private double    price;

	public Realty(String name, Address adr, Dimension dim, LocalDate listingDate) {
		super();
		this.name        = name;
		this.adr         = adr;
		this.dim         = dim;
		this.listingDate = listingDate;
		this.price       = 0.0;
	}

	public String getName() {
		return this.name;
	}

	public Address getAdr() {
		return this.adr;
	}

	public Dimension getDim() {
		return this.dim;
	}

	public LocalDate getListingDate() {
		return this.listingDate;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Realty [name=" + this.name + ", adr=" + this.adr + ", dim=" + this.dim + ", listingDate="
				+ this.listingDate + ", price=" + this.price + "]";
	}

}
