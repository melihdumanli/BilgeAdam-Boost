package com.bilgeadam.boost.java.course01.lesson27;

import java.io.Serializable;

public class Dimension  implements Serializable{
	private static final long serialVersionUID = 1L;
	private double length;
	private double width;
	
	public Dimension(double length, double width) {
		super();
		this.length = length;
		this.width  = width;
	}

	public double getLength() {
		return this.length;
	}

	public double getWidth() {
		return this.width;
	}

	public double getArea () {
		return width * length;
	}
	
	@Override
	public String toString() {
		return "Dimension [length=" + this.length + ", width=" + this.width + ", area=" + this.getArea() + "]";
	}
	
	
}
