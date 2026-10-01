/*

Program: PrintingCalculator.java          Last Date of this Revision: September 28, 2026

Purpose: An application that calculates total cost for printing a certain amount of paper copies

*/

package Mastery;

import java.util.Scanner;

public class Exercise1 
{

	public static void main(String[] args) 
	{
		//defines colors
		final String blue = "\u001B[94m";
		final String green = "\u001B[32m";
		final String red = "\u001B[31m";
		final String reset = "\u001B[0m";
		final String yellow = "\u001B[33m";
		
		//Declaration
		int copies = 0;
		double cost = 0;
		double total = 0;
		
		//Create Scanner Object
		Scanner userinput = new Scanner(System.in);
		
		//Program description
		System.out.println(yellow+"This programs calculates the cost of printing any amount of paper copies"+reset);
		System.out.println(" ");
		
		//Asks user to enter number of copies
		System.out.println(blue+"How many copies would you like to print?: "+reset);
		// Checks if userinput is a number above 0
		while (copies <= 0)
		{
			//Checks is userinput is an int
			if (userinput.hasNextInt())
			{
				//defines copies
				copies = userinput.nextInt();
				if (copies<=0)
				{
					//error message if copies is less than 1
					System.out.println(red+"Error: Please enter a valid integer greater than 0: "+reset);
				}
			}
			
			else
			{
				//error message if copies is not an int
				System.out.println(red+"Error: Please enter a valid integer greater than 0: "+reset);
				userinput.next();
			}
		}
		
		//Defines costs per copy based on how many copies the user inputted
		if (copies<=99)
		{
			cost = 0.3;
		}
		
		if (copies>=100 && copies<=499)
		{
			cost = 0.28;
		}
		
		if (copies>=500 && copies<=749)
		{
			cost = 0.27;
		}
		
		if (copies>=750 && copies<=1000)
		{
			cost = 0.26;
		}
		
		if (copies>=1001)
		{
			cost = 0.25;
		}
		
		//Calculates total cost and rounds to hundreth
		total = Math.round((cost*copies) * 100.0) / 100.0;
		
		//Displays cost per copy and total cost
		System.out.println(" ");
		System.out.println(green+"The price per copy is $"+cost+reset);
		System.out.println(green+"The total cost is $"+total+reset);
		
		//Closes Scanner
		userinput.close();
	}

}

/*
This programs calculates the cost of printing any amount of paper copies
 
How many copies would you like to print?: 
-1
Error: Please enter a valid integer greater than 0: 
568
 
The price per copy is $0.27
The total cost is $153.36
*/
