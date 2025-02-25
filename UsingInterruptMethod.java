class Demo extends Thread
{
	public Demo(String name)
	{
		super(name);
	}
	public void run()
	{
		for(int i=0;i<20;i++)
		{
			System.out.println("t1: "+i);
			try
			{
				Thread.sleep(600);
			}
			catch (Exception e)
			{
				System.out.println("Thread in Waiting area: ");
			}
		}
	}

}
class  UsingInterruptMethod
{
	public static void main(String[] args) 
	{
		Demo ob = new Demo("Saurabh");
		ob.start();

		for(int i=0;i<20;i++)
		{
			System.out.println("Main: "+i);
			try{Thread.sleep(1000);}catch(InterruptedException e){System.out.println("mainThread is Waiting: ");}
			if(i==5)
			{
				ob.interrupt();
			}
		}
		ob.interrupt();
		
	}
}
