package com.brillio.training.programs;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		int a,b,c;
		Scanner in = new Scanner(System.in);
		System.out.println("input three numbers : ");
		a= in.nextInt();
		b= in.nextInt();
		c= in.nextInt();
		System.out.println("The printed no's are :  ");
		System.out.println("\n a ="+ a + "b ="+ b +"c =" + c);
		
		biggest(a,b,c);
		
}
	
	static void biggest(int a, int b,int c){
		
		//int max;
		System.out.println("The numbers is ascending order are :");
		
		if(b>a && c>a)
		{
			if(b>c){
				System.out.println(a+"    " +c+ "    " + b) ;

			}
			else
			{
				System.out.println(a+"   " +b+ "  " + c);
				
			}
			
		}
		
		if(a>b && c>b)
		{
			if(a>c)
			{
				System.out.println(b +"    " +c+ "    " + a);
			}
			else
			{
				System.out.println(b +"    " +a+ "    " + c);
			}
		}
		if(a>c && b>c)
		{
			if(a>b)
			{
				System.out.println(c +"    "+ b +"    "+ a);
			}
			else
			{
				System.out.println(c +"    " + a +"   " + b);
			}
			
		}
		
	}
	

}

