package q2;
public class Even extends Thread
{
	int limit;
	public Even(int limit)
	{
		this.limit = limit;
	}
	@Override
	public void run()
	{
		for(int i=1; i<=limit; i++)
		{
			if(i%2==0)
			{
				System.out.println("Thread name:"+Thread.currentThread().getName()+" Even number:"+i);
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

