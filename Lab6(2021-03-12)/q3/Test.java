package q3;

public class Test 
{
	public static void main(String args[])
	{
		SalariedWorker obj = new SalariedWorker("Worker_salaried", .1f);
		obj.ComPay(24);
		DailyWorker obj1 = new DailyWorker("Worker_Daily", .1f);
		obj1.ComPay(24);
		
		obj.Display();
		obj1.Display();
	}
}
