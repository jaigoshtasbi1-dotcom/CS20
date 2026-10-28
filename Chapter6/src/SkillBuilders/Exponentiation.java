package SkillBuilders;

import java.util.Scanner;

public class Exponentiation 
{

	public static void main(String[] args) 
	{

		Scanner userinput = new Scanner(System.in);
		
		int num;
		int power;
		double expo;
		
		System.out.println("Enter a number: ");
		num = userinput.nextInt();
		
		System.out.println("Enter another number: ");
		power = userinput.nextInt();
		
		expo = Math.pow(num, power);
		
		System.out.println(num+" to the power of "+power+" is "+expo);
		
	}

}
