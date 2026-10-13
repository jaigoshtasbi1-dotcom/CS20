package SkillBuilders;

import java.util.Scanner;

public class NumberSum 
{

	public static void main(String[] args) 
	{
		Scanner userinput = new Scanner(System.in);
		
		int number;
		int i = 1;
		int sum = 0;
		
		System.out.println("Enter an integer greater than 1: ");
		number = userinput.nextInt();

		System.out.println( );
		
		for (; i <= number; i++)
		{
			System.out.println(i);
			sum = sum + i;
		}
		System.out.println( );
		System.out.println("The total sum is: "+sum);
		
		userinput.close();
	}

}
