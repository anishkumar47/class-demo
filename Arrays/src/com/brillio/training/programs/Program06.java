package com.brillio.training.programs;

import com.brillio.training.entity.Person;

public class Program06 {
	
	public static void main(String[] args) {
		
		//this is not allocation of person object
		//this is for 3 references of person type
		//equivalent of creating person p1,p2,p3 
		Person[] persons = new Person[3];
		
		//must create a person object before using it for
		//invoking method
		
		//this line is equivalent to null.setid(4)
		//and will throw an exception of type nullpointerexception
		persons[0].setId(4);
		persons[0].setName("anish");
		persons[0].setCity("bangalore");
		System.out.println(persons[1]);
	}

}
