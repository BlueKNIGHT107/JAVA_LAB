package viva_test;
import java.util.Scanner;

public class Employee  extends Department
{
	//Class variables
	int id;
	String name;
	Department dep;
	
	//CONSTRUCTOR
	public Employee()
	{
		
		id   = 0;
		name = "Unassigned";
		dep  = new Department();
	}
	
	//Function that returns the id of the employee
	public Integer getid()
	{
		return id;
	}
	
	//Function that sets the id of the employee
	public void setid()
	{
		System.out.println("Enter the id :");
		Scanner input= new Scanner(System.in);
		id=input.nextInt();
		//input1.close();
	}
	
	
	//Function that returns the name of the employee
	public String getName()
	{
		return(name);
	}
	
	//Function that sets the name of the employee
	public void setName()
	{
		System.out.println("Enter the name :");
		Scanner input= new Scanner(System.in);
		name=input.next();
		//input.close();
	}
	
	//Function that returns the dep of the employee
	public String getDep()
	{
		return(dep.get_dep());
	}
	
	
	//Function that sets the dep of the employee
	public void setDep()
	{
		System.out.println("Enter the department :");
		Scanner input= new Scanner(System.in);
		dep.set_dep(input.next());
		//input.close();
	}
	
	
	//Function to print all the class members
	 void show()
	{
		System.out.println("ID         :"+id);
		System.out.println("NAME       :"+name);
		System.out.println("DEPARTMENT :"+dep.department);
	}
	 
	 
	
}
	
	
	
	
	
