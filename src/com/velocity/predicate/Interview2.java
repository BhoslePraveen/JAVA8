package com.velocity.predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Interview2 {

	public static void main(String[] args) {
		Person p1 = new Person("John", 26);
		Person p2 = new Person("Vijay", 16);
		Person p3 = new Person("Smith", 36);
		Person p4 = new Person("Raju", 6);
		Person p5 = new Person("Ranka", 56);

		// List<Person> persons = Arrays.asList(p1,p2,p3,p4,p5);

		List<Person> persons = new ArrayList<Person>();
		persons.add(p1);
		persons.add(p2);
		persons.add(p3);
		persons.add(p4);
		persons.add(p5);

		// Question : Print all the persons whose age is >18;

		Predicate<Person> check = person -> person.getAge() > 18;

		for (Person person : persons) {

			if(check.test(person)) {
				System.out.println(person);
			}
		}

	}

}
