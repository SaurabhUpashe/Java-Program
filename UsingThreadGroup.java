class MyThread extends Thread
{
	public MyThread()
	{
		System.out.println("Default-MyThread");
	}
	public MyThread(ThreadGroup tg, String name)
	{
		super(name);
		System.out.println("Para-MyThread");
	}
	public void run()
	{
		for(int i=0;i<10;i++)
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
class YourThread extends Thread
{
	public YourThread()
	{
		System.out.println("Default-YourThread");
	}
	public YourThread(ThreadGroup tg , String name)
	{
		super(name);
		System.out.println("Para-YourThread");
	}
	public void run()
	{
		for(int i=0;i<10;i++)
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
class  UsingThreadGroup
{
	public static void main(String[] args) 
	{
		System.out.println("main()-start");
		ThreadGroup tg = new ThreadGroup("MyGroup");

		MyThread t1 = new MyThread(tg,"saurabh");
		t1.setPriority(2);
		t1.start();

		YourThread t2 = new YourThread(tg,"Sayali");
		t2.setPriority(6);
		t2.start();

	    for(int i=0;i<10;i++)
		{
			System.out.println(Thread.currentThread().getName());
			try
			{
				Thread.sleep(400);
			}
			catch (Exception e)
			{

			}
		}
		System.out.println("Main()-End");


	}
}
