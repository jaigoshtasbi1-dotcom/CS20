package SkillBuilders;

import java.util.Scanner;

public class PerfectSquare 
{

	public static void main(String[] args) 
	{
		Scanner userinput = new Scanner(System.in);
		
		int num = 0;
		
		System.out.println("Enter an int");
		num = userinput.nextInt();
		
		if ((Math.sqrt(num)) == (int)(Math.sqrt(num)))
		{
			System.out.println("Number is a perfect square");
		}
		else
		{
			System.out.println("Number is not a perfect square");
		}
		
		userinput.close();
		
	}

}
