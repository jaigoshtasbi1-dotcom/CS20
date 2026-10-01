package SkillBuilders;

import java.util.Scanner;

public class Hurricane 
{

	public static void main(String[] args) 
	{

		int category = 0;
		
		//Create Scanner Object
		Scanner userinput = new Scanner(System.in);
		
		System.out.print("Enter Hurricane Category: ");
		
		while (category<1 || category>5) 
		{
		    if (userinput.hasNextInt())
		    {
		        category = userinput.nextInt();

		        if (category<1 || category>5)
		        {

		            System.out.print("Invalid input. Enter a valid category between 1 and 5: ");
		        }
		    } 
		    else 
		    {

		        System.out.print("Invalid input. Enter a valid category between 1 and 5: ");
		        userinput.next();
		    }
		}
		
		System.out.println(" ");
		
		if (category == 1) 
		{
			System.out.println("Category 1 Hurricane Windspeed: ");
			System.out.println("74-95 miles per hour");
			System.out.println("62-82 knots");
			System.out.println("119-153 kilometers per hour");
		}
			
		if (category == 2) 
		{
			System.out.println("Category 2 Hurricane Windspeed: ");
			System.out.println("96-110 miles per hour");
			System.out.println("83-95 knots");
			System.out.println("154-177 kilometers per hour");
		}
			
		if (category == 3) 
		{
			System.out.println("Category 3 Hurricane Windspeed: ");
			System.out.println("111-130 miles per hour");
			System.out.println("96-113 knots");
			System.out.println("178-209 kilometers per hour");
		}
			
		if (category == 4) 
		{
			System.out.println("Category 4 Hurricane Windspeed: ");
			System.out.println("131-155 miles per hour");
			System.out.println("114-135 knots");
			System.out.println("210-249 kilometers per hour");
		}
			
		if (category == 5) 
		{
			System.out.println("Category 5 Hurricane Windspeed: ");
			System.out.println("Greater than 155 miles per hour");
			System.out.println("Greater than 135 knots");
			System.out.println("Greater than 249 kilometers per hour");
				
				
		}
			
		
		userinput.close();
	}
}