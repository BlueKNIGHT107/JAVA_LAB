/*
 MADE BY AAYUSH DESHMUKH
 ON DATE 19-02-2021
 GRADE OF THE STUDENT BASED ON HIS SCORE 
 Grades.java
 */
package com.r177219003.q5;
import java.util.Scanner;

public class Grades 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Integer size = 0;
		System.out.print("Enter the number of students:");
		Scanner input =new Scanner(System.in);
		size = input.nextInt();
		
		Integer marks[] = new Integer[size];
		Integer order[]= new Integer[size];
		
		for(int i=0; i<size; i++)
		{
			System.out.print("\nEnter the marks of student "+(i+1)+":");
			marks[i]=input.nextInt();
			order[i]=i+1;
		}
		
		
		
		Grades obj = new Grades();
		obj.ascending_order(marks, order, size);
		obj.grade(marks, order,size);
	}
	
	
	//Function for arranging the marks of the students in ascending order
	public void ascending_order(Integer arr[], Integer order[], Integer n)
	{
		Integer min=0, temp=0;;
		for (int i=0; i<n; i++)
		{
			min=i;
			for(int j=i; j<n; j++)
			{
				if (arr[j]<arr[min])
				{
					min=j;
				}
			}
			
			temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
			
			temp=order[i];
			order[i]=order[min];
			order[min]=temp;
		}
	}
	
	
	
	//Function for printing the result of every student(max 99 students) in tabular form
	public void grade(Integer arr[], Integer order[],Integer n)
	{
		System.out.println("Student number | Student marks | Student grade");
		System.out.println("_______________________________________________________");
		for (int i=0; i<n; i++)
		{
			if (arr[i]>=40 && arr[i]<=50)
			{
				if(order[i]<10)
				{
					System.out.println(order[i]+"              |"+arr[i]+"             "+"| PASS");
				}
				else
				{
					System.out.println(order[i]+"             |"+arr[i]+"             "+"| PASS");
				}
			}
			else if (arr[i]>=51 && arr[i]<=75)
			{
				if(order[i]<10)
				{
					System.out.println(order[i]+"              |"+arr[i]+"             "+"| MERIT");
				}
				else
				{
					System.out.println(order[i]+"             |"+arr[i]+"             "+"| MERIT");
				}
			}
			else if (arr[i]>75)
			{
				if(order[i]<10)
				{
					if(arr[i]<100)
					{
						System.out.println(order[i]+"              |"+arr[i]+"             "+"| DISTINCTION");
					}
					else
					{
						System.out.println(order[i]+"              |"+arr[i]+"            "+"| DISTINCTION");
					}
				}
				else
				{
					if(arr[i]<100)
					{
						System.out.println(order[i]+"             |"+arr[i]+"             "+"| DISTINCTION");
					}
					else
					{
						System.out.println(order[i]+"             |"+arr[i]+"            "+"| DISTINCTION");
					}
				}
			}
			else
			{
				if(order[i]<10)
				{
					System.out.println(order[i]+"              |"+arr[i]+"             "+"| FAIL");
				}
				else
				{
					System.out.println(order[i]+"             |"+arr[i]+"             "+"| FAIL");
				}
			}	
		}
	}
}
