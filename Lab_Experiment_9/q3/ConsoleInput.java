package q3;
import java.util.Scanner;
public class ConsoleInput {
	
	public static void lower_to_upper(StringBuffer sequence)
	{
		int length = sequence.length();
		int ascii_value;
		String char_value;
		
		for(int i=0; i<length; i++)
		{
			ascii_value = (int) sequence.charAt(i);
			if ( ascii_value>=97 && ascii_value<=122)
			{
				ascii_value-=32;
			}
			char_value = String.valueOf((char)ascii_value);
			sequence.replace(i, i+1, char_value);
		}
	}

	public static void main(String[] args) 
	{
		String statement;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a statement:");
		statement = input.nextLine();
		StringBuffer upperStatement = new StringBuffer(statement);
		System.out.println("Text entered:"+statement);
		
		System.out.println();
		lower_to_upper(upperStatement);	
		System.out.println("Text in upper case:"+upperStatement);
		input.close();
	}
}
