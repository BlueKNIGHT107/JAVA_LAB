package q1;
import java.util.Scanner;
public class Array_Exception_Handling 
{
	public static void main(String[] args) 
	{
		Integer roll_no[] = new Integer[10];
		String names[] = new String[10];
		
		try
		{
			Scanner input = new Scanner(System.in);
			for(int i=0; i<10; i++)
			{
				String name;
				Integer roll;
				System.out.println("Enter the name of the student:");
				name = input.next();
				names[i]=name;
				
				System.out.println("Enter the roll number of the student:");
				roll = input.nextInt();
				roll_no[i]=roll;	
			}
			input.close();
			System.out.println("Names and roll number of the students are:");
			int i=0;
			while(true)
			{
				System.out.println("Name:"+names[i]+" Roll number:"+roll_no[i]);
				i++;
			}
		}
		
		catch(Exception e)
		{
			System.out.println("Exception occurred!!");
		}
	}

}
