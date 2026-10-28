package SkillBuilders;

import java.util.Scanner;

public class SpanishNumbers 
{

	public static void main(String[] args) 
	{

		Scanner userinput = new Scanner(System.in);
		
		int num;
		
		System.out.print("Enter a nuber from 1-10: ");
		num = userinput.nextInt();
		
		if (num == 1)
		{
			span1();
		}
		
		else if (num == 2)
		{
			span2();
		}
		
		else if (num == 3)
		{
			span3();
		}
		
		else if (num == 4)
		{
			span4();
		}
		
		else if (num == 5)
		{
			span5();
		}
		
		else if (num == 6)
		{
			span6();
		}
		
		else if (num == 7)
		{
			span7();
		}
		
		else if (num == 8)
		{
			span8();
		}

		else if (num == 9)
		{
			span9();
		}
		
		else if (num == 10)
		{
			span10();
		}
		
		userinput.close();
	}
	
	public static void span1()
	{
		System.out.print("Uno");
	}
	
	public static void span2()
	{
		System.out.print("Dos");
	}
	
	public static void span3()
	{
		System.out.print("Tres");
	}
	
	public static void span4()
	{
		System.out.print("Cuatro");
	}
	
	public static void span5()
	{
		System.out.print("Cinco");
	}
	
	public static void span6()
	{
		System.out.print("Seis");
	}
	
	public static void span7()
	{
		System.out.print("Siete");
	}
	
	public static void span8()
	{
		System.out.print("Ocho");
	}
	
	public static void span9()
	{
		System.out.print("Nueve");
	}
	
	public static void span10()
	{
		System.out.print("Diez");
	}

}
