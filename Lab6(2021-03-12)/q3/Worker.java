package q3;

abstract class Worker 
{
	protected String name;
	protected Float salary_rate;
	protected Float salary;


	public Worker(String w_name, Float w_salary_rate)
	{
		name=w_name;
		salary_rate=w_salary_rate;
	}
	
	//Function to compute week pay
	abstract void ComPay(Integer hours);
	

	//Function to display name and Salary
	public void Display()
	{
		System.out.println("NAME   : "+name);
		System.out.println("SALARY : "+"Rs."+salary);
	}
	
	
}