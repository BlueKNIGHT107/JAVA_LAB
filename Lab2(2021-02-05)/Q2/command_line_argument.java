class Command_line_argument
{
	public static void main(String args[])
	{
		if (args.length==0)
		{
			System.out.println("No command line argument passed");
		}
		else
		{	
			int input1=Integer.valueOf(args[0]);
			int input2=Integer.valueOf(args[2]);
			char operator=args[1].charAt(0);
			
			if (operator=='+')
			{
				int result=input1+input2;
				System.out.println("Value of " + args[0] + "+" + args[2] + "="+result);
			}
			
			else if(operator=='-')
			{	
				int result=input1-input2;
				System.out.println("Value of " + args[0] + "-" + args[2] + "="+result);
			}
			
			else if(operator=='x')
			{
				int result=input1*input2;
				System.out.println("Value of " + args[0] + "x" + args[2] + "="+result);
			}
			
			else if(operator=='/')
			{
				int result=input1/input2;
				System.out.println("Value of " + args[0] + "/" + args[2] + "="+result);
			}
			else
			{
				System.out.println("Please perform simple operations like addition, subtraction, multiplication and division."+args[1]+":");
			}
		}
	}
}
