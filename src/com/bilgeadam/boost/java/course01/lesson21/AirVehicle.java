package com.bilgeadam.boost.java.course01.lesson21;

public class AirVehicle extends Vehicle {
	private String name;
	private double maxAltitude;
	private double currAltitude;
	
	public AirVehicle(String brand, double maxSpeed) {
		super(brand, maxSpeed);
		this.maxAltitude = 0.0d;
		this.currAltitude = 0.0d;
	}

	public AirVehicle (String name, String brand, double maxSpeed, double mass, Color color) {
		super(brand, maxSpeed, mass, color);
		
		this.name = name;			// Airvehicle's name
		this.maxAltitude = 0.0d;
		this.currAltitude = 0.0d;
	}


	
	@Override
	public String toString() {
		return "AirVehicle [name=" + name + ", Üstisim=" + super.name + ", brand=" + brand + ", mass=" + mass + ", color=" + color + ", maxSpeed="
				+ maxSpeed + ", currSpeed=" + currSpeed  + "]";
	}

	@Override
	public void setName() {
		super.name = "Hava Taþýtý";	// Vehicle's name
	}

	@Override
	public void move(int accelaration) {
		System.out.println("uçuyorum");
		this.currSpeed += accelaration;
	}
	
	
}
