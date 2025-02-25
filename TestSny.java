class Counter
{
	private int count=0;
	public void increment()
	{
		count++;
	}

	public  int getCount()
	{
		synchronized(this)
		{
			return count++;
		}
	}
}
class MyThread extends Thread
{
	private Counter cnt;
	public MyThread(Counter counter)
	{
		cnt=counter;
	}
	public void run()
	{
		for(int i=0;i<1000;i++)
		{
			cnt.increment();
		}
	}
}
class TestSny
{
	public static void main(String[] args) 
	{
		Counter ob = new Counter();
		MyThread t1 = new MyThread(ob);
		MyThread t2 = new MyThread(ob);
		t1.start();
		t2.start();
		try
		{
			t1.join();
			t2.join();
		}
		catch (Exception e)
		{
		}

		System.out.println(ob.getCount());
	}
}
