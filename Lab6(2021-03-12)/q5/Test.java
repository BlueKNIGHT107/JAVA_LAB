package q5;
import java.util.Scanner;
public class Test extends Manager 
{
	public Test(String input_name, Integer input_empid, Float input_salary, String dep) 
	{
		super(input_name, input_empid, input_salary, dep);
	}

	public static void main(String[] args) 
	{
		String e_name, dep;
		Integer e_id;
		Float e_salary, percentage;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the name of the manager          :");
		e_name = input.next();
		
		System.out.println("Enter the ID of the manager            :");
		e_id = input.nextInt();
		
		System.out.println("Enter the salary of the manager        :");
		e_salary = input.nextFloat();
		
		System.out.println("Enter the department of the manager     :");
		dep = input.next();
		
		System.out.println("Enter the increase percentage in salary :");
		percentage = input.nextFloat();
		
		Manager obj = new Manager(e_name, e_id, e_salary, dep);
		
		System.out.println("Information about the manager before increase in the salary:");
		obj.Display();
		
		System.out.println("Information about the manager after increase in the salary:");
		obj.IncreaseSalary( percentage);
		
		obj.Display();
		input.close();
		
	}
}
