package q2;

import java.util.Scanner;

public class Div_by_zero 
{
	public static void main(String args[])
	{
		Integer divident, divisor;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the divident: ");
		divident = input.nextInt();
		
		System.out.println("Enter the divisor: ");
		divisor = input.nextInt();
		
		input.close();
		try 
		{
			int quotient = divident/divisor;
			System.out.println("Quotient="+quotient);
		}
		catch(Exception e)
		{
			System.out.println("Exception occurred Division by zero not possible");
		}		
	}
}
