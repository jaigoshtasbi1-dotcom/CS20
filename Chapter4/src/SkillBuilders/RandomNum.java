package SkillBuilders;

import java.util.Scanner;

public class RandomNum 
{

	public static void main(String[] args) 
	{

		//Create Scanner Object
				Scanner userinput = new Scanner(System.in);
				
		int min = 0;
		int max = 0;
		
		System.out.println("Please input a number: ");
		min = userinput.nextInt();
		
		System.out.println("Please input a number larger than "+min+": ");
		max = userinput.nextInt();
		
		int randomNumber = (int)(Math.random() * (max - min + 1)) + min;

		
		System.out.println("The random number is "+randomNumber);
		
		userinput.close();
		
	}

}
