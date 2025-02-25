class DemoThread implements Runnable
{
	Thread t = null;
	public DemoThread()
	{
		t = new Thread(this);
		t.setName("Saurabh");
		t.start();
	}
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(Thread.currentThread().getName());
			try
			{
				Thread.sleep(700);
			}
			catch (Exception e)
			{
			}
		}
	}
}
class RunnableInterfaceWay2
{
	public static void main(String[] args) 
	{
		System.out.println("Main()-start");
		DemoThread d1 = new DemoThread();

		System.out.println("==================");

		for(int i=0;i<10;i++)
		{
			System.out.println(Thread.currentThread());
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
