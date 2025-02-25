class Resources
{
	private String []data = {"hello", "Good day", "to", "all", "of you","wish", "you ", "all the", "best"};

	synchronized public void show()
	{
		for(int i=0;i<data.length;i++)
		{
			try{Thread.sleep(500);}catch(Exception e){}
			System.out.println(data[i]);
		}
		System.out.println(Thread.currentThread().getName()+" is End");
	}
}
class  UsingSynchMethod
{
	public static void main(String[] args) 
	{
		System.out.println("Main() Start");
		Resources rob = new Resources();

		Thread t1 = new Thread(){
			public void run()
			{
				rob.show();
			}
		};
		t1.start();

		Thread t2 = new Thread(){
			public void run()
			{
				rob.show();
			}
		};
		t2.start();
		
	}
}
