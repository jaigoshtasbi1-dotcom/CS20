package SkillBuilders;

import java.util.Scanner;

public class GradeAvg1 
{

	public static void main(String[] args) 
	{

		//Create Scanner Object
		Scanner userinput = new Scanner(System.in);
		
		//Declaration
		double average;
		
		//Get five grades from user
		System.out.print("Please input 5 grades seperated by spaces: ");
		
		//Calculate grade average
		average = (userinput.nextInt() + userinput.nextInt() + userinput.nextInt() + userinput.nextInt() + userinput.nextInt()) / 5.00;
		
		//Display the grade average
		System.out.println( );
		System.out.println("The student grade average is: "+average);
		
		//Close scanner object
		userinput.close();
	}

}
