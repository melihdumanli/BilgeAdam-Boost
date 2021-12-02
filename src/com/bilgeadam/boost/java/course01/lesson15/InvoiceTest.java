package com.bilgeadam.boost.java.course01.lesson15;

import com.bilgeadam.boost.java.course01.util.BAUtils;

public class InvoiceTest {

	public static void main(String[] args) {
		Invoice inv1 = new Invoice();
		Invoice inv2 = new Invoice();
		Invoice inv3 = new Invoice();

		
		inv1.name = BAUtils.readString("L�tfen lokanta ad�n� giriniz");
		inv1.netValue = BAUtils.readDouble("L�tfen fatura mebla��n� giriniz");
		int vat = BAUtils.readInt("L�tfen KDV oran�n� giriniz");
		inv1.calcVAT(vat);
		System.out.println(inv1.taxedValue);
		
		inv2.name = "K�rtasiye";
		inv2.netValue = 160.75d;
		inv2.calcVAT(8);
		System.out.println(inv2.taxedValue);
		
		inv3.name = "Market";
		inv3.netValue = 250.0d;
		inv3.calcVAT(15);
		System.out.println(inv3.taxedValue);
		
		//Toplam ne kadar �demem var?
		System.out.println("Toplam harcama: " +Invoice.totalAmount);
		System.out.println("Ortalama harcama: " + Invoice.average());
		
		//�dedi�im en y�ksek fatura bedelini bilmek istiyorum
		System.out.println("En b�y�k harcama: " + Invoice.maxInvoiceValue);
	}

}
