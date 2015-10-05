package com.brillio.training.programs;

import java.util.Scanner;

public class SumPrime {
	public static void main(String[] args) {
		int a, b, temp,s;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the integers");
		a = in.nextInt();
		b = in.nextInt();
		System.out.println("numbers are " + a + " " + b);
		s=Sum(a, b);
		System.out.println("Sum is " + s);
	}

	private static int Sum(int x, int y) {
		// TODO Auto-generated method stub
		int count, i, num = 0, sum = 0, temp;
		if (y < x) {
			temp = y;
			y = x;
			x = temp;
		}
		if (x < 0) {
			x = 0;
		}
		for (num = x; num <= y; num++) {

			count = 0;

			for (i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					count++;
					break;
				}
			}

			if (count == 0 && num != 1)
				sum += num;

		}
		return sum;

	}
}
