/**
 * Implement each of the 10 methods tested in JUnitTests.java. Study the tests
 * to determine how the methods should work.
 */
import java.util.*;
public class Java1Review 
{

	public static void main(String[] args) 
	{
		// If you want to write your own tests, do so here. (Do not modify
		// JUnitTests.java.) To run this method in Eclipse, right-click
		// Java1Review.java in the Package Explorer and select "Run As" >
		// "Java Application" from the context menu.
	}
	
	public static double divide(double firstNum, double secondNum)
	{
		double quotient = firstNum/secondNum;
		
		return quotient;
	}
	
	public static int divide(int firstNum, int secondNum)
	{
		int quotient = firstNum/secondNum;
		
		return quotient;
	}
	
	public static boolean isDivisibleBy7(int randNum)
	{
		if (randNum % 7 ==0)
		{
		return true;
		}
		else
			return false;
	}
	
	public static int findMin(int num1, int num2, int num3)
	{
		int minimum = 0;
		
		if (num1 < num2 && num1 < num3)
		{
			minimum = num1;
		}
		
		else if (num2 < num1 && num2 < num3)
		{
			minimum = num2;
		}
		
		else
			minimum = num3;
		
		return minimum;
	}
	

	public static int findMin(int[] array)
	{
		int min = Integer.MAX_VALUE;
		
		for (int i = 0; i < array.length; i++)
		{
			if (array[i] < min)
			{
				min = array[i];
			}
		}
		
		return min;
	}
	
	// TODO make the method
	public static double average(int[] array)
	{
		double sum = 0;
		
		for (int i = 0; i < array.length; i++)
		{
			sum += array[i];
		}
		
		double average = sum/array.length;
		
		return average;
	}
	
	// I don't remember who it was, but it was a boy in my Lab section and
	// it was also a Discord User named "Natalia Mora" who helped me come up with this.
	public static String[] toLowerCase(String[] array)
	{
		for(int i = 0; i < array.length; i++)
		{
			array[i] = array[i].toLowerCase();
		}
		return array;
	}
	
	// Discord User: Natalia Mora, gave the purpose of this method
	
	public static String[] toLowerCaseCopy(String[] array)
	{
		String[] copy = new String[array.length];
		
		for (int i = 0; i < array.length; i++) 
		{
			copy[i] = array[i].toLowerCase();
		}
		
		return copy;
	}
	
	
	public static int[] removeDuplicates(int[] array)
	{
		for (int i = 0; i < array.length; i++)
		{
			boolean isDuplicate = false;
			for(int j = 0; j < array.length; j++)
			{
				if (array[j] != 0 && array[i] == array[j] && i != j)
				{
					isDuplicate = true;
					break;
				}
			}
			if (isDuplicate == true)
			{
				for(int j = 0; j < array.length; j++)
				{
					if (array[i] == array[j] && i != j)
						array[j] = 0;
				}
				array[i] = 0;
			}
		}
		return array;
	}
	
	public static String main(String phrase)
	{
		return "Overloaded main method was passed " + "\"" + phrase + "\".";
	}
	
}
