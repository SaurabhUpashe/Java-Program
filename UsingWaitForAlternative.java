class Resources
{
	boolean respond = false;
	synchronized void sayHii()
	{
		if(!respond)
		{
			try{ wait();}catch(Exception e){}
		}
		System.out.println("Hii");
		respond = false;
		notify();
	}
	synchronized void sayHello()
	{
		if(respond)
		{
			try{wait();}catch(Exception e){}
		}
		System.out.println("Hello");
		respond = true;
		notify();
	}
}
class UsingWaitForAlternative
{
	public static void main(String[] args) 
	{
		Resources rob = new Resources();

		Thread t1 = new Thread()
		{
			public void run()
			{
				for(int i=0;i<10;i++)
				{
					rob.sayHii();
					try{Thread.sleep(400);}catch(Exception e){}
				}
			}
		};
		t1.start();

		Thread t2 = new Thread()
		{
			public void run()
			{
				for(int i=0;i<10;i++)
				{
					rob.sayHello();
					try{Thread.sleep(400);}catch(Exception e){}
				}
			}
		};
		t2.start();
		//System.out.println("Hello World!");
	}
}
