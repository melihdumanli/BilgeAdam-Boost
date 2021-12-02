package com.bilgeadam.boost.java.course01.lesson15;

public class Invoice {
	static double totalAmount = 0.0d;
	static int    numberOfInvoices = 0;
	static double maxInvoiceValue = 0.0;
	
	String name;
	double netValue;
	double taxedValue;
	
	void calcVAT(int vatRatio) {
		double tax = (this.netValue * vatRatio) / 100;
		this.taxedValue = this.netValue + tax;
		totalAmount += this.taxedValue;
		numberOfInvoices++;
		
		if (this.taxedValue > maxInvoiceValue) {
			maxInvoiceValue = this.taxedValue;
		}
	}
	
	static double average () {
		return totalAmount / numberOfInvoices;
	}
}
