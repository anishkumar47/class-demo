package com.brillio.training.programs;

import java.util.Arrays;

public class Program02 {
	public static void main(String[] args) {
		
		int [][] nums= {
				{10,20},
				{30,40,50,60}
		};
		for (int i = 0; i < nums.length; i++) {
			System.out.println(Arrays.toString(nums[i]));
			
		}
	}

}
