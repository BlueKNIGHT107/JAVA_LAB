package q5;
import java.util.Scanner;
public class MainClass
{
	static class NameException extends RuntimeException
	{
		private static final long serialVersionUID = 1L;
		public NameException(String message)
		{
			super(message);
		}
	}
	
	static class AgeException extends RuntimeException
	{
		private static final long serialVersionUID = 1L;
		public AgeException(String message)
		{
			super(message);
		}
	}
	
	
	public static void main (String agrs[])
	{
		try 
		{
			Scanner input = new Scanner(System.in);
			System.out.print("Enter the name of the employee:");
			String name = input.next();
			
			for(int i=0; i<name.length(); i++)
			{
				int ascii = (int)name.charAt(i);
				if (ascii<=57 && ascii>=48)
				{
					throw new NameException("NameException raised.");
				}
			}
			
			System.out.print("Enter the age of the employee :");
			Integer age = input.nextInt();
			System.out.println();
			
			if (age>50)
			{
				throw new AgeException("Age Exception raised.");
			}
			
			System.out.println("Emplaoyee object created, its details are:");
			Employee e1 = new Employee(name,age);
			e1.Display_details();
		}
		
		
		catch(NameException e)
		{
			System.out.println("Numeric value entered in name.");
		}

		
		catch(AgeException e)
		{
			System.out.println("Age greater than 50.");
		}
		
	}
	
}
