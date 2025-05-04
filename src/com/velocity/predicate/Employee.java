package com.velocity.predicate;

public class Employee {
	private String name;
	private String location;
	private String dept;

	public Employee(String name, String location, String dept) {
		super();
		this.name = name;
		this.location = location;
		this.dept = dept;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", location=" + location + ", dept=" + dept + "]";
	}
}
