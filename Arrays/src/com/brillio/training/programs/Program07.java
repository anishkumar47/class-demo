package com.brillio.training.programs;

public class Program07 {
	public static void main(String[] args) {

		// to supply command line arguments in eclipse
		// use the menu "Run -> "Run Configurations"
		// select "Argument" tab
		// pass the values through "program argument
		// to supply string values use double quotes
		// to supply double quotes as part of the input ,escape them
		// for example: "5' 10\" will be accepted as 5' 10"

		System.out.println("there are " + args.length + " command line arguments");

		for (int i = 0; i < args.length; i++) {
			System.out.println("args[" + i + "] is" + args[i]);
		}
	}

}
