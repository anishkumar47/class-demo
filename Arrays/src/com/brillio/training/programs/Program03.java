package com.brillio.training.programs;

public class Program03 {
	
	public static void main(String[] args) {
		//Array of 4 strings
		String[] names = {"Scott", "Miller", "Allen", "John"};
		//enhanced for loop (for-each loop)
		//introduced in java 1.5
		for(String name: names){
			System.out.println(name);
		}
		
	}

}
