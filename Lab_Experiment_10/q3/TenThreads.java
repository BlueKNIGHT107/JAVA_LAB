package q3;
public class TenThreads extends Thread
{
	public static void main(String[] args) 
	{
		Thread[] ThreadList = new Thread[10];
		System.out.println("Initializing 10 Thread objects.");
		for(int i=0; i<10; i++)
		{
			test obj = new test();
			ThreadList[i] = obj;
		}
		
		System.out.println("Initial value of counter variable:"+test.counter);
		System.out.println();
		System.out.println("Starting the Threads....");
		for(int i=0; i<10; i++)
		{
			ThreadList[i].start();
		}
	}	
}
