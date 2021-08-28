package q5;
public class IntStr 
{
	public static void main(String[] args) 
	{
		int i1 = 5;
		System.out.println("Value of int variable i1:"+i1);
		System.out.println();
		
		Integer i2 = Integer.valueOf(i1);
		System.out.println("Successfully converted from int to Integer.");
		System.out.println("Value of Integer object i2:"+i2);
		System.out.println();
		
		String s1 = String.valueOf(i2);
		System.out.println("Successfully converted from Integer to String.");
		System.out.println("Value of String object s1:"+s1);
		System.out.println();
		
		int i3 = Integer.valueOf(s1);
		System.out.println("Successfully converted from String to int.");
		System.out.println("Value of int variable i3:"+i3);
		System.out.println();
		
		String s2 = String.valueOf(i3);
		System.out.println("Successfully converted from int to String.");
		System.out.println("Value of String object s2:"+s2);
		System.out.println();
		
		Integer i4 = Integer.valueOf(s2);
		System.out.println("Successfully converted from String to Integer.");
		System.out.println("Value of Integer object i4:"+i4);
		System.out.println();
		
		int i5 = i4.intValue();
		System.out.println("Successfully converted from Integer to int.");
		System.out.println("Value of int variable i5:"+i5);

	}
}
