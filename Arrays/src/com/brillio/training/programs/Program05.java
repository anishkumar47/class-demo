package com.brillio.training.programs;

import com.brillio.training.entity.Person;

public class Program05 {
	
	public static void main(String[] args) {
		
		Person p1 = new Person(774, "tom", "london");
		Person[] persons = {
				new Person(),
				new Person(778, "Anik", "bangalore"),
				new Person(779, "Ramesh", "kolkata"),
				p1
		};
		for (Person p2 : persons) {
			System.out.println(p2);
			
		}
	}

}
