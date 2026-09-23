/*

Program: PlaceValueCalculator.java          Last Date of this Revision: September 22, 2026

Purpose: An application that requests a user inputted number then outputs the digit in the ones, tens, and hundreds place value.

*/

package Mastery;

import java.util.Scanner;

public class Exercise6 
{

	public static void main(String[] args) 
	{

		//defines colors
		final String blue = "\u001B[94m";
		final String green = "\u001B[32m";
		final String red = "\u001B[31m";
		final String reset = "\u001B[0m";
		
		//Declaration
		int number;
		int tens;
		int ones;
		int hundreds;
		int twodig;
		int onedig;

		//Create Scanner Object
		Scanner userinput = new Scanner(System.in);
				
		//Get number from user
		System.out.print(blue+"Please Input An Integer between 1-999: "+reset);
		
		//Creates a loop
		while (true)
		{
			//Checks if user inputted an integer
			if (userinput.hasNextInt())
			{
				number = userinput.nextInt();
				
				//Checks if user inputted an integer between 1 and 999
				if (number >= 1 && number <= 999)
				{
					break;
				}
				else
				{
					//error message if the integer is not between 1-999
					System.out.print(red+"Error! Please enter an integer between 1 and 999: "+reset);
					continue;
				}
			}
			else
			{
				//error messsage if the user did not input an integer
				System.out.print(red+"Error! Please enter an INTEGER between 1 and 999: "+reset);
				userinput.next();

				continue;
			}
		}
		
		//finds the number in the hundreds-place
		hundreds = (number / 100);
		
		//finds the number in the tens-place
		twodig = (number / 10);
		tens = (twodig % 10);
		
		//finds the number in the ones-place
		onedig = (number % 100);
		ones = (onedig % 10);
		
		//displays the number in the tens-place and ones-place
		System.out.println( );
		System.out.println(green+"The number in the hundreds-place is: "+hundreds+reset);
		System.out.println(green+"The number in the tens-place is: "+tens+reset);
		System.out.println(green+"The number in the ones-place is: "+ones+reset);
		
		//closes scanner object
		userinput.close();
	}

}

/*
Please Input An Integer between 1-999: -1
Error! Please enter an integer between 1 and 999: 452

The number in the hundreds-place is: 4
The number in the tens-place is: 5
The number in the ones-place is: 2
*/