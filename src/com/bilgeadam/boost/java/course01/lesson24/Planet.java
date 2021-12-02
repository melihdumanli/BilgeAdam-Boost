package com.bilgeadam.boost.java.course01.lesson24;

import com.bilgeadam.boost.java.course01.util.BAUtils;

public enum Planet {
	MERCURY("Merkür", 3.303e+23, 2.4397e6), VENUS("Venüs", 4.869e+24, 6.0518e6), EARTH("Dünya", 5.976e+24, 6.37814e6),
	MARS("Mars", 6.421e+23, 3.3972e6), JUPITER("Jüpiter", 1.9e+27, 7.1492e7), SATURN("Satürn", 5.688e+26, 6.0268e7),
	URANUS("Üranus", 8.686e+25, 2.5559e7), NEPTUNE("Neptün", 1.024e+26, 2.4746e7);

	// universal gravitational constant (m3 kg-1 s-2)
	private static final double G = 6.67300E-11;

	private final String name;
	private final double mass;   // in kilograms
	private final double radius; // in meters

	Planet(String name, double mass, double radius) {
		this.name   = name;
		this.mass   = mass;
		this.radius = radius;
	}

	public static void main(String[] args) {
		BAUtils.header("U Z A Y   K Ý L O N U Z");
		
		double earthWeight = BAUtils.readDouble("Dünyadaki aðýrlýðýnýzý giriniz");
		double mass        = earthWeight / EARTH.surfaceGravity();
		
		for (Planet p : Planet.values()) {
			System.out.printf("\t%s'teki aðýrlýðýnýz %.2fkg\n", p.getName(), p.surfaceWeight(mass));
		}
		
		BAUtils.footer();
	}

	public String getName() {
		return this.name;
	}

	double surfaceGravity() {
		return G * mass() / (radius * radius());
	}

	double surfaceWeight(double otherMass) {
		return otherMass * surfaceGravity();
	}

	private double mass() {
		return mass;
	}

	private double radius() {
		return radius;
	}

}