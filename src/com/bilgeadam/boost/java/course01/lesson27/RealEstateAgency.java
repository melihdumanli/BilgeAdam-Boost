package com.bilgeadam.boost.java.course01.lesson27;

import java.io.Serializable;
import java.util.HashMap;

public class RealEstateAgency implements Serializable{
	private static final long serialVersionUID = 1L;
	private String                  name;
	private Address					adress;
	private HashMap<String, Realty> realties;  // key=name -- value=Realty
	// çalýþanlar

	public RealEstateAgency(String name, Address adress) { // emlak danýþmanlýðý þirketi
		this.name = name;
		this.adress = adress;
		this.realties = new HashMap<>();
	}

	public void addRealty(Realty realty) {
		this.realties.put(realty.getName(), realty);
	}
	
	public Realty getRealty(String name) {
		return this.realties.get(name);
	}

	@Override
	public String toString() {
		return "RealEstateAgency [name=" + this.name + ", adress=" + this.adress + ", realties=" + this.realties + "]";
	}
	
	
}
