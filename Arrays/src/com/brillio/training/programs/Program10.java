package com.brillio.training.programs;

import java.util.Arrays;

public class Program10 {
	
	public static void main(String[] args) {
		Boolean b1;
		int[] a1 = new int[] {12, 23, 23, 12};
		b1=palin(a1);
		System.out.println(b1);
	}

	private static boolean palin(int[] a1) {
		
		int[] a2 = new int[a1.length];
		 int j=0;
		for (int i = a1.length-1; i >=0; i--) {
			
			a2[j] = a1[i];
			j++;
		}
			
		if(a1 == a2){
			return true;
		}
		else{
		return false;
		}
	}

}
