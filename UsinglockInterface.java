import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
class Runner
{
	private int counter=0;
	ReentrantLock lockob = new ReentrantLock();
	public void increment()
	{
		lockob.lock();//Lock object are used of locking 
		try
		{
			
			for(int i=0;i<10;i++)
			{
				counter++;
				System.out.println(Thread.currentThread().getName()+" - "+counter+"- InWaiting::"+lockob.getQueueLength()+"Any one Waiting: "+lockob.hasQueuedThreads());
				try{Thread.sleep(500);}catch(Exception e){}
			}
		}
		catch (Exception e)
		{
		}
		finally
		{
			lockob.unlock();
		}
	}
}
class  UsinglockInterface
{
	public static void main(String[] args) 
	{
		Runner ob = new Runner();

		Thread t1 = new Thread(){
			public void run()
			{
				ob.increment();
			}
		};
		t1.start();
		t1.setName("Saurabh");

		Thread t2 = new Thread(){
			public void run()
			{
				ob.increment();
			}
		};
		t2.start();
		t2.setName("Sayali");

		Thread t3 = new Thread(){
			public void run()
			{
				ob.increment();
			}
		};
		t3.start();
		t3.setName("upashe");
	}
}
