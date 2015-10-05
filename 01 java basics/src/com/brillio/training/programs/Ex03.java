package com.brillio.training.programs;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		int h , m ,s , exs;
		Scanner in = new Scanner(System.in);
		System.out.println("enter the time in hr:min:sec format");
		System.out.println("hour : ");
		h=in.nextInt();
		System.out.println("minutes :");
		m=in.nextInt();
		System.out.println("seconds :");
		s=in.nextInt();
		System.out.println("enter the extra time to be added :");
		exs = in.nextInt();
		
		predict(h,m,s,exs);
		
}
	
	static void predict(int h,int m,int s,int exs)
	{
		System.out.println("the future time is :");
		int sec=0;
		sec=s+exs;
		if(sec>0 && sec<60)
		{
			System.out.println(h + ":" + m + ":" + sec);
		}
		
		if(sec==60)
		{
			sec=00;
			m+=1;
			System.out.println(h + ":"+ m + ":" + sec);
		}
		
		if(sec>60)
		{
			m= m+(sec/60);
			sec%=60;
			if(m==60 )
			{
				h+=1;
				m=00;
				if(h>24)
				{
					h=01;
					m=00;
					//sec=00;
					System.out.println(h + ":" + m +":" + sec);
					System.exit(0);
				}
					
				System.out.println(h + ":" + m + ":" + sec);
			}
			else
			{
				System.out.println(h + ":" + m + ":" + sec) ;
			}
			
		}
		
	}

}
