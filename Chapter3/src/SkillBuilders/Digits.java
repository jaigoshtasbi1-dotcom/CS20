package SkillBuilders;

import java.util.Scanner;

public class Digits 
{

	public static void main(String[] args) 
	{

	
		//Declaration
		int number;
		int tens;
		int ones;

		//Create Scanner Object
		Scanner userinput = new Scanner(System.in);
				
		//Get number from user
		System.out.print("Please Input A Two Digit Integer: ");
		number = userinput.nextInt();
		//finds the number in the tens-place
		tens = (number / 10);
		
		//finds the number in the ones-place
		ones = (number % 10);
		
		//displays the number in the tens-place and ones-place
		System.out.println( );
		System.out.println("The number in the tens-place is: "+tens);
		System.out.println("The number in the ones-place is: "+ones);
		
		//closes scanner object
		userinput.close();
	}

}
