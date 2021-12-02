package com.bilgeadam.boost.java.course01.lesson42;

import com.bilgeadam.boost.java.course01.lesson42.shape.ShapeFactory;

public class FactoryTest {

	public static void main(String[] args) {
		ShapeFactory factory = new ShapeFactory();
		
		factory.getShape("kare").draw();
		factory.getShape("dikdörtgen").draw();
		factory.getShape("daire").draw();
	}
}
