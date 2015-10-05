package com.brillio.training.programs;

import java.util.Scanner;

public class numberOfDays {
	public static void main(String[] args) {
		
		int month;
		int year,n;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the month and year");
		month = in.nextInt();
		year = in.nextInt();
		n=noOfDays(month-1,year);
		System.out.println("number of days is " +n);
	}

	private static int noOfDays(int x, int year) {
		// TODO Auto-generated method stub
		int [] daysInMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
		int days;
		
		if(year/4==0 || x==2)
		{
			days=29;
		}
		else{
			days = daysInMonth[x];
		}
		//System.out.println("number of days is" +days);
		return days;
	}

}
