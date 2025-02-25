class MyThread extends Thread
{
	public MyThread()
	{
		System.out.println("Default- MyThread is Created-: ");
	}
	public MyThread(String name)
	{
		super(name);
		System.out.println("Para - MyThread is Created: ");
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
		System.out.println("Default- YourThread is Created-: ");
	}
	public YourThread(String name)
	{
		super(name);
		System.out.println("Para - YourThread is Created: ");
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
class DiffrentThreadExample 
{
	public static void main(String[] args) 
	{
		System.out.println("Main()-start");

		MyThread t1 = new MyThread();
		t1.setPriority(1);
		t1.setName("Shubham");
		t1.start();

		YourThread t2 = new YourThread();
		t2.setPriority(10);
		t2.setName("Aryan");
		t2.start();

		System.out.println("t1 is Running: "+t1.isAlive());
		for(int i=0;i<10;i++)
		{
			System.out.println(Thread.currentThread().getName());
			try
			{
				Thread.sleep(600);
			}
			catch (Exception e)
			{

			}
		}

		System.out.println("T1 Priority: "+t1.getPriority());
		System.out.println("T2 Priority: "+t2.getPriority());
		System.out.println("T1 Name: "+t1.getName());
		System.out.println("T2 Name: "+t2.getName());
		System.out.println("T1 ID: "+t1.getId());
		System.out.println("T2 ID: "+t2.getId());


	}
}
