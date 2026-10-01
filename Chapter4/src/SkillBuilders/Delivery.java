package SkillBuilders;

import java.util.Scanner;

public class Delivery 
{

	public static void main(String[] args) 
	{

		Scanner userinput = new Scanner(System.in);
		
		int length = 0;
		int width = 0;
		int height = 0;
		
		System.out.println("Input package length: ");
		length = userinput.nextInt();
		System.out.println("Input package width: ");
		width = userinput.nextInt();
		System.out.println("Input package height: ");
		height = userinput.nextInt();
		
		if (length<=10 && width<=10 && height<=10)
		{
			System.out.println("Package Accepted");
		}
		else
		{
			System.out.println("Package Rejected");
		}
		
		userinput.close();
	}

}
