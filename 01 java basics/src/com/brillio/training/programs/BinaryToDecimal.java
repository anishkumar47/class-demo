package com.brillio.training.programs;

import java.util.Scanner;

public class BinaryToDecimal {
	
	public static void main(String a[]){
    	int c;
    	long binary;
    	System.out.println("enetr binary number");
    	Scanner in=new Scanner(System.in);
    	binary=in.nextLong();
        //BinaryToDecimal bd = new BinaryToDecimal();
        c=getDecimalFromBinary(binary);
        System.out.println("decimal is "+c);

    }
	 
    public static int getDecimalFromBinary(long binary){
         
        int decimal = 0;
        int power = 0;
        while(true){
            if(binary == 0){
                break;
            } else {
                long tmp = binary%10;
                decimal += tmp*Math.pow(2, power);
                binary = binary/10;
                power++;
            }
        }
        return decimal;
    }
     
    
}
