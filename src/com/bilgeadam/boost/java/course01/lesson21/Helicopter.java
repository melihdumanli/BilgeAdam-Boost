package com.bilgeadam.boost.java.course01.lesson21;

public class Helicopter extends AirVehicle {

	public Helicopter(String name, String brand, double maxSpeed, double mass, Color color) {
		super(name, brand, maxSpeed, mass, color);
	}

	public Helicopter(String name, String brand, double maxSpeed) {
		super(brand, maxSpeed);
	}
}
