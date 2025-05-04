package com.velocity.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Interview3 {

	public static void main(String[] args) {
		Employee e1 = new Employee("Anil", "Pune", "DevOps");
		Employee e2 = new Employee("Rani", "Pune", "DevOps");
		Employee e3 = new Employee("Ganesh", "Hyd", "DB");
		Employee e4 = new Employee("Ashok", "Hyd", "DB");
		Employee e5 = new Employee("Vikas", "Mumbai", "Admin");

		List<Employee> employees = Arrays.asList(e1, e2, e3, e4, e5);

		// Q : Print all the employees who are in Hyd and is in DB
		// and Name starts with 'A';

		Predicate<Employee> p1 = emp -> "Hyd".equals(emp.getLocation());
		Predicate<Employee> p2 = emp -> "DB".equals(emp.getDept());
		Predicate<Employee> p3 = emp -> emp.getName().startsWith("A");

		// Predicate Joining and() , or()
		Predicate<Employee> p = p1.and(p2).and(p3);

		for (Employee employee : employees) {
			if (p.test(employee)) {
				System.out.println(employee);
			}
		}

	}

}
