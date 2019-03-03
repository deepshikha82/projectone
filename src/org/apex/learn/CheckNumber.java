package org.apex.learn;
import java.util.Scanner;

public class CheckNumber {
	
	public static void main(String args[]) {
		CheckNumber chk = new CheckNumber();
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		String input = scan.nextLine();
		try{
			boolean res = chk.isOddNumber(input);
			System.out.println("Output of isOddNumber : "+ res);
			
			res = chk.isEvenNumber(input);
			System.out.println("Output of isEvenNumber : "+ res);
			
			res = chk.isInteger(input);
			System.out.println("Output of isInteger : "+ res);
			
			res = chk.isPrimeNumber(input);
			System.out.println("Output of isPrimeNumber : "+ res);
		}
		catch(NumberFormatException nfe){
			System.out.println("Not a valid Input");
		}
		scan.close();
	}
	
	public boolean isInteger(String s) {
		
		boolean result = false;
		
		try {
			Integer.parseInt(s);
			result = true;
		
		}catch (NumberFormatException  nfe) {
			System.out.println("Not a valid input");
			System.exit(0);
	}
	return result;
	
	}
	
	public boolean isOddNumber(String s) {
		
		boolean result = false;
		try {
			int num = Integer.parseInt(s);
			if(num%2 == 0)
				result = false;
			else
				result = true;
		
		}catch (NumberFormatException  nfe) {
			System.out.println("Not a valid input");
			System.exit(0);
		}
	
		return result;
	
	}
	
	
	public boolean isEvenNumber(String s) {
		
        boolean result = false;
		
		try {
			int num = Integer.parseInt(s);
			if(num%2 == 0)
				result = true;
			else
				result = false;
		
		}catch (NumberFormatException  nfe) {
			System.out.println("Not a valid input");
			System.exit(0);
		}
		return result;
	
	}
	
	public boolean isPrimeNumber(String s) {
		boolean prime_check = false;
		try {
			int num = Integer.parseInt(s);
			int half_num = num /2;
			if(num == 0 || num == 1 ) 
				prime_check = false;
			else if(num == 3)
				prime_check = true;
			else 
				for(int i = 2; i <= half_num; i++) {
					if (num % i == 0) {
						prime_check = false;
						break;
					}
					else
						prime_check = true;
			
				}
		
		}catch (NumberFormatException  nfe) {
			System.out.println("Not a valid input");
			System.exit(0);
		}
		
		return prime_check;
		
	}
	
}

