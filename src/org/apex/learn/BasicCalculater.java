package org.apex.learn;

import java.util.Scanner;


public class BasicCalculater {
	
public static void main(String args[])	{

         int first, second ,add ,subtraction,multiply; 
         double divide;
          
         
         Scanner  scanner = new Scanner(System.in);
         
         System.out.println("Enter Two Numbers:      ");
         
         first = scanner.nextInt();
         second = scanner.nextInt();
         
         add = first + second;
         subtraction = first - second;
         multiply = first * second;
         divide =  first / second;
         
         System.out.println("sum = " + add);
         System.out.println("difference = " + subtraction);
         System.out.println("multiplication  = " + multiply);
         System.out.println("division  = " + divide);
        	
         scanner.close();
         
         

}
}

