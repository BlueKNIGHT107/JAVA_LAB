package q6;
public class FloatStr 
{
	public static void main(String[] args) 
	{
		float f1 = 5.3f;
		System.out.println("Value of float variable f1:"+f1);
		System.out.println();
		
		Float f2 = Float.valueOf(f1);
		System.out.println("Successfully converted from float to Float.");
		System.out.println("Value of Float object f2:"+f2);
		System.out.println();
		
		String s1 = String.valueOf(f2);
		System.out.println("Successfully converted from Float to String.");
		System.out.println("Value of String object s1:"+s1);
		System.out.println();
		
		float f3 = Float.valueOf(s1);
		System.out.println("Successfully converted from String to float.");
		System.out.println("Value of float variable f3:"+f3);
		System.out.println();
		
		String s2 = String.valueOf(f3);
		System.out.println("Successfully converted from float to String.");
		System.out.println("Value of String object s2:"+s2);
		System.out.println();
		
		Float f4 = Float.valueOf(s2);
		System.out.println("Successfully converted from String to Float.");
		System.out.println("Value of Float object f4:"+f4);
		System.out.println();
		
		float f5 = f4.floatValue();
		System.out.println("Successfully converted from Float to float.");
		System.out.println("Value of float variable f5:"+f5);
	}
}
