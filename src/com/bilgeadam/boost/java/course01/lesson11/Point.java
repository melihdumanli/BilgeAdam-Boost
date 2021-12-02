package com.bilgeadam.boost.java.course01.lesson11;

public class Point {
	private float x;
	private float y;
	private String name;
	
	public Point() {
		super();
	}

	
	public Point(float x, float y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public boolean equals (Object obj) {
		return (this.x == ((Point)obj).x && this.y == ((Point)obj).y);
		
	}

	@Override
	public String toString() {
		return "Point \'" + this.name + "\' X: " + this.x + " Y: " + this.y;
	}


	public float getX() {
		return x;
	}


	public void setX(float x) {
		this.x = x;
	}


	public float getY() {
		return y;
	}


	public void setY(float y) {
		this.y = y;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
}
