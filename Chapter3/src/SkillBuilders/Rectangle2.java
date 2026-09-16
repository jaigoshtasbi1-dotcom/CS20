package SkillBuilders;

import java.util.Scanner;

public class Rectangle2 
{

	public static void main(String[] args) 
	{
		//Declaration
		int length;
		int width;
		int area;
		int p;
		
		//Create Scanner Object
		Scanner userinput = new Scanner(System.in);
		
		//Get width from keyboard
		System.out.print("Please Input Rectangle Width: ");
		width = userinput.nextInt();
		
		//Get length from keyboard
		System.out.print("Please Input Rectangle Length: ");
		length = userinput.nextInt();
		
		//Calculate area
		area = length*width;
		
		//Calculate perimeter
		p = ((2*length)+(2*width));
		
		//Display length, width, perimeter and area
		System.out.println("");
		System.out.println("The width is: "+width);
		System.out.println("The length is: "+length);
		System.out.println("The perimeter is: "+p);
		System.out.println("The area is: "+area);
		
		//close scanner object
		userinput.close();
	}

}
