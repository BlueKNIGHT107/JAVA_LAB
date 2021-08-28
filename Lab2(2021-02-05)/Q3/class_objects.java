class class_objects
{
	public static void main(String args[])
	{
		printer obj = new printer();
		obj.input(args);
	}
}
		
public class printer
{
	
	public void input(String args[])
	{
		System.out.print("You entered: ");
		for (int i=0; i<args.length; i++)
		{
			System.out.print(args[i]+" ");		
		}
		System.out.println();
	}
}
