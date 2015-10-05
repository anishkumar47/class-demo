package com.brillio.training.programs;

import com.brillio.training.entity.Person;

public class CreatingObjects {
	public static void main(String[] args) {
		Person p1;// created a reference variable
		p1 = new Person(null, 0);//12bytes
		System.out.println("name is " + p1.name);
		System.out.println("age is " +p1.age+ " years");
	}

}
