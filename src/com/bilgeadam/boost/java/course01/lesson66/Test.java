package com.bilgeadam.boost.java.course01.lesson66;

public class Test {

	public static void main(String[] args) {

		Student student = ((Student.Builder) new Student.Builder().firstName("bab").lastName("som"))
				.parentsPhone("567576").build();
		System.out.println(student);

		Worker worker = ((Worker.Builder) new Worker.Builder().firstName("bab").lastName("som")).salary(657699).build();
		System.out.println(worker);
		

	}
}
