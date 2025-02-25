class Resources
{
	private static String []data = {"hello", "Good day", "to", "all", "of you","wish", "you ", "all the", "best"};
	
	synchronized static public void show()
	{
		for(int i=0;i<data.length;i++)
		{
			try{Thread.sleep(600);}catch(Exception e){};
			System.out.println(data[i]);
		}
		System.out.println(Thread.currentThread().getName()+" is End");
	}
	pu
}
class UsingStaticSynchronization 
{
	public static void main(String[] args) 
	{
		Resources rob1 = new Resources();
		Resources rob2 = new Resources();

		Thread t1 = new Thread(){
			public void run()
			{
				rob1.show();
			}
		};
		t1.setName("one");
		t1.start();

		Thread t2 = new Thread(){
			public void run()
			{
				rob1.show();
			}
		};
		t2.setName("second");
		t2.start();

		Thread t3 = new Thread(){
			public void run()
			{
				rob2.show();
			}
		};
		t3.setName("Three");
		t3.start();


		Thread t4 = new Thread(){
			public void run()
			{
				rob2.show();
			}
		};
		t4.setName("Four");
		t4.start();
		System.out.println("Hello World!");
	}
}
