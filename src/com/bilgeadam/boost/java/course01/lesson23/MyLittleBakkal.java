package com.bilgeadam.boost.java.course01.lesson23;

import java.util.HashMap;
import java.util.LinkedList;

import com.bilgeadam.boost.java.course01.util.BAUtils;

public class MyLittleBakkal {
	private LinkedList<Product> products;

	public MyLittleBakkal() {
		this.products = new LinkedList<>();
	}

	public static void main(String[] args) {

		BAUtils.header("B E N Ý M   B A K K A L I M");

		MyLittleBakkal           bakkal = new MyLittleBakkal();
		HashMap<Integer, String> menu   = bakkal.initMenu();
		boolean                  cont   = true;
		do {
			int selection = BAUtils.menu(menu);
			cont = bakkal.processMenu(selection);
		} while (cont);

		BAUtils.footer();

	}

	private boolean processMenu(int selection) {

		boolean retVal = switch (selection) {
		case 2: {
			productList();
			yield true;
		}
		case 8: {
			enterNewProduct();
			yield true;
		}
		case 99: {
			yield false;
		}
		default: {
			System.out.println(selection + " seçildi");
			yield true;
		}
		};
		return retVal;
	}

	private void productList() {
		int size = this.products.size();
		System.out.println("Bakkalda " + size + " ürün var");
		for (int i = 0; i < size; i++) {
			Product product = products.get(i);

			if (product instanceof PackagedGood) {
				PackagedGood pG = (PackagedGood) product;
				System.out.println(pG.isSpoiled());
			}
			System.out.println(products.get(i));
		}
	}

	private void enterNewProduct() {
		BAUtils.header("Ürün Giriþi");

		String ean      = BAUtils.readString("Lütfen EAN kodunu giriniz");
		String name     = BAUtils.readString("Lütfen ürün adýný giriniz");
		float  price    = (float) BAUtils.readDouble("Lütfen ürün fiyatýný giriniz");
		int    vat      = BAUtils.readInt("Lütfen KDV oranýný giriniz");
		int    minStock = BAUtils.readInt("Lütfen asgari ürün miktarýný giriniz");
		String packed   = BAUtils.readString("Ürün paketli mi? (evet/hayýr)");
		if (packed.equalsIgnoreCase("evet")) {
			int          experationDate = BAUtils.readInt("Lütfen raf ömrünü giriniz");
			PackagedGood good           = new PackagedGood(ean, name, price, vat, minStock, experationDate);
			this.products.add(good);
		}
		else {
			String                origin = BAUtils.readString("Lütfen ürün menþeini giriniz");
			float                 volume = (float) BAUtils.readDouble("Lütfen ürün hacmini giriniz");
			PackedUnpackedProduct good   = new PackedUnpackedProduct(ean, name, price, vat, minStock, false);
			good.setOrigin(origin);
			good.setVolume(volume);
			this.products.add(good);
//			private Unit unit;
		}
	}

	private HashMap<Integer, String> initMenu() {
		HashMap<Integer, String> menu = new HashMap<>();
		menu.put(1, "Çalýþan giriþi");
		menu.put(2, "Ürün Listele");
		menu.put(8, "Ürün gir");
		menu.put(23, "Stok sorgula");
		menu.put(6, "Fiyat güncelle");
		menu.put(7, "Müþteri tanýmla");
		menu.put(3, "Müþteri listesi");
		menu.put(4, "Ürün listesi");
		menu.put(99, "Programý bitir");
		return menu;
	}

}
