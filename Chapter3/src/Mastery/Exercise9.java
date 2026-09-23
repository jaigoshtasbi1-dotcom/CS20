/*

Program: HourCalculator.java          Last Date of this Revision: September 22, 2026

Purpose: An application that calculates total amount of time a user has spent asleep based on their birthdate and the current date.

*/

package Mastery;

import java.util.Scanner;

public class Exercise9 
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
			int year = 0;
			String month;
			int day = 0;
			int pyear = 0;
			String pmonth;
			int pday = 0;
			int monthnum = 0;
			int pmonthnum = 0;
			int hours;
			
			
			//Create Scanner Object
			Scanner userinput = new Scanner(System.in);
			
			//Program Description
			System.out.println(yellow+"This program calculates the total number of hours that you have spent sleeping over your lifetime."+reset);
			System.out.println( );
			
			//Asks user to input birth year
			System.out.print(blue+"What year were you born (enter a number): "+reset);
			//Checks if user inputted an int
			//Creates a error handling loop
			while (year<1900) //checks if input is after 1900
			{
			    if (userinput.hasNextInt()) //checks if input is an int
			    {
			        year = userinput.nextInt(); //asignes input to variable

			        if (year<1900) //checks again if input is after 1900
			        {
			        	//Error message if input is not after 1900
			            System.out.print(red + "Invalid input. Enter a valid year after 1900: " + reset);
			        }
			    } 
			    else 
			    {
			    	//Error message if year is not an int
			        System.out.print(red + "Invalid input. Enter a valid year after 1900: " + reset);
			        userinput.next(); //removed invalid input
			    }
			}
			
			//Asks user to type birth month
			System.out.print(blue+"What month were you born (type a month): "+reset);
			month = userinput.next().trim(); //Assigns variable and removes spaces
			// Creates an error handling loop
			while (!month.equalsIgnoreCase("January") &&
			       !month.equalsIgnoreCase("February") &&
			       !month.equalsIgnoreCase("March") &&
			       !month.equalsIgnoreCase("April") &&
			       !month.equalsIgnoreCase("May") &&
			       !month.equalsIgnoreCase("June") &&
			       !month.equalsIgnoreCase("July") &&
			       !month.equalsIgnoreCase("August") &&
			       !month.equalsIgnoreCase("September") &&
			       !month.equalsIgnoreCase("October") &&
			       !month.equalsIgnoreCase("November") &&
			       !month.equalsIgnoreCase("December"))
			{
			    // Error message if the month is invalid
			    System.out.print(red+"Invalid input. Enter a valid month: "+reset);
			    
			    month = userinput.next().trim();//Assigns variable and removes spaces
			}
			
			System.out.print(blue+"What day were you born (enter a number): "+reset);
			//Creates a error handling loop
			while (day < 1 || day > 30) //checks if input is between 1-30
			{
			    if (userinput.hasNextInt()) //checks if input is an int
			    {
			        day = userinput.nextInt(); //asignes input to variable

			        if (day < 1 || day > 30) //checks again if input is between 1-30
			        {
			        	//Error message if day is not between 1-30
			            System.out.print(red + "Invalid input. Enter a valid day from 1-30: " + reset);
			        }
			    } 
			    else 
			    {
			    	//Error message if day is not an int
			        System.out.print(red + "Invalid input. Enter a valid day from 1-30: " + reset);
			        userinput.next(); //removed invalid input
			    }
			}
			
			System.out.println( );
			
			System.out.print(blue+"What year is it today (enter a number): "+reset);
			//creates error handling loop
			while (pyear<year+1) //checks if input is after birth year
			{
			    if (userinput.hasNextInt()) //checks if input is an int
			    {
			        pyear = userinput.nextInt(); //asignes input to variable

			        if (pyear<year+1) //checks again if input is after birth year
			        {
			        	//Error message if input is not after birth year
			            System.out.print(red + "Invalid input. Enter a valid year after "+year+":" + reset);
			        }
			    } 
			    else 
			    {
			    	//Error message if pyear is not an int
			    	System.out.print(red + "Invalid input. Enter a valid year after "+year+":" + reset);
			        userinput.next(); //removed invalid input
			    }
			}
			
			System.out.print(blue+"What month is it today (type a month): "+reset);
			pmonth = userinput.next().trim(); //Assigns variable and removes spaces
			// Creates an error handling loop
			while (!pmonth.equalsIgnoreCase("January") &&
			       !pmonth.equalsIgnoreCase("February") &&
			       !pmonth.equalsIgnoreCase("March") &&
			       !pmonth.equalsIgnoreCase("April") &&
			       !pmonth.equalsIgnoreCase("May") &&
			       !pmonth.equalsIgnoreCase("June") &&
			       !pmonth.equalsIgnoreCase("July") &&
			       !pmonth.equalsIgnoreCase("August") &&
			       !pmonth.equalsIgnoreCase("September") &&
			       !pmonth.equalsIgnoreCase("October") &&
			       !pmonth.equalsIgnoreCase("November") &&
			       !pmonth.equalsIgnoreCase("December"))
			{
			    // Error message if the month is invalid
			    System.out.print(red+"Invalid input. Enter a valid month: "+reset);
			    
			    pmonth = userinput.next().trim();//Assigns variable and removes spaces
			}
			
			System.out.print(blue+"What day is it today (enter a number): "+reset);
			//Creates a error handling loop
			while (pday < 1 || pday > 30) //checks if input is between 1-30
			{
			    if (userinput.hasNextInt()) //checks if input is an int
			    {
			        pday = userinput.nextInt(); //asignes input to variable

			        if (pday < 1 || pday > 30) //checks again if input is between 1-30
			        {
			        	//Error message if pday is not between 1-30
			            System.out.print(red + "Invalid input. Enter a valid day from 1-30: " + reset);
			        }
			    } 
			    else 
			    {
			    	//Error message if pday is not an int
			        System.out.print(red + "Invalid input. Enter a valid day from 1-30: " + reset);
			        userinput.next(); //removed invalid input
			    }
			}
			//Assigns each month to a variable to be used in calculations
			if (month.equalsIgnoreCase("January"))
				monthnum = 1;
			else if (month.equalsIgnoreCase("February"))
				monthnum = 2;
			else if (month.equalsIgnoreCase("march"))
				monthnum = 3;
			else if (month.equalsIgnoreCase("april"))
				monthnum = 4;
			else if (month.equalsIgnoreCase("may"))
				monthnum = 5;
			else if (month.equalsIgnoreCase("june"))
				monthnum = 6;
			else if (month.equalsIgnoreCase("july"))
				monthnum = 7;
			else if (month.equalsIgnoreCase("august"))
					monthnum = 8;
			else if (month.equalsIgnoreCase("september"))
				monthnum = 9;
			else if (month.equalsIgnoreCase("october"))
				monthnum = 10;
			else if (month.equalsIgnoreCase("november"))
				monthnum = 11;
			else if (month.equalsIgnoreCase("december"))
				monthnum = 12;
			
			//Assigns each month to a variable to be used in calculations
			if (pmonth.equalsIgnoreCase("January"))
				pmonthnum = 1;
			else if (pmonth.equalsIgnoreCase("February"))
				pmonthnum = 2;
			else if (pmonth.equalsIgnoreCase("march"))
				pmonthnum = 3;
			else if (pmonth.equalsIgnoreCase("april"))
				pmonthnum = 4;
			else if (pmonth.equalsIgnoreCase("may"))
				pmonthnum = 5;
			else if (pmonth.equalsIgnoreCase("june"))
				pmonthnum = 6;
			else if (pmonth.equalsIgnoreCase("july"))
				pmonthnum = 7;
			else if (pmonth.equalsIgnoreCase("august"))
				pmonthnum = 8;
			else if (pmonth.equalsIgnoreCase("september"))
				pmonthnum = 9;
			else if (pmonth.equalsIgnoreCase("october"))
				pmonthnum = 10;
			else if (pmonth.equalsIgnoreCase("november"))
				pmonthnum = 11;
			else if (pmonth.equalsIgnoreCase("december"))
				pmonthnum = 12;
			
			//Calculates total hours spent sleeping
			hours = (((pyear *365 + (pmonthnum - 1) *30 + pday) - (year *365 + (monthnum - 1) *30 + day)) * 8);
			
			System.out.println( );
			//Displays total hours spent sleeping
			System.out.println(green+"You have spent "+hours+" hours sleeping over your lifetime.");
			
			//closes scanner object
			userinput.close();
	}

}

/*
This program calculates the total number of hours that you have spent sleeping over your lifetime.

What year were you born (enter a number): 2010
What month were you born (type a month): may
What day were you born (enter a number): 12321378
Invalid input. Enter a valid day from 1-30: 18

What year is it today (enter a number): 2026
What month is it today (type a month): september
What day is it today (enter a number): 22

You have spent 47712 hours sleeping over your lifetime.
*/