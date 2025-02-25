import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
class Resources
{
	private int value;
	public Resources()
	{
		value=0;
	}
	Lock lock = new ReentrantLock();
	private final Condition notfull = lock.newCondition();
	private final Condition notEmpty = lock.newCondition();
	public int getValue()
	{
		lock.lock();
		try
		{
			return value;
		}
		finally
		{
			lock.unlock();
		}
	}
	public void incr()
	{
		lock.lock();
		try
		{
			while(value==1)
			{
				try{notfull.await();}catch(Exception e){}
			}	
			value++;
			System.out.println("Producer- Thread: "+value);
			notEmpty.signal();
		}
		finally
		{
			lock.unlock();
		}
	}
	public void decr()
	{
		lock.lock();
		try
		{
			while(value==0)
			{
				try{notEmpty.await();}catch(Exception e){}
			}
			value--;
			System.out.println("Consumer - Thread: "+value);
			notfull.signal();
		}
		finally
		{
			lock.unlock();
		}
	}
}
class Producer extends Thread
{
	Resources rob;
	public Producer(Resources rob)
	{
		this.rob = rob;
	}
	public void run()
	{
		while(true)
		{
			rob.incr();
			try {Thread.sleep(2000);} catch (InterruptedException e) { e.printStackTrace();}
		}
	}
}
class Consumer extends Thread
{
	Resources rob;
	public Consumer(Resources rob)
	{
		this.rob = rob;
	}
	public void run()
	{
		while(true)
		{
			rob.decr();
			try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
		}
	}
}
class ProducerAndConsumerUsingLock 
{
	public static void main(String[] args) 
	{
		Resources rob = new Resources();
		Producer p = new Producer(rob);
		Consumer c = new Consumer(rob);
		 p.start();
		 c.start();
	}
}
