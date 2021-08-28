package q3;
public class DailyWorker extends Worker{

	public DailyWorker(String w_name, Float w_salary_rate) 
	{
		super(w_name, w_salary_rate);
	}

	//Function to compute week pay
	@Override
	public void	ComPay(Integer hours)
	{
		salary=hours*salary_rate/24.0f;
	}

}
