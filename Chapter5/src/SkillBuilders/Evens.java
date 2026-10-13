package SkillBuilders;

public class Evens 
{

	public static void main(String[] args) 
	{

		int i = 1;
		
		System.out.println("All the even numbers between 1-20 are:");
		
		for (; i <= 20; i++)
		{
			if (i % 2 == 0)
			{
				System.out.println(i);
			}
		}
		
	}

}
