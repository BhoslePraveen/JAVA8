package com.velocity.sorted;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Demo2 {

	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(
				new Employee("Vijay", 25, 11000.25),
				new Employee("Ajay", 26, 13000.65),
				new Employee("Nakul", 29, 12000.25),
				new Employee("Bhasker", 28, 18000.25),
				new Employee("Pooja", 27, 16000.25),
				new Employee("Chaya", 26, 15000.25)
				);
		
		//Sort by salary (Natural Order of Integer)
//		employees.stream()
//	    .sorted((e1, e2) -> {
//	    	if(e1.getSalary()>e2.getSalary()) {
//	    		return 1;
//	    	}else if(e1.getSalary() == e2.getSalary()) {
//	    		return 0;
//	    	}else {
//	    		return -1;
//	    	}
//	    })
//	    .forEach(System.out::println);
		
		System.out.println("====================================");
		
		// Upgrade:1
//		employees.stream()
//	    .sorted((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()))
//	    .forEach(System.out::println);
		
		System.out.println("====================================");
		
		// Upgrade:2
//		employees.stream()
//	    .sorted(Comparator.comparing(e -> e.getSalary()))
//	    .forEach(System.out::println);
		
		System.out.println("====================================");
		
		// Upgrade:3
//		employees.stream()
//	    .sorted(Comparator.comparingDouble(e -> e.getSalary()))
//	    .forEach(System.out::println);
		
		System.out.println("====================================");
		
		// Upgrade:4
//		employees.stream()
//		.sorted(Comparator.comparingDouble(Employee::getSalary))
//		.forEach(System.out::println); 
		
		System.out.println("====================================");
		//Sort by age using comparingInt()
//		employees.stream()
//	    .sorted(Comparator.comparingInt(Employee::getAge))
//	    .forEach(System.out::println);
		
		System.out.println("====================================");
		
		// Reversed the order
//		employees.stream()
//	    .sorted(Comparator.comparingInt(Employee::getAge).reversed())
//	    .forEach(System.out::println);
		
		System.out.println("====================================");
		
		
		//Multiple level sort: salary, then name
		employees.stream()
	    .sorted(
	        Comparator.comparing(Employee::getSalary)
	                  .thenComparing(Employee::getName)
	    )
	    .forEach(System.out::println);
		
		System.out.println("====================================");
		
		employees.stream()
	      .sorted(Comparator.comparing(Employee::getName)
	              .thenComparing(Employee::getAge).reversed())
	      .forEach(System.out::println);  

	}

}
