package q1;

public class Super {
	
	private static int private_variable = 10;

	public static void main(String[] args) 
	{
		System.out.println("Hello from super class");

	}
	
	public void print_private()
	{
		System.out.println("Private variable = "+private_variable);
	}

}
