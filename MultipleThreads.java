class MyThread extends Thread
{
	public MyThread()
	{
		System.out.println("Deafult thread is created: ");
	}
	public MyThread(String name)
	{
		super(name);
		System.out.println("para-thread is created: ");
	}
	public void run()
	{
		for(int i=0;i<20;i++)
		{
			System.out.println(this);
			try
			{
				Thread.sleep(400);
			}
			catch (Exception e)
			{
			}
		}
	}

}
class MultipleThreads 
{
	public static void main(String[] args) 
	{
		System.out.println("Main-() start: ");
		MyThread t1 = new MyThread("one");
		t1.setPriority(1);
		t1.start();
		System.out.println("T1 is Running "+t1.isAlive());
		MyThread t2 = new MyThread("Two");
		t2.setPriority(10);
		t2.start();
		System.out.println("T2 is Running "+t2.isAlive());
		for(int i=0;i<20;i++)
		{
			System.out.println("Saurabh");
			System.out.println(Thread.currentThread());
			try
			{
				Thread.sleep(600);
			}
			catch (Exception e)
			{
			}
		}
		System.out.println("Main-() End: ");
	}
}
