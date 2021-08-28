package q4;

public class lightning implements calls
{

	double charges, bill;
	public lightning()
	{
		charges=1.0;
		bill=0;
	}
	
	@Override
	public void def_charge(int charge) 
	{
		charges=charge;
		
	}

	@Override
	public void make_call(int minutes) 
	{
		bill+=minutes*charges;
		System.out.println("Lightning call made for "+minutes/60+" hour(s) "+minutes%60+" minute(s)");
	}

	@Override
	public void show_bill() 
	{
		System.out.println("Your bill: Rs."+bill);	
	}
	
}