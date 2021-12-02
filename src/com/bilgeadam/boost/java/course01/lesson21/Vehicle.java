package com.bilgeadam.boost.java.course01.lesson21;

public abstract class Vehicle {
	protected String name;
	protected String brand;
	protected double mass;
	protected Color color;
	protected double maxSpeed;
	protected double currSpeed;
	
	public Vehicle (String brand, double maxSpeed) {
		this.brand = brand;
		this.maxSpeed = maxSpeed;
		this.mass = 0.0d;
		this.color = Color.NO_COLOR;
		this.currSpeed = 0.0d;
	}
	
	public Vehicle (String brand, double maxSpeed, double mass, Color color) {
		this.brand = brand;
		this.maxSpeed = maxSpeed;
		this.mass = mass;
		this.color = color;
		this.currSpeed = 0.0;
	}
	
	public abstract void setName();
	public abstract void move(int accelaration);
	
	public String getName() {
		return name;
	}
	public String getBrand() {
		return brand;
	}
	public double getMass() {
		return mass;
	}
	public Color getColor() {
		return color;
	}
	public double getMaxSpeed() {
		return maxSpeed;
	}
	
	public double getCurrSpeed() {
		return currSpeed;
	}

	public void setMass(double mass) {
		this.mass = mass;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public void setCurrSpeed(double currSpeed) {
		this.currSpeed = currSpeed;
	}

	@Override
	public String toString() {
		return "Vehicle [getName()=" + getName() + ", getBrand()=" + getBrand() + ", getMass()=" + getMass()
				+ ", getColor()=" + getColor() + ", getMaxSpeed()=" + getMaxSpeed() + ", getCurrSpeed()="
				+ getCurrSpeed() + "]";
	}
	
	
	
}
