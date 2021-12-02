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

		BAUtils.header("B E N � M   B A K K A L I M");

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
			System.out.println(selection + " se�ildi");
			yield true;
		}
		};
		return retVal;
	}

	private void productList() {
		int size = this.products.size();
		System.out.println("Bakkalda " + size + " �r�n var");
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
		BAUtils.header("�r�n Giri�i");

		String ean      = BAUtils.readString("L�tfen EAN kodunu giriniz");
		String name     = BAUtils.readString("L�tfen �r�n ad�n� giriniz");
		float  price    = (float) BAUtils.readDouble("L�tfen �r�n fiyat�n� giriniz");
		int    vat      = BAUtils.readInt("L�tfen KDV oran�n� giriniz");
		int    minStock = BAUtils.readInt("L�tfen asgari �r�n miktar�n� giriniz");
		String packed   = BAUtils.readString("�r�n paketli mi? (evet/hay�r)");
		if (packed.equalsIgnoreCase("evet")) {
			int          experationDate = BAUtils.readInt("L�tfen raf �mr�n� giriniz");
			PackagedGood good           = new PackagedGood(ean, name, price, vat, minStock, experationDate);
			this.products.add(good);
		}
		else {
			String                origin = BAUtils.readString("L�tfen �r�n men�eini giriniz");
			float                 volume = (float) BAUtils.readDouble("L�tfen �r�n hacmini giriniz");
			PackedUnpackedProduct good   = new PackedUnpackedProduct(ean, name, price, vat, minStock, false);
			good.setOrigin(origin);
			good.setVolume(volume);
			this.products.add(good);
//			private Unit unit;
		}
	}

	private HashMap<Integer, String> initMenu() {
		HashMap<Integer, String> menu = new HashMap<>();
		menu.put(1, "�al��an giri�i");
		menu.put(2, "�r�n Listele");
		menu.put(8, "�r�n gir");
		menu.put(23, "Stok sorgula");
		menu.put(6, "Fiyat g�ncelle");
		menu.put(7, "M��teri tan�mla");
		menu.put(3, "M��teri listesi");
		menu.put(4, "�r�n listesi");
		menu.put(99, "Program� bitir");
		return menu;
	}

}
