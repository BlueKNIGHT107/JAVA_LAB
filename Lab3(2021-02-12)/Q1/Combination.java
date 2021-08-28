/*
 MADE BY AAYUSH DESHMUKH
 ON DATE 18-02-2021
 POSSIBLE COMBINATION OF 3 NUMBERS
 Combination.java
 */
package com.r177219003.q1;
import java.util.Scanner;
public class Combination 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//INPUT
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first digit:");
		String a = input.next();
		
		System.out.println("Enter the first digit:");
		String b = input.next();
		
		System.out.println("Enter the first digit:");
		String c = input.next();
		
		Combination obj = new Combination();
		
		a = a.toString();
		obj.print_combination(a,b,c);
	}
	
	//Function that prints all the possible combinations of the given three digits
	public void print_combination ( String a, String b, String c)
	{
		System.out.println(a+b+c);
		System.out.println(a+c+b);
		System.out.println(b+a+c);
		System.out.println(b+c+a);
		System.out.println(c+a+b);
		System.out.println(c+b+a);
	}
}
