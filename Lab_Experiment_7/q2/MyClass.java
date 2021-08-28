package q2;

public class MyClass implements A
{

	@Override
	public void meth1() 
	{
		// TODO Auto-generated method stub
		System.out.println("This is method 1.");
	}

	@Override
	public void meth2() 
	{
		// TODO Auto-generated method stub
		System.out.println("This is method 2.");
	}
	
	public static void main(String args[])
	{
		MyClass obj = new MyClass();
		obj.meth1();
		obj.meth2();
	}

}
