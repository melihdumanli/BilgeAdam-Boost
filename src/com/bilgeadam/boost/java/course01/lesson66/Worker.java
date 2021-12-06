package com.bilgeadam.boost.java.course01.lesson66;

public class Worker extends Person {
	private long salary;

	public Worker() {
		super();
	}

	private Worker(Builder builder) {
		this();
		this.firstName = builder.firstName;
		this.lastName  = builder.lastName;
		this.birthdate = builder.birthdate;
		this.partner   = builder.partner;
		this.salary    = builder.salary;
	}

	@Override
	public void marry(Person partner) throws Exception {
		this.setPartner(partner);
	}

	public long getSalary() {
		return this.salary;
	}

	public static class Builder extends Person.Builder<Worker> implements Buildable{
		private long salary = 0;

		public Builder salary(long salary) {
			this.salary = salary;
			return this;
		}

		public Worker build() {
			return new Worker(this);
		}
	}

	@Override
	public String toString() {
		return "Worker [getSalary()=" + this.getSalary() + ", getFirstName()=" + this.getFirstName()
				+ ", getLastName()=" + this.getLastName() + ", getBirthdate()=" + this.getBirthdate()
				+ ", getPartner()=" + this.getPartner() + ", hashCode()=" + this.hashCode() + ", toString()="
				+ super.toString() + ", getClass()=" + this.getClass() + "]";
	}

}
