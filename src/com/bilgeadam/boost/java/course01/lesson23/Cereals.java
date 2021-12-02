package com.bilgeadam.boost.java.course01.lesson23;


public class Cereals extends PackedUnpackedProduct implements Wholesalable{
	private int shelfLife;  //kaç gün taze kalýyor
	
	
	public Cereals(String EAN, String name, float price, int VATRate, int minStock, boolean packed) {
		super(EAN, name, price, VATRate, minStock, packed);
		// TODO Auto-generated constructor stub
	}


	@Override
	public double calculateDiscountPrice() {
		return this.getPrice() - this.getPrice() * 15 / 100;
	}

}
