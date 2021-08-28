package q4;

public class urgent implements calls
{

	double charges, bill;
	public urgent()
	{
		charges=0.75;
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
		System.out.println("Urgent call made for "+minutes/60+" hour(s) "+minutes%60+" minute(s)");
	}

	@Override
	public void show_bill() 
	{
		System.out.println("Your bill: Rs."+bill);	
	}
	
}