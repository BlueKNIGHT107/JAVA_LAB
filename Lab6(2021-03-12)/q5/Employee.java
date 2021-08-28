package q5;
public class Employee 
{
	private static String name;
	private static Integer empid;
	protected Float salary;
	
	//CONSTRUCTOR
	public Employee(String input_name, Integer input_empid, Float input_salary)
	{
		System.out.println("Constructor of Employee class invoked.");
		name = input_name;
		empid = input_empid;
		salary = input_salary;
	}
	
	//Function to display all the attributes of an employee
	public void Display()
	{
		System.out.println("Name             :"+Employee.name);
		System.out.println("Employee ID      :"+Employee.empid);
		System.out.println("Employee's salary:"+salary);
	}
	
	//Function that returns the name of the employee
	public String return_name()
	{
		return(name);
	}
	
	//Function that returns the salary of the employee
	public Float return_salary()
	{
		return(salary);
	}
	
	//Function to increase the salary of the employee
	public void IncreaseSalary(Float percentage)
	{
		Float increase = (float) (1+(percentage/100));
		salary = salary*(increase);
	}
	

}
