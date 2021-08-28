package q2;
public class Odd extends Thread
{
	int limit;
	public Odd(int limit)
	{
		this.limit = limit;
	}
	@Override
	public void run()
	{
		for(int i=1; i<=limit; i++)
		{
			if(i%2!=0)
			{
				System.out.println("Thread name:"+Thread.currentThread().getName()+" Odd number:"+i);
				try 
				{
					sleep(1000);
				} 
				catch (InterruptedException e) 
				{
					e.printStackTrace();
				}
			}
		}
	}
}
