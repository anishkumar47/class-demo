package com.brillio.training.programs;

import java.util.Arrays;

public class Program08 {

	public static void main(String[] args) {

		int[] ar1;
		int[] ar2;
		int[] ar3;
		ar3 = new int[10];
		ar1 = new int[] { 10, 23, 45, 60 };
		ar2 = new int[] { 67, 43, 90, 50, 54, 33 };
		System.out.println(Arrays.toString(ar1));
		System.out.println(Arrays.toString(ar2));
		odd(ar1, ar2);
		//System.out.println(Arrays.toString(ar3));
	}

	private static void odd(int[] ar1, int[] ar2) {

		int[] ar4 = new int[10];
		
		for (int j = 0; j < ar1.length; j++) {
		
			if(ar1[j]%2 != 0){
				ar4[j]=ar1[j];
				
			}
			
			
		}
		System.out.println(Arrays.toString(ar4));
			

	}

}
