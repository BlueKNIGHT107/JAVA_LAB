package q5;

public class Employee 
{
	String name;
	Integer age;
	public Employee(String input_name, Integer input_age)
	{
		name=input_name;
		age=input_age;
	}
	
	public void Display_details()
	{
		System.out.println("Name:"+name);
		System.out.println("Age :"+age);
	}
}
