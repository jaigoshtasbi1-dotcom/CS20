package SkillBuilders;

import java.util.Scanner;

public class OddSum 
{

	public static void main(String[] args) 
	{
		Scanner userinput = new Scanner(System.in);
		
		int i = 1;
		int number = 0;
		int sum = 0;
		
		System.out.println("Enter an integer greater than 1: ");
		number = userinput.nextInt();
		
		for (; i<=number; i++)
		{
			if (i % 2 != 0)
			{
				System.out.println(i);
				sum = sum + i;
			}
			else
			{
			}
		}
		System.out.println( );
		System.out.println("The total sum of all odd numbers is: "+sum);
			
		userinput.close();
		
	}
	

}
