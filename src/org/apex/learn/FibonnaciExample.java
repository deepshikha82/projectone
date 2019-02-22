package org.apex.learn;

import java.util.Scanner;

public class FibonnaciExample {
	public static void main(String args[]) {
		
		int maxNumber = 0;
		int previousNumber = 0;
		int nextNumber = 1;
		System.out.println("How much number you want in Fibonnaci:");
	
	Scanner scanner = new Scanner(System.in);
	
	maxNumber = scanner.nextInt();
	
	System.out.print("Fibonnaci Series of " +maxNumber+ "numbers" );
	
	for (int i = 1; i<=maxNumber; ++i) {
		System.out.print(previousNumber +"    ");
		
		int sum = previousNumber+ nextNumber;
		previousNumber = nextNumber;
		nextNumber = sum;
		
		
	}
	
	

	
	
	}	

}
