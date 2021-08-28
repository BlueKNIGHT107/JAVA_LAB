package q4;

public class Test 
{
	public static void main(String[] args)
	{
		ordinary ordinary_call = new ordinary();
		urgent urgent_call = new urgent();
		lightning lightning_call = new lightning();
		
		ordinary_call.make_call(10);
		ordinary_call.show_bill();
		
		urgent_call.make_call(10);
		urgent_call.show_bill();
		
		lightning_call.make_call(10);		
		lightning_call.show_bill();
	}
}
