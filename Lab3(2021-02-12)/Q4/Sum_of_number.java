/*
 MADE BY AAYUSH DESHMUKH
 ON DATE 18-02-2021
 SUM OF ALL NUMBERS B/W 40 TO 250 DIVISIBLE BY 5. 
 Sum_of_number.java
 */
package com.r177219003.q4;

public class Sum_of_number
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Integer total_sum=0;
		Integer low = 41;
		Integer high = 250;
		Integer divisibility = 5;
		
		while (low%divisibility!=0)
		{
			low++;
		}
		for (Integer i=low; i<high; i+=divisibility)
		{
			total_sum+=i;
		}
		
		System.out.println("Sum of the integers greater than 40 and less than 250 that are divisible by 5 is:"+total_sum);
	}
}