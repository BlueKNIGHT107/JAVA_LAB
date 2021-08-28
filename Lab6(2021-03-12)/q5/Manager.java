package q5;
public class Manager extends Employee 
{
	static String department;
	
	public Manager(String input_name, Integer input_empid, Float input_salary, String dep) 
	{
		super(input_name, input_empid, input_salary);
		department = dep;
	}
}
