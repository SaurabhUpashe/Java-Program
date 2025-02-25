import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
class Runner
{
	private int counter=0;
	public void incr()
	{
		for(int i=0;i<10;i++)
		{
			counter++;
			System.out.println(Thread.currentThread().getName()+" == "+counter);
			try{Thread.sleep(500);}catch(Exception e){}
		}
	}
}
class LockUsingCaller 
{
	public static void main(String[] args) 
	{
		Runner rob = new Runner();
		Lock lock = new ReentrantLock();
		//Lock lock1 = new ReentrantLock();
		

		Thread t1 = new Thread(){
			public void run()
			{
				lock.lock();//Here lock is object and lock()is built in function to aqurie locking
							//In this sitution
				try
				{
					rob.incr();
				}
				catch (Exception e)
				{
				}
				finally
				{
					lock.unlock();
				}
			}
		};
		t1.start();
		t1.setName("one");

		Thread t2 = new Thread(){
			public void run()
			{
				lock.lock();
				try
				{
					rob.incr();
				}
				catch (Exception e)
				{
				}
				finally
				{
					lock.unlock();
				}
			}
		};
		t2.start();
		t2.setName("Two");
	}
}
