package q3;
public class NonNumericOperands {
	static class NonNumericException extends RuntimeException
	{
		private static final long serialVersionUID = 1L;
		public NonNumericException(String message)
		{
			super(message);
		}
	}

	public static void main (String[] args)
	{
		try 
		{
			boolean valid = true;
			for(int i=0; i<args[0].length(); i++)
			{
				//System.out.println(args[0].charAt(i));
				int ascii = (int)args[0].charAt(i);
				if (ascii>57 || ascii<48)
				{
					valid=false;
					break;
				}
			}
			
			if(valid)
			{
				for(int i=0; i<args[1].length(); i++)
				{
					//System.out.println(args[1].charAt(i));
					int ascii = (int)args[1].charAt(i);
					if (ascii>57 || ascii<48)
					{
						valid=false;
						break;
					}
				}
			}
			
			
			if(!valid)
			{
				throw new NonNumericException("NonNumericException");
			}
			else
			{
				Integer operand_1 = Integer.valueOf(args[0]);
				Integer operand_2 = Integer.valueOf(args[1]);
				System.out.println(operand_1+" modules "+operand_2+"="+operand_1%operand_2);
			}
		}
		
		catch(NonNumericException e)
		{
			System.out.println("Exception Raised! Non nemric value passed to an operand.");
		}
		
		catch(Exception e)
		{
			System.out.println("Generic Exception occurred!.");
		}
	}
}
