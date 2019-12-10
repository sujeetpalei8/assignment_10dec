package com.test.assignment_10dec;

import java.time.LocalDateTime;

public class Employee {
	private String name;
	private LocalDateTime dob;
	private String city;
	private int salary;

	public Employee() {

	}

	// Parameterized constructor
	public Employee(String name, LocalDateTime dob, String city, int salary) {
		this.name = name;
		this.dob = dob;
		this.city = city;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDateTime getDob() {
		return dob;
	}

	public void setDob(LocalDateTime dob) {
		this.dob = dob;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", dob=" + dob + ", city=" + city + ", salary=" + salary + "]"+"\n";
	}

	
}
