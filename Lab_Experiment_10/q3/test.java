package q3;
public class test extends Thread
{
	public static int counter;
	public test()
	{
		counter=0;
	}
	public synchronized void increment()
	{
		counter+=1;
	}
	
	@Override
	public void run()
	{
		increment();
		System.out.println("Thread running:"+Thread.currentThread().getName());	
		System.out.println("Value of counter varaible:"+counter);
		System.out.println();
	}
}
