/*

Program: MarkCalculator.java          Last Date of this Revision: September 29, 2026

Purpose: An application that outputs a mark based on the percentage grade that a user inputs

*/

package Mastery;

import java.util.Scanner;

public class Exercise5 
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
		int percentage = -10;
		String mark = null;
		
		//Create Scanner Object
		Scanner userinput = new Scanner(System.in);
		
		//describes program function
		System.out.println(yellow+"This program displays your mark based on what percentage you got on an assignment or test."+reset);
		System.out.println(" ");
		
		//asks user to input their grade percentage
		System.out.println(blue+"Enter your grade percentage (rounded to the nearest whole number): "+reset);
		
		//error handling loop
		//Checks if percentage is between 0-100
		while (percentage<0 || percentage>100)
		{
			//Checks is userinput is an int
			if (userinput.hasNextInt())
			{
				//defines percentage
				percentage = userinput.nextInt();
				//Checks again if percentage is between 0-100
				if (percentage<0 || percentage>100)
				{
					//error message if percentage is not between 0-100
					System.out.println(red+"Error: Please enter a valid whole number grade between 0-100: "+reset);
				}
			}
			
			else
			{
				//error message if percentage is not an int
				System.out.println(red+"Error: Please enter a valid whole number grade between 0-100: "+reset);
				userinput.next();
			}
		}
		
		//Defines the mark based on the percentage grade
		if (percentage<=29)
		{
			mark = "BG1";
		}
		
		if (percentage>=30 && percentage<=49)
		{
			mark = "BG2";
		}
		
		if (percentage>=50 && percentage<=59)
		{
			mark = "DV1";
		}
		
		if (percentage>=60 && percentage<=69)
		{
			mark = "DV2";
		}
		
		if (percentage>=70 && percentage<=79)
		{
			mark = "PR1";
		}
		
		if (percentage>=80 && percentage<=89)
		{
			mark = "PR2";
		}
		
		if (percentage>=90 && percentage<=99)
		{
			mark = "EX1";
		}
		
		if (percentage==100)
		{
			mark = "EX2";
		}
		
		//displays final mark, based on percentage grade inputted
		System.out.println(" ");
		System.out.println(green+"Your mark is: "+mark+reset);
		
		//closes scanner object
		userinput.close();
	}

}

/*
This program displays your mark based on what percentage you got on an assignment or test.
 
Enter your grade percentage (rounded to the nearest whole number): 
-10
Error: Please enter a valid whole number grade between 0-100: 
76
 
Your mark is: PR1
*/
