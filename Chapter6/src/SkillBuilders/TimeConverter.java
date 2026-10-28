package SkillBuilders;

import java.util.Scanner;

public class TimeConverter 
{

	public static void main(String[] args) 
	{

		Scanner userinput = new Scanner(System.in);
		
		int choice;
		int time;
		
		menu();
		
		System.out.println( );
		System.out.println("Enter number from 1-6: ");
		choice = userinput.nextInt();
		System.out.println("Enter the amount of time: ");
		time = userinput.nextInt();
		
		if (choice == 1)
		{
			System.out.println(time+ " minutes = "+minutehours(time)+" hours");
		}
		else if (choice == 2)
		{
			System.out.println(time+ " minutes = "+minutedays(time)+" days");
		}
		else if (choice == 3)
		{
			System.out.println(time+ " hours = "+hourminutes(time)+" minutes");
		}
		else if (choice == 4)
		{
			System.out.println(time+ " hours = "+hourdays(time)+" days");
		}
		else if (choice == 5)
		{
			System.out.println(time+ " days = "+dayminutes(time)+" minutes");
		}
		else if (choice == 6)
		{
			System.out.println(time+ " days = "+dayhours(time)+" hours");
		}
	
		userinput.close();
	}
		
	public static void menu()
	{
			System.out.println("Type 1 if you would like to convert minutes to hours");
			System.out.println("Type 2 if you would like to convert minutes to days");
			System.out.println("Type 3 if you would like to convert hours to minutes");
			System.out.println("Type 4 if you would like to convert hours to days");
			System.out.println("Type 5 if you would like to convert days to minutes");
			System.out.println("Type 6 if you would like to convert days to hours");
	}
	
	public static double minutehours(double minutes)
	{
		return minutes / 60;
	}
	
	public static double minutedays(double minutes)
	{
		return minutes / 1440;
	}
	
	public static double hourminutes(double hours)
	{
		return hours * 60;
	}
	
	public static double hourdays(double hours)
	{
		return hours / 24;
	}
	
	public static double dayminutes(double days)
	{
		return days * 1440;
	}
	
	public static double dayhours(double days)
	{
		return days * 24;
	}
		


}
