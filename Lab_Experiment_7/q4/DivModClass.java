package q4;
public class DivModClass implements DivMod
{

	@Override
	public int division(int divident, int divisor) 
	{
		// TODO Auto-generated method stub
		int quotient = divident/divisor;
		return quotient;
	}

	@Override
	public int modules(int a, int b) 
	{
		// TODO Auto-generated method stub
		int remainder = a%b;
		return remainder;
	}
	
	public static void main (String args[])
	{
		DivModClass obj = new DivModClass();
		int answer = obj.division(18, 3);
		int remainder = obj.modules(14, 6);
		
		System.out.println("18/3 = "+answer);
		System.out.println("14%6 = "+remainder);
	}

}
