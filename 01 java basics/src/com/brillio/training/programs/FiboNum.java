package com.brillio.training.programs;

import java.util.Scanner;

public class FiboNum {

	public static void main(String[] args) {
		int n, first = 0, second = 1, next, i, c;
		int[] d = new int[200];
		System.out.println("Enter the number to get the fin no.");
		Scanner in = new Scanner(System.in);
		n = in.nextInt();

		c = Display(n);
		System.out.println("number is " + c);
	}

	private static int Display(int s) {
		// TODO Auto-generated method stub

		int n, first = 0, second = 1, next, i, c;
		int[] d = new int[200];
		for (i = 0; i < s; i++) {
			if (i <= 1)
				next = i;
			else {
				next = first + second;
				first = second;
				second = next;
			}
			//System.out.println("number is " + next);
			d[i] = next;
		}

		return d[s - 1];
	}
}
