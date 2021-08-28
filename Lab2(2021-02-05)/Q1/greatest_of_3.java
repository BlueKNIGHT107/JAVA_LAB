class ClassName
{
	public static void main(String args[])
	{
		int a=15;
		int b=62;
		int c=8;
		
		System.out.println("Integer a="+a);
		System.out.println("Integer b="+b);
		System.out.println("Integer c="+c);
		
		if(a>b && a>c)
		{
			System.out.println("Integer a is the greatest");
		}
		
		else if(b>a && b>c)
		{
			System.out.println("Integer b is the greatest");
		}
		
		else if(c>b && c>a)
		{
			System.out.println("Integer c is the greatest");
		}
	}
}
