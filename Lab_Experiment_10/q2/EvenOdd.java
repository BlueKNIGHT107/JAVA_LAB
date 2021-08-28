package q2;
import java.util.Scanner;
public class EvenOdd 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number upto which you want to print:");
		int limit = input.nextInt();
		System.out.println();
		input.close();
		
		Even e = new Even(limit);
		Odd  o = new Odd(limit);
		
		o.start();
		e.start();
	}
}
