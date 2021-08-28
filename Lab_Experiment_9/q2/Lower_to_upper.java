package q2;
import java.util.Scanner;
public class Lower_to_upper 
{	
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
		StringBuffer name = new StringBuffer();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your name:");
		name.append(input.next());
		
		System.out.println("Entered name     : "+name);
		
		lower_to_upper(name);
		System.out.println("Name in capitals : "+name);
		input.close();
	}
}
