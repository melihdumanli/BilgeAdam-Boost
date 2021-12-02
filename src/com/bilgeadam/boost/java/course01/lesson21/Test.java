package com.bilgeadam.boost.java.course01.lesson21;

public class Test {

	public static void main(String[] args) {
//		Vehicle vehicle = new Vehicle("Volkswagen", 220.5);
//		System.out.println(vehicle);
//		vehicle.setColor(Color.BLUE);
//		System.out.println(vehicle);
		
		System.out.println();
		
//		Vehicle vehicle1 = new Vehicle("Airbus", 1000.0, 12200.75, Color.GREY);
//		System.out.println(vehicle1);
//		
		AirVehicle air = new AirVehicle("Helikopter", "Atak", 400.0, 5000.0, Color.BLACK);
		System.out.println(air);
		
		Airplane air2 = new Airplane("Uçak", "ýuyýu", 400.0, 5000.0, Color.BLACK, 5);
		System.out.println(air2);
		
//		for (Color color : args) {
//			System.out.println(color);
//		}
		
		String colour = switch (air2.color) {
		case BLACK: {
			yield "siyah";
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + air2.color);
		};
		
		System.out.println(colour);
		
		LandVehicle land1 = new LandVehicle("Fiat", 180.0d);
		System.out.println(land1);
		
		land1.move(10);
		air.move(200);
		
	}
}
