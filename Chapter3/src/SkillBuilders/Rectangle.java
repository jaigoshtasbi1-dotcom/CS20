package SkillBuilders;

import java.util.Scanner;

public class Rectangle 
{

	public static void main(String[] args) 
	{
		//Declaration
		int length;
		int width;
		double area;
		
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
		
		//Display length, width, and area
		System.out.println("");
		System.out.println("The width is: "+width);
		System.out.println("The length is: "+length);
		System.out.println("The area is: "+area);
	}

}
