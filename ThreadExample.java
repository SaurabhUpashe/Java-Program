class MyThread extends Thread
{
	public MyThread()
	{
		System.out.println("Thread is Created: ");
	}
	public void run()
	{
		for(int i=1;i<20;i++)
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
class  ThreadExample
{
	public static void main(String[] args) 
	{
		System.out.println("Main()-Start");
		MyThread t = new MyThread();
		t.start();
		for(int i=0;i<19;i++)
		{
			System.out.println("Saurabh");
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
