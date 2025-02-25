class Resources
{
	synchronized public void sayHii()
	{
		System.out.println("Hiiii");
	}
	synchronized public void sayHello()
	{
		System.out.println("Hello");
	}
}
class MainExampleResources 
{
	public static void main(String[] args) 
	{
		Resources rob = new Resources();

		Thread t1 = new Thread(){
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

		Thread t2 = new Thread(){
			public void run()
			{
				for(int i=0;i<10;i++)
				{
					rob.sayHello();
					try{Thread.sleep(600);}catch(Exception e){}
				}
			}
		};
		t2.start();
	}
}
