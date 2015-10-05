package com.brillio.training.programs;

import java.util.Arrays;

public class Program09 {

	public static void main(String[] args) {

		int[] ar1 = new int[] { 14, 11, 10, 67, 41 };
		System.out.println(Arrays.toString(ar1));
	int[] a1=sum(ar1);
	System.out.println(Arrays.toString(a1));

	}

	private static int[] sum(int[] ar1) {

		int[] sum1 = new int[2];
		
		for (int i = 0; i < ar1.length; i++) {
			if (ar1[i] % 2 == 0) {
				sum1[0] += ar1[i];
			}
			else{
				sum1[1] +=ar1[i];
			}
		}
return sum1;


	}

}
