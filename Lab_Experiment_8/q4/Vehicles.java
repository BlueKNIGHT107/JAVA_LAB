package q4;
import java.util.Scanner;
public class Vehicles {
	
	static class Collision extends RuntimeException
	{
		private static final long serialVersionUID = 1L;
		public Collision(String messgae)
		{	
			super(messgae);
		}
	}
	
	static class vehicles
	{
		String direction;
		public void set_direction(String input_direction)
		{
			direction = input_direction;
		}
	}

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		vehicles v1 = new vehicles();
		System.out.println("Enter the direction of the vehicle v1(left/right):");
		String v1_direction = input.next();
		while(!v1_direction.equals("left") && !v1_direction.equals("right"))
		{
			System.out.println("Please enter the correct direction(in lower case only):");
			System.out.println("Enter the direction of the vehicle v1(left/right):");
			v1_direction = input.next();
		}
		v1.set_direction(v1_direction);
		
		vehicles v2 = new vehicles();
		System.out.println("Enter the direction of the vehicle v2(left/right):");
		String v2_direction = input.next();
		while(!v2_direction.equals("left") && !v2_direction.equals("right"))
		{
			System.out.println("Please enter the correct direction(in lower case only):");
			System.out.println("Enter the direction of the vehicle v2(left/right):");
			v2_direction = input.next();
		}
		v2.set_direction(v2_direction);
		try 
		{
			if(!v1.direction.equals(v2.direction))
			{
				throw new Collision("Collision exception raised");
			}
			System.out.println("Vehicles are safe as they are moving in same directions");
		}
		
		catch (Collision c)
		{
			System.out.println("There is a chance of collision as vehicles are moving in opposite directions");
		}
	}
}
