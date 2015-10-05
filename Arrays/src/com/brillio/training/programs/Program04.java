package com.brillio.training.programs;

import com.brillio.training.entity.Person;

public class Program04 {

	public static void main(String[] args) {

		// persons is not a reference to a person or objects
		// but it is a reference to an array of person object
		Person[] persons;
		persons = new Person[3];
		persons[0] = new Person(1, "Vinod", "bangalore");
		persons[1] = new Person(2, "Anish", "Patna");
		persons[2] = new Person(3, "jaya", "chennai");
		for (Person p1 : persons) {
			System.out.println(p1);
		}

	}
}
