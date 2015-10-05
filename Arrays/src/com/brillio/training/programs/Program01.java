package com.brillio.training.programs;

import java.util.Arrays;

public class Program01 {
	public static void increment(int[] ar, int by) {
		for (int i = 0; i < ar.length; i++) {
			ar[i] += by;

		}
	}

	public static void main(String[] args) {
		int[] n = { 1, 45, 56 };
		// n=new int[3];
		// n = {12, 46,78} //error
		n = new int[] { 48, 98, 78 };
		n[2] = 34;
		n[0] = 44;
		n[1] = 66;
		// n[3] = 395;//throws ArrayIndexOutOfBoundException()
		int index = 2;
		System.out.println(n[index]);
		increment(n, 10);
		System.out.println(Arrays.toString(n));
	}

}
