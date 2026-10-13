/*

Program: PrimeCalculator.java          Last Date of this Revision: October 8, 2026

Purpose: An application that prompts the user for two integers, displays whether they are prime numbers or not, and displays every prime number between them.

*/

package Mastery;

import java.util.Scanner;

public class Exercise1 
{

	public static void main(String[] args) 
	{
		// Defines scanner object
		Scanner userinput = new Scanner(System.in);
		
		//defines colors
		final String blue = "\u001B[94m";
		final String green = "\u001B[32m";
		final String red = "\u001B[31m";
		final String reset = "\u001B[0m";
		final String yellow = "\u001B[33m";
		
		//Declaration
		int num1 = -1;
		int num2 = -1;
		boolean prime1 = true;
		boolean prime2 = true;
		boolean prime = true;
		int primes;
		int i = 2;
		int g = 2;
		int j = 2;
		
		//Program description
		System.out.println(yellow+"This program calculates every prime number between the two user inputted numbers"+reset);
		System.out.println( );
		
		//Prompts user to enter a number
		System.out.println(blue+"Please enter an integer greater than 0: "+reset);
		
		//Error handling loop
		while (num1<1)
		{
			//Checks is userinput is an int
			if (userinput.hasNextInt())
			{
				//defines num1
				num1 = userinput.nextInt();
				//Checks again if integer is above 0
				if (num1<1)
				{
					//error message if integer is not above 0
					System.out.println(red+"Error: Please enter a valid integer greater than 0: "+reset);
				}
			}
			else
			{
				//error message if num1 is not an int
				System.out.println(red+"Error: Please enter a valid integer greater than 0: "+reset);
				userinput.next();
			}
		}
		
		//Prompts user for a second number
		System.out.println(blue+"Please enter another integer greater than "+num1+": "+reset);
		
		//error handling loop
		while (num2<num1)
		{
			//Checks is userinput is an int
			if (userinput.hasNextInt())
			{
				//defines num2
				num2 = userinput.nextInt();
				//Checks again if integer is above num1
				if (num2<num1)
				{
					//error message if integer is not above num1
					System.out.println(red+"Error: Please enter a valid integer greater than "+num1+": "+reset);
				}
			}
			else
			{
				//error message if num2 is not an int
				System.out.println(red+"Error: Please enter a valid integer greater than "+num1+": "+reset);
				userinput.next();
			}
		}
		
		//Checks if num1 is prime
		if (num1<2)
		{
			//not prime if its less than 2
			prime1 = false;
		}
		//checks to see if it is divisible by any number other than 1 and itself
		for (; i < num1; i++)
		{
			if (num1 % i == 0)
			{
				prime1 = false;
			}
		}
		
		//checks if num2 is prime
		if (num2<2)
		{
			//not prime if its less than 2
			prime2 = false;
		}
		//checks to see if it is divisible by any number other than 1 and itself
		for (; g < num2; g++)
		{
			if (num2 % g == 0)
			{
				prime2 = false;
			}
		}
		
		//displays whether or not num1 is prime
		System.out.println( );
		if (prime1)
		{
			System.out.println(green+num1+" is a prime number."+reset);
		}
		else
		{
			System.out.println(green+num1+" is not a prime number."+reset);
		}
		
		//displays whether or not num2 is prime
		if (prime2)
		{
			System.out.println(green+num2+" is a prime number."+reset);
		}
		else
		{
			System.out.println(green+num2+" is not a prime number."+reset);
		}
		
		//calculates and displays every prime number between the 2 user inputs
		System.out.println( );
		System.out.println(green+"The prime numbers between "+num1+" and "+num2+" are: "+reset);
		//checks every number between the 2 user inputs
		for (primes = num1; primes <= num2; primes++)
		{
			prime = true;
			
			//checks if the numbers are less than 2
			if (primes < 2)
			{
				prime = false;
			}
			
			//checks to see if the numbers are divisible by any number other than 1 and themselves
			for (j = 2; j < primes; j++)
			{
				if (primes % j == 0)
				{
					prime = false;
					break;
				}
			}
			if (prime)
			{
				//prints the number if it's prime
				System.out.print(green+primes+", "+reset);
			}
		}
		
		//closes scanner object
		userinput.close();
	}

}

/*
This program calculates every prime number between the two user inputted numbers

Please enter an integer greater than 0: 
-1
Error: Please enter a valid integer greater than 0: 
17
Please enter another integer greater than 17: 
39

17 is a prime number.
39 is not a prime number.

The prime numbers between 17 and 39 are: 
17, 19, 23, 29, 31, 37, 
*/