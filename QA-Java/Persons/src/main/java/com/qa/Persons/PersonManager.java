package com.qa.Persons;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PersonManager {
	private List<Person> personList = new ArrayList<Person>();

	public List<Person> getPersonList() {
		return personList;
	}

	public void setPersonList(List<Person> personList) {
		this.personList = personList;
	}

	public List<Person> searchPerson(String name, List<Person> list) {
		List<Person> newList = new ArrayList<Person>();
		newList = list.stream().filter(a -> (a.getName()).equals(name)).collect(Collectors.toList());
		return newList;
	}

}