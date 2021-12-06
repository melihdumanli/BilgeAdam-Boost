package com.bilgeadam.boost.java.course01.lesson66;

public class Student extends Person {
	private String parentsPhone;

	public Student() {
		super();
	}

	private Student(Builder builder) {
		this();
		this.firstName    = builder.firstName;
		this.lastName     = builder.lastName;
		this.birthdate    = builder.birthdate;
		this.partner      = builder.partner;
		this.parentsPhone = builder.parentsPhone;
	}

	@Override
	public void marry(Person partner) throws Exception {
		throw new Exception("A student cannot mary someone");
	}

	public String getParentsPhone() {
		return this.parentsPhone;
	}

	public static class Builder extends Person.Builder<Student>  implements Buildable {
		private String parentsPhone;

		public Builder parentsPhone(String parentsPhone) {
			this.parentsPhone = parentsPhone;
			return this;
		}

		public Student build() {
			return new Student(this);
		}
	}
}
