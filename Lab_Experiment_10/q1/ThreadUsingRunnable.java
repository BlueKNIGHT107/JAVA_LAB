package q1;

public class ThreadUsingRunnable implements Runnable
{
	public static void main(String args[])
	{
		ThreadUsingRunnable obj = new ThreadUsingRunnable();		
		Thread t = new Thread(obj);
		t.start();
	}

	@Override
	public void run() 
	{
		System.out.println("Thread started....");
	}
}
