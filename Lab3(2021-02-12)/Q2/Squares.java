/*
 MADE BY AAYUSH DESHMUKH
 ON DATE 18-02-2021
 SQUARES OF N NUMBERS 
 Squares.java
 */
package com.r177219003.q2;
import java.util.Scanner;
public class Squares 
{
	public static void main(String[] args) 
	{
		//INPUT
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the total number of numbers you are going to enter:");
		Integer size = input.nextInt();
				
		Squares obj = new Squares();
		obj.print_squares(size);
	}
			
	//Function that takes input and prints squares of n numbers
	public void print_squares( Integer n)
	{
		Scanner input_number = new Scanner(System.in);
		int arr[] = new int[n];
		for (int i=0; i<n; i++)
		{
			System.out.print("Enter the number ");
			System.out.println(i+1+":");
			arr[i] = input_number.nextInt();
			
		}
		
		for (int i=0; i<n; i++)
		{
			System.out.print("Square of the number ");
			System.out.print(i+1+"(");
			System.out.print(arr[i]+") :");
			System.out.println(arr[i]*arr[i]);
		}
	}
}
