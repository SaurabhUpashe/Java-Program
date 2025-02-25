import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
class Runner
{
	private int counter=0;
	Lock lock = new ReentrantLock();
	public void incr()
	{
		lock.lock();
		try
		{
			for(int i=0;i<10;i++)
			{
				counter++;
				System.out.println(Thread.currentThread().getName()+" == "+counter);
				try{Thread.sleep(500);}catch(Exception e){}
			}
		}
		catch (Exception e)
		{
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
			for(int i=0;i<10;i++)
			{
				counter--;
				System.out.println(Thread.currentThread().getName()+" == "+counter);
				try{Thread.sleep(500);}catch(Exception e){}
			}
		}
		catch (Exception e)
		{
		}
		finally
		{
			lock.unlock();
		}
	}

}
class DiffrentMethodOfResources 
{
	public static void main(String[] args) 
	{
		Runner rob = new Runner();

		Thread t1 = new Thread(){
			public void run()
			{
				rob.incr();
			}
		};
		t1.start();

		Thread t2 = new Thread(){
			public void run()
			{
				rob.decr();
			}
		};
		t2.start();
	}
}
