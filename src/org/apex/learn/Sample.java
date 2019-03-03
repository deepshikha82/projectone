package org.apex.learn;

import java.util.Scanner;


public class Sample {
	
	public static void main(String args[]) {
		
		final int START_VALUE =0;
		 
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number:   ");
		int endValue = input.nextInt();
		
		print(START_VALUE, endValue);
		
		input.close();
	}
		 	
	public static void print(int startValue , int endValue){

		for(int index = startValue; index<=endValue ; index++)
			System.out.println(index);		
			
	}
	
}


