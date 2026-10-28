/*

Program: UnitConverter.java          Last Date of this Revision: October 22, 2026

Purpose: An application that prompts the user with a variety of units to convert between.

*/

package Mastery;

import java.util.Scanner;

public class Exercise2 
{
	//main method
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
		int value = -1;
		int choice = 0;
		
		//Program Description
		System.out.println(yellow+"This program can convert between a wide variety of different units"+reset);
		System.out.println( );
		System.out.println(blue+"Enter an integer greater than 0: "+reset);
		while (value < 1) //checks if input is greater than 0
		{
		    if (userinput.hasNextInt()) //checks if input is an int
		    {
		        value = userinput.nextInt(); //asignes input to variable

		        if (value < 1) //checks again if input is greater than 0
		        {
		        	//Error message if value is not greater than 0
		            System.out.print(red + "Invalid input. Enter a valid integer greater than 0: " + reset);
		        }
		    } 
		    else 
		    {
		    	//Error message if value is not an int
		        System.out.print(red + "Invalid input. Enter a valid integer greater than 0: " + reset);
		        userinput.next(); //removed invalid input
		    }
		}
		
		//prompts the user with every unit conversion option
		System.out.println( );
		System.out.println(blue+"Enter 1 for inches to centimeters"+reset);
		System.out.println(blue+"Enter 2 for feet to centimeters"+reset);
		System.out.println(blue+"Enter 3 for yards to meters"+reset);
		System.out.println(blue+"Enter 4 for miles to kilometers"+reset);
		System.out.println(blue+"Enter 5 for centimeters to inches"+reset);
		System.out.println(blue+"Enter 6 for centimeters to feet"+reset);
		System.out.println(blue+"Enter 7 for meters to yards"+reset);
		System.out.println(blue+"Enter 8 for kilometers to miles"+reset);
		//prompts user to enter their choice
		System.out.println(yellow+"Choose a number from 1-8: "+reset);
		while (choice < 1 || choice > 8) //checks if input is between 1-8
		{
		    if (userinput.hasNextInt()) //checks if input is an int
		    {
		        choice = userinput.nextInt(); //asignes input to variable

		        if (choice < 1 || choice > 8) //checks again if input is between 1-8
		        {
		        	//Error message if choice is not between 1-8
		            System.out.print(red + "Invalid input. Enter a valid choice from 1-8: " + reset);
		        }
		    } 
		    else 
		    {
		    	//Error message if choice is not an int
		        System.out.print(red + "Invalid input. Enter a valid choice from 1-8: " + reset);
		        userinput.next(); //removed invalid input
		    }
		}
		
		//Executes the correct method based on the user's choice
		if (choice == 1)
		{
			System.out.print(green+value+" inches equals "+inchcentimeters(value)+" centimeters.");
		}
		else if (choice == 2)
		{
			System.out.print(green+value+" feet equals "+feetcentimeters(value)+" centimeters.");
		}
		else if (choice == 3)
		{
			System.out.print(green+value+" yards equals "+yardmeters(value)+" meters.");
		}
		else if (choice == 4)
		{
			System.out.print(green+value+" miles equals "+milekilometers(value)+" kilometers.");
		}
		else if (choice == 5)
		{
			System.out.print(green+value+" centimeters equals "+centimeterinches(value)+" inches.");
		}
		else if (choice == 6)
		{
			System.out.print(green+value+" centimeters equals "+centimeterfeet(value)+" feet.");
		}
		else if (choice == 7)
		{
			System.out.print(green+value+" meters equals "+meteryards(value)+" yards.");
		}
		else if (choice == 8)
		{
			System.out.print(green+value+" kilometers equals "+kilometermiles(value)+" miles.");
		}
		
		//closes scanner object
		userinput.close();
		
	}
	
	//method for inches to centimeters
	public static double inchcentimeters(double inches)
	{
		return inches * 2.54;
	}
	
	//method for feet to centimeters
	public static double feetcentimeters(double feet)
	{
		return feet * 30.48;
	}
	
	//method for yards to meters
	public static double yardmeters(double yard)
	{
		return yard / 1.0936133;
	}
	
	//method for miles to kilometers
	public static double milekilometers(double mile)
	{
		return mile * 1.60934;
	}
	
	//method for centimeters to inches
	public static double centimeterinches(double centimeters)
	{
		return centimeters / 2.54;
	}
	
	//method for centimeters to feet
	public static double centimeterfeet(double centimeters)
	{
		return centimeters / 30.48;
	}
	
	//method for meters to yards
	public static double meteryards(double meter)
	{
		return meter * 1.0936133;
	}
	
	//method for kilometers to miles
	public static double kilometermiles(double kilometers)
	{
		return kilometers / 1.609344;
	}

}

/*
This program can convert between a wide variety of different units

Enter an integer greater than 0: 
5

Enter 1 for inches to centimeters
Enter 2 for feet to centimeters
Enter 3 for yards to meters
Enter 4 for miles to kilometers
Enter 5 for centimeters to inches
Enter 6 for centimeters to feet
Enter 7 for meters to yards
Enter 8 for kilometers to miles
Choose a number from 1-8: 
3
5 yards equals 4.571999993050561 meters.
*/
