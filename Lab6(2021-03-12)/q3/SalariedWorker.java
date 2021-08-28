package q3;
public class SalariedWorker extends Worker{

	public SalariedWorker(String w_name, Float w_salary_rate) 
	{
		super(w_name, w_salary_rate);
	}

	//Function to compute week pa
	@Override
	public void ComPay(Integer hours) 
	{
		salary=hours*salary_rate;
	}

}
