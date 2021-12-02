package com.bilgeadam.boost.java.course01.lesson19;

public class CacheTest {

	public static void main(String[] args) {
		CacheShirt shirts = new CacheShirt();
		Shirt s1 = new Shirt();
		s1.label = "mavi";
		shirts.add(s1);
		System.out.println(shirts.get(0));
		
		TheCache<Integer> cache = new TheCache<>();
		cache.add(19879);
		System.out.println(cache.get(0));
	}

}
