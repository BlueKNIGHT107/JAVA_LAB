package q1;

public class ThreadUsingThread extends Thread
{
	public static void main(String[] args) 
	{
		ThreadUsingThread t = new ThreadUsingThread();
		t.start();
	}
	
	@Override
	public void run()
	{
		System.out.println("Thread started....");
	}
}
