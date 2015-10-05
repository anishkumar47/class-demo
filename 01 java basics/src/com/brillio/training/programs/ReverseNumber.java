package com.brillio.training.programs;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		int a,b;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the integer");
		a = in.nextInt();
		System.out.println("a is " + a);
		b=Reverse(a);
		System.out.println("Reversed number is " +b);
	}

	private static int Reverse(int x) {
		// TODO Auto-generated method stub
		int reverse = 0;
		 while( x != 0 )
	      {
	          reverse = reverse * 10;
	          reverse = reverse + x%10;
	          x = x/10;
	      }
	 
	      //System.out.println("Reverse of entered number is "+reverse);
		 return reverse;
	}
	
}
