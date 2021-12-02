package com.bilgeadam.boost.java.course01.lesson22;

public class Test {

	public static void main(String[] args) {
		
		
		Person pers1 = new Student(5634573, Gender.NO_INFO, "Ali", "Veli");
		Student pers2 = new Student(5634573, Gender.NO_INFO, "Ali", "Veli");
		
//		pers1.add
		pers2.addCourse(null);
		Employee pers3 = new Employee(5634573, Gender.NO_INFO, "Ali", "Veli", 2000.0, true);
		
		System.out.println(pers1);
		pers1.setAge(34);
		pers1.setPersonsMiddleName("4950");
		System.out.println(pers1);
		
		System.out.println(pers1.getName().getFirstName());
		System.out.println(pers1.getName().getFirstName());
		System.out.println(pers1.getName().getFullName());
		pers1.setPersonsMiddleName("");
		System.out.println(pers1.getName().getFullName());
	}

}
