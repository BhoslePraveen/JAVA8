package com.velocity.stream1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Demo11 {

	public static void main(String[] args) {
		List<Student> students = new ArrayList<Student>();
		students.add(new Student("Vikas", 52));
		students.add(new Student("Bhaskar", 48));
		students.add(new Student("Vijay", 66));
		students.add(new Student("Pooja", 70));
		students.add(new Student("Ravi", 50));
		
//		students.stream()
//		.filter(s-> s.getMarks()>50)
//		.forEach(System.out::println);
		
		Demo11 demo = new Demo11();
		
		List<Student> collect = students.stream()
		.filter(demo::verifyMarks)
		.collect(Collectors.toList());
		
		System.out.println(collect);
	}

//	public boolean verifyMarks(int marks) {
//		if (marks > 50) {
//			return true;
//		} else {
//			return false;
//		}
//	}

//	public boolean verifyMarks(int marks) {
//		if (marks > 50) {
//			return true;
//		}
//		return false;
//	}

	public boolean verifyMarks(Student student) {
		return student.getMarks() > 50 ? true : false;
	}

}
