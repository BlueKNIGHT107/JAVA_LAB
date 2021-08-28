package q1;
import java.util.Scanner;
public class Substring_Search 
{
	static int first_occurence(String sequence, String substring)
	{
		int index=-1;
		int length = substring.length();
		int count=0;
		for(int i=0; i<sequence.length(); i++)
		{
			if(sequence.charAt(i)==substring.charAt(count))
			{
				count++;
			}
			else if(sequence.charAt(i)!=substring.charAt(count) && count>0)
			{
				count=0;
			}
			
			if (count==length)
			{
				index=i-count+1;
				break;
			}
		}
		return(index);
	}
	
	
	static public int last_occurence(String sequence, String substring)
	{
		int index=-1;
		int length = substring.length();
		int count=0;
		for(int i=0; i<sequence.length(); i++)
		{
			if(sequence.charAt(i)==substring.charAt(count))
			{
				count++;
			}
			else if(sequence.charAt(i)!=substring.charAt(count) && count>0)
			{
				count=0;
			}
			
			if (count==length)
			{
				index=i-count+1;
				count=0;
			}
		}
		return(index);
	}

	public static void main(String[] args)
	{
		String sequence;
		String sub_sequence;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the sequence(string):");
		sequence = input.nextLine();
		
		System.out.println("Enter the sub-sequence that you want to find in the entered sequence:");
		sub_sequence = input.nextLine();
		
		int first = first_occurence(sequence, sub_sequence);
		int last = last_occurence(sequence, sub_sequence);
		
		if (first!=-1)
		{
			System.out.println("Sub string '"+sub_sequence+"' found in the sequence '"+sequence+"'"+" first at index "+first);
		}
		else
		{
			System.out.println("Sub string '"+sub_sequence+"' not found in the sequence '"+sequence+"'");
		}
		
		
		if(last!=-1)
		{
			System.out.println("Sub string '"+sub_sequence+"' found in the sequence '"+sequence+"'"+" last at index "+last);
		}
		else
		{
			System.out.println("Sub string '"+sub_sequence+"' not found in the sequence '"+sequence+"'");
		}
		input.close();	}
}
