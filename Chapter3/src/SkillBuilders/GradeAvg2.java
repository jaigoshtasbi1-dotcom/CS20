package SkillBuilders;

import java.util.Scanner;

public class GradeAvg2 
{

	public static void main(String[] args) 
	{
		//Create Scanner Object
		Scanner userinput = new Scanner(System.in);
				
		//Declaration
		double average;
		int gradetotal = 0;
		int i;
				
		//Creates a loop that repeats 5 times
		for (i = 1; i < 6; i++) 
		{
			
		//Get grade from user
		System.out.print("Please input grade "+i+": ");
		
		//adds new grade to total
		gradetotal += userinput.nextInt();
		
		}
				
		//Calculate grade average
		average = (gradetotal / 5.00);
				
		//Display the grade average
		System.out.println( );
		System.out.println("The student grade average is: "+average+"%");
				
		//Close scanner object
		userinput.close();
	}

}
