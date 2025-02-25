class Demo implements Runnable
{
	public void run()
	{
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
		
	}
}
class  ImplemntRunnable
{
	public static void main(String[] args) 
	{
		System.out.println("Main()-Start: ");
		Demo d1 = new Demo();
		Thread t1 = new Thread(d1);
		t1.start();
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
	}
}
