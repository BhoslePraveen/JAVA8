package com.velocity.groupingby;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Demo1 {

	/*
	 * groupingBy is a collector in the Collectors utility class that allows you to
	 * group elements of a stream by a classifier function.
	 */

	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(
				new Employee("Alice", "HR", 3000),
				new Employee("Bob", "IT", 4000),
				new Employee("Charlie", "HR", 3500),
				new Employee("David", "IT", 4500),
				new Employee("Eve", "Sales", 2500));
		
		// Group by Department:
		Map<String, List<Employee>> groupByDept = employees.stream()
			    .collect(Collectors.groupingBy(Employee::getDepartment));
		
//		groupByDept.forEach((dept, empList) -> {
//		    System.out.println("Department: " + dept);
//		    empList.forEach(System.out::println);
//		});
		
		// Group and Count Employees per Department
		Map<String, Long> countByDept = employees.stream()
			    .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		
		System.out.println(countByDept);
		
		// Group and Find Average Salary per Department
		Map<String, Double> avgSalaryByDept = employees.stream()
			    .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
		
		System.out.println(avgSalaryByDept);
		
		// Group and Map Employee Names Only
		Map<String, List<String>> namesByDept = employees.stream()
			    .collect(Collectors.groupingBy(Employee::getDepartment, 
			             Collectors.mapping(Employee::getName, Collectors.toList())));
		
		System.out.println(namesByDept);
		

		
	}

}
