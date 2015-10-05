package com.brillio.training.programs;

import java.util.Scanner;

public class SortNumbers {
	public static void main(String[] args) {
		int a, b, c;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the integers");
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		System.out.println("a = " + a + " b = " + b + " c = " + c);
		sort(a, b, c);
	}

	private static void sort(int num1, int num2, int num3) {
		if ((num1 < num2) && (num2 < num3)){
		    System.out.println("The sorted numbers are " + num1 + " " + num2 + " " + num3);
		    }
		if ((num1 < num2) && (num2 > num3)){
		    System.out.println("The sorted numbers are " + num1 + " " + num3 + " " + num2);
		    }
		if ((num1 > num2) && (num2 > num3)){
		    System.out.println("The sorted numbers are " + num3 + " " + num2 + " " + num1);
		    }
		if ((num1 > num2) && (num2 < num3)){
		    System.out.println("The sorted numbers are " + num2 + " " + num1 + " " + num3);
		    }
		if((num1 < num2) && (num3 < num1) &&(num3 < num2)){
			System.out.println("The sorted numbers are " + num3 + " " + num1 + " " + num2);
		}
	}

}
