class Demo extends Thread
{
	public Demo(String name)
	{
		super(name);
	}
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(Thread.currentThread().getName()+" is running: ");
			Thread.yield();
		}
	}
}
class UsingJoinMethod 
{
	public static void main(String[] args) 
	{
		Demo t1 = new Demo("t1");
		Demo t2 = new Demo("t2");
		//System.out.println("Main Start()");
		t1.start();
		try
		{
			t1.join();
		}
		catch (Exception e)
		{
		}
		t2.start();
		//t1.interrupt();
		
	}
}
