/*

Program: ChangeCalculator.java          Last Date of this Revision: October 22, 2026

Purpose: An application that prompts the user to enter the amount of change they have, then calculates the dollar total

*/

package Mastery;

import java.util.Scanner;

public class Exercise5 
{

	public static void main(String[] args) 
	{

				//creates new scanner object
				Scanner userinput = new Scanner(System.in);
				
				//defines colors
				final String blue = "\u001B[94m";
				final String green = "\u001B[32m";
				final String red = "\u001B[31m";
				final String reset = "\u001B[0m";
				final String yellow = "\u001B[33m";

				//declarations
				int pennies = -1;
				int nickels = -1;
				int dimes = -1;
				int quarters = -1;
				
				//program description
				System.out.println(yellow+"This program calculates total coin value based on pennies, nickels, dimes, and quarters."+reset);
				System.out.println( );
				System.out.println(blue+"How many Pennies do you have: "+reset); //asks for penny count
				while (pennies < 0) //checks if input is greater than -1
				{
				    if (userinput.hasNextInt()) //checks if input is an int
				    {
				        pennies = userinput.nextInt(); //asignes input to variable

				        if (pennies < 0) //checks again if input is greater than -1
				        {
				        	//Error message if input is not greater than -1
				            System.out.print(red + "Invalid input. Enter a valid integer equal to or greater than 0: " + reset);
				        }
				    } 
				    else 
				    {
				    	//Error message if input is not an int
				        System.out.print(red + "Invalid input. Enter a valid integer equal to or greater than 0: " + reset);
				        userinput.next(); //removed invalid input
				    }
				}
				System.out.println(blue+"How many Nickels do you have: "+reset); //asks for nickel count
				while (nickels < 0) //checks if input is greater than -1
				{
				    if (userinput.hasNextInt()) //checks if input is an int
				    {
				        nickels = userinput.nextInt(); //asignes input to variable

				        if (nickels < 0) //checks again if input is greater than -1
				        {
				        	//Error message if input is not greater than -1
				            System.out.print(red + "Invalid input. Enter a valid integer equal to or greater than 0: " + reset);
				        }
				    } 
				    else 
				    {
				    	//Error message if input is not an int
				        System.out.print(red + "Invalid input. Enter a valid integer equal to or greater than 0: " + reset);
				        userinput.next(); //removed invalid input
				    }
				}
				System.out.println(blue+"How many Dimes do you have: "+reset); //asks for dime count
				while (dimes < 0) //checks if input is greater than -1
				{
				    if (userinput.hasNextInt()) //checks if input is an int
				    {
				        dimes = userinput.nextInt(); //asignes input to variable

				        if (dimes < 0) //checks again if input is greater than -1
				        {
				        	//Error message if input is not greater than -1
				            System.out.print(red + "Invalid input. Enter a valid integer equal to or greater than 0: " + reset);
				        }
				    } 
				    else 
				    {
				    	//Error message if input is not an int
				        System.out.print(red + "Invalid input. Enter a valid integer equal to or greater than 0: " + reset);
				        userinput.next(); //removed invalid input
				    }
				}
				System.out.println(blue+"How many Quarters do you have: "+reset); //asks for quarter count
				while (quarters < 0) //checks if input is greater than -1
				{
				    if (userinput.hasNextInt()) //checks if input is an int
				    {
				        quarters = userinput.nextInt(); //asignes input to variable

				        if (quarters < 0) //checks again if input is greater than -1
				        {
				        	//Error message if input is not greater than -1
				            System.out.print(red + "Invalid input. Enter a valid integer equal to or greater than 0: " + reset);
				        }
				    } 
				    else 
				    {
				    	//Error message if input is not an int
				        System.out.print(red + "Invalid input. Enter a valid integer equal to or greater than 0: " + reset);
				        userinput.next(); //removed invalid input
				    }
				}
				
				//Runs AddCoins method to calculate total coin value
				System.out.println(green+"Total Coin Value = "+AddCoins(pennies, nickels, dimes, quarters)+reset);
				
				//closes scanner object
				userinput.close();
		
	}

	//creates AddCoins method
	public static String AddCoins(int pennies, int nickels, int dimes, int quarters)
	{
		//Calculates the total value in cents
		int total = (pennies + (nickels * 5) + (dimes * 10) + (quarters * 25));
		
		//Displays dollar sign, and rounds total to a dollar value with 2 decimal places.
		return String.format("$%.2f", total / 100.00);
	}
	
}

/*
This program calculates total coin value based on pennies, nickels, dimes, and quarters.

How many Pennies do you have: 
132
How many Nickels do you have: 
a
Invalid input. Enter a valid integer equal to or greater than 0: 21
How many Dimes do you have: 
12
How many Quarters do you have: 
5
Total Coin Value = $4.82
*/