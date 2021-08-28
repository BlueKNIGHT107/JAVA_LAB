package q4;
public class ThreadPriority extends Thread
{
	long StartTime;
	long LifeTime;
	
	@Override
	public void run()
	{
		StartTime = System.currentTimeMillis();
		System.out.println("Thread:"+Thread.currentThread().getName()+" started");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Initializing 5 Threads with different priorities.");
		ThreadPriority[] ThreadList = new ThreadPriority[5];
		for(int i=0; i<5; i++)
		{
			ThreadList[i] = new ThreadPriority();
			ThreadList[i].setPriority(i*2+1);
			
			System.out.println("Thread:"+ThreadList[i].getName()+" Priority:"+ThreadList[i].getPriority()+" created.");
		}
		System.out.println();
		
		
		
		
		System.out.println("Starting the 5 Threads.");
		for(int i=0; i<5; i++)
		{
			ThreadList[i].start();
		}
		System.out.println();
		
		
		
		
		int[] topTwoIndex = {0,0};
		int maxPriority = ThreadList[0].getPriority();
		for(int i=1; i<5; i++)
		{
			int currentPriority = ThreadList[i].getPriority();
			if(currentPriority>maxPriority)
			{
				maxPriority = currentPriority;
				topTwoIndex[1]=topTwoIndex[0];
				topTwoIndex[0]=i;
			}
		}
		
		System.out.println("Sending 2 threads with max priority to sleep");
		try 
		{
			ThreadList[topTwoIndex[0]].sleep(1000);
			System.out.println("Thread:"+ThreadList[topTwoIndex[0]].getName()+" Priority:"+ThreadList[topTwoIndex[0]].getPriority()+" put to sleep.");
			
			ThreadList[topTwoIndex[1]].sleep(1000);
			System.out.println("Thread:"+ThreadList[topTwoIndex[1]].getName()+" Priority:"+ThreadList[topTwoIndex[1]].getPriority()+" put to sleep.");
			
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		System.out.println();
		
		
		
		System.out.println("Checking aliveness of each thread and finding out the long lasting thread:");
		for(int i=0; i<5;i++) 
		{
			while(ThreadList[i].isAlive())
			{
				System.out.println("Thread:"+ThreadList[i].getName()+"is alive.");
			}
			ThreadList[i].LifeTime=(System.currentTimeMillis()-ThreadList[i].StartTime);
		}
		
		
		long LongLasting = ThreadList[0].LifeTime;
		int[] LongLastingIndex = {0,-1,-1,-1,-1};
		
		for(int i=0; i<5;i++)
		{
			if(ThreadList[i].LifeTime>LongLasting)
			{
				LongLastingIndex[0]=i;
				LongLasting = ThreadList[i].LifeTime;
				System.out.println(LongLastingIndex[0]);
			}
		}
		
		int index=1;
		for(int i=0; i<5;i++)
		{
			if(i!=LongLastingIndex[0])
			{
				if(ThreadList[LongLastingIndex[0]].LifeTime==ThreadList[i].LifeTime)
				{
					LongLastingIndex[index++]=i;
				}
			}
		}
		
		index=0;
		while(LongLastingIndex[index]!=-1 && index<5)
		{
			ThreadPriority obj = ThreadList[LongLastingIndex[index++]];
			System.out.println("The long lasting thread is:"+obj.getName()+" with lifetime="+obj.LifeTime);
		}
	}
}
