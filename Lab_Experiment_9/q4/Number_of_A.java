package q4;

import java.util.Scanner;

public class Number_of_A 
{
	
	public static void main(String args[])
	{
		String my_name = new String("Aayush");
		String your_name = new String();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your name:");
		your_name= input.next();
		
		int my_name_length = my_name.length();
		int my_a=0;
		Integer my_a_loc[] = new Integer[my_name_length];
		
		int your_name_length = your_name.length();
		int your_a=0;
		Integer your_a_loc[] = new Integer[your_name_length];
		
		int count=0;
		for (int i=0; i<my_name_length; i++)
		{
			my_a_loc[i]=-1;
			if(my_name.charAt(i)=='a' || my_name.charAt(i)=='A')
			{
				my_a+=1;
				my_a_loc[count++]=i;
			}
		}
		
		count=0;
		for (int i=0; i<your_name_length; i++)
		{
			your_a_loc[i]=-1;
			if(your_name.charAt(i)=='a' || your_name.charAt(i)=='A')
			{
				your_a+=1;
				your_a_loc[count++]=i;
			}
		}
		
		
		if (my_a>0)
		{
			System.out.println("Number of a's or A's found in my name("+my_name+") is "+my_a);
			System.out.println("Positions:");
			for(int i=0; i<my_name_length; i++)
			{
				if (my_a_loc[i]!=-1)
				{
					if (i!=0)
					{
						System.out.print(", ");
					}
					System.out.print(my_a_loc[i]);
				}
				else
				{
					break;
				}
			}
			System.out.println();
		}
		else
		{
			System.out.println("No a's or A's found in my name :"+my_name);
		}
		
		System.out.println();
		if (your_a>0)
		{
			System.out.println("Number of a's or A's found in your name("+your_name+") is "+your_a);
			System.out.println("Positions:");
			for(int i=0; i<your_name_length; i++)
			{
				if (your_a_loc[i]!=-1)
				{
					if (i!=0)
					{
						System.out.print(", ");
					}
					System.out.print(your_a_loc[i]);
				}
				else
				{
					break;
				}
			}
			System.out.println();
		}
		else
		{
			System.out.println("No a's or A's found in your name :"+your_name);
		}
		input.close();
	}
}
