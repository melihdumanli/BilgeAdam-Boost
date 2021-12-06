package com.bilgeadam.boost.java.course01.lesson66;

import java.time.LocalDate;

import lombok.Data;
import lombok.Getter;
import lombok.ToString;

@Data
@ToString

public abstract class Person {
	@Getter
	protected String    firstName;
	protected String    lastName;
	protected LocalDate birthdate;
	protected Person    partner;

//	public Person() {
//		super();
//	}

//	private Person(Builder builder) {
//		this();
//		this.firstName = builder.firstName;
//		this.lastName  = builder.lastName;
//		this.birthdate = builder.birthdate;
//		this.partner   = builder.partner;
//	}

	public abstract void marry(Person partner) throws Exception;

	public static class Builder<T> implements Buildable{
		protected String    firstName = "";
		protected String    lastName  = "";
		protected LocalDate birthdate = LocalDate.MIN;
		protected Person    partner   = null;

		public Builder<T> firstName(String firstName) {
			this.firstName = firstName;
			return this;
		}

		public Builder<T> lastName(String lastName) {
			this.lastName = lastName;
			return this;
		}

		public Builder<T> birthdate(LocalDate birthdate) {
			this.birthdate = birthdate;
			return this;
		}

		public Builder<T> partner(Person partner) {
			this.partner = partner;
			return this;
		}

//		public Person build() {				// abstract sınıfın constrauctor'u olmaz
//			return new Person(this);
//		}
	}
}
