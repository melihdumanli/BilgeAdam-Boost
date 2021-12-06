package com.bilgeadam.boost.java.course01.lesson66;

public class BuilderFactory {
	
	public static Buildable create(PersonType type) {
		if (type == PersonType.STUDENT) {
			return new Student.Builder();
		}
		return new Worker.Builder();
	}
}
