/*

Program: GuessingGame.java          Last Date of this Revision: October 8, 2026

Purpose: An application that generates a random integer between 1 and 20, then gives the user infinite tries to guess it.

*/

package Mastery;

import java.util.Scanner;

public class Exercise8 
{

	public static void main(String[] args) 
	{
		
		//creates scanner object
		Scanner userinput = new Scanner(System.in);
		
		//declarations
		int rando = (int)(Math.random()*20)+1; //generates random number between 1 and 20
		int guess = -1;
		int i = 1;
		
		//defines colors
		final String blue = "\u001B[94m";
		final String green = "\u001B[32m";
		final String red = "\u001B[31m";
		final String reset = "\u001B[0m";
		final String yellow = "\u001B[33m";
		
		//program description
		System.out.println(yellow+"This is a guessing game: You have infinite guesses to guess the number"+reset);
		System.out.println( );
		
		//prompts user to make a guess
		System.out.println(blue+"Enter a number between 1 and 20: "+reset);

		//loop to allow for infinite guesses
		while (i == 1)
		{
			//defines guess
			guess = -1;
			
			//error handling loop, checks if guess is between 1 and 20
			while (guess<1 || guess>20)
			{
				//Checks is userinput is an int
				if (userinput.hasNextInt())
				{
					//defines guess
					guess = userinput.nextInt();
					//Checks again if integer is between 1 and 20
					if (guess<1 || guess>20)
					{
						//error message if integer is not between 1 and 20
						System.out.println(red+"Error: Please enter a valid integer between 1 and 20: "+reset);
					}
				}
				else
				{
					//error message if guess is not an int
					System.out.println(red+"Error: Please enter a valid integer between 1 and 20: "+reset);
					userinput.next();
				}
			}
			
			//if guess is correct
			if (guess==rando)
			{
				//display correct guess message
					System.out.println(green+"You Guessed it!"+reset);
					break;
				
			}
			//if guess is not correct
			else
			{
				//display not correct message
				System.out.println(red+"Wrong guess, try again."+reset);
				
			}
		}
		
		//closes scanner object
		userinput.close();
		
	}

}

/*
This is a guessing game: You have infinite guesses to guess the number

Enter a number between 1 and 20: 
a
Error: Please enter a valid integer between 1 and 20: 
1
Wrong guess, try again.
2
Wrong guess, try again.
a
Error: Please enter a valid integer between 1 and 20: 
1
Wrong guess, try again.
1212
Error: Please enter a valid integer between 1 and 20: 
-1
Error: Please enter a valid integer between 1 and 20: 
1.1
Error: Please enter a valid integer between 1 and 20: 
12
Wrong guess, try again.
134
Error: Please enter a valid integer between 1 and 20: 
14
Wrong guess, try again.
15
Wrong guess, try again.
16
Wrong guess, try again.
17
Wrong guess, try again.
20
Wrong guess, try again.
19
Wrong guess, try again.
18
Wrong guess, try again.
1
Wrong guess, try again.
2
Wrong guess, try again.
3
You Guessed it!

*/