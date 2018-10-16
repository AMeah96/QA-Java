package com.qa.Persons;

public class Person {
	private String name;
	private int age;
	private String jobTitle;

	public Person(String name, int age, String jobTitle) {
		this(name, age);
		this.jobTitle = jobTitle;
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {
		String formattedString = name + " " + age + " " + jobTitle;
		return formattedString;
	}

	// Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

}