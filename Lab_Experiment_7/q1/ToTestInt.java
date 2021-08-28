package q1;

public class ToTestInt 
{
	public static void main(String args[])
	{
		Integer num = 7;
		Arithmetic obj = new Arithmetic();
		Integer sq_number = obj.square(num);
		System.out.println("Number              : "+num);
		System.out.println("Square of the number: "+sq_number);
	}
}
