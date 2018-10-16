package com.qa.Persons;

import java.util.ArrayList;
import java.util.List;

public class Runner {
	public static void main(String[] args) {
		PersonManager Instructor = new PersonManager();
		Person p1 = new Person("Abidul", 22);
		p1.toString();

		Person p2 = new Person("Adonay", 24, "IT Consultant");
		Person p3 = new Person("Rob", 26, "IT Consultant");
		Person p4 = new Person("Ahmed", 24, "IT Consultant");

		List<Person> personList = new ArrayList<Person>();
		personList.add(p1);
		personList.add(p2);
		personList.add(p3);
		personList.add(p4);

		Instructor.setPersonList(personList);

		Instructor.getPersonList().forEach(System.out::println);

		System.out.println("-----------------------------------------");

		System.out.println("Search result:");
		System.out.println();

		(Instructor.searchPerson(p3.getName(), Instructor.getPersonList())).forEach(System.out::println);
	}
}
