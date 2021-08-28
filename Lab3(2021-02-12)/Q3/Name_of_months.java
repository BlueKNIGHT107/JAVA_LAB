/*
 MADE BY AAYUSH DESHMUKH
 ON DATE 18-02-2021
 RESPECTIVE MONTH OF THE ENTERED NUMBER
 Name_of_months.java
 */
package com.r177219003.q3;
import java.util.Scanner;
public class Name_of_months
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		String month[]= {"","JANUARY", "FEBRUARY", "MARCH", "APRIL","MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER" };
		
		//INPUT
		Scanner input = new Scanner(System.in);
		Integer month_number = 0;
		do 
		{
			System.out.println("Enter the number of the month(1-12):");
			month_number = input.nextInt();
			
			if (month_number>12 || month_number<1)
			{
				System.out.println("Please enter a valid number!");
			}
			
		}while(month_number>12 || month_number<1);
		
		System.out.println(month_number+": "+month[month_number]);
	}

}
