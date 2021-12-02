package com.bilgeadam.boost.java.course01.lesson26;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class InvoiceDate {

	public static void main(String[] args) {
//		LocalDate today = LocalDate.now();
		
		LocalDate shoppingday = LocalDate.of(2021, Month.DECEMBER, 17);
		
		
		LocalDate invoiceDate = LocalDate.of(shoppingday.getYear(), shoppingday.getMonth(), 15);
		
		if(shoppingday.getDayOfMonth() > 15) {
			invoiceDate = invoiceDate.plusMonths(1);
		}
		System.out.println("Fatura tarihi: " + invoiceDate);
		
		long daysToInvoice = shoppingday.until(invoiceDate, ChronoUnit.DAYS);
		System.out.println("Faturalamaya " + daysToInvoice + " gün kaldý");
		
		System.out.println(shoppingday.getYear());
		System.out.println(shoppingday.getDayOfYear());
	}

}
