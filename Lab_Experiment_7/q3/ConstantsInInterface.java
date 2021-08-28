package q3;
import java.util.Scanner;
public class ConstantsInInterface 
{
	interface constants
	{
		double pi = 3.14;
		double circle_area(double r);
	}
	
	static class circle implements constants
	{

		@Override
		public double circle_area(double r) 
		{
			return(pi*r*r);
		}
		
	}
	
	public static void main(String args[])
	{
		circle c1 = new circle();
		double radius;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the radius of the circle:");
		radius = input.nextDouble();
		
		double area = c1.circle_area(radius);
		System.out.println("Area of circle with radius "+radius+" is equal to:"+area);
		input.close();	
	}
}
