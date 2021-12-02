package com.bilgeadam.boost.java.course01.lesson42;

/* generic interface */

public interface AbstractFactory<T> {
	T create(String type);
}
