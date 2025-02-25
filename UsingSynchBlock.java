class Resources
{
	private String []data1 = {"hello", "Good day", "to", "all", "of you","wish", "you ", "all the", "best"};
	private String []data2 = {"THIS", "IS", "THE", "ANOTHER", "MESSAGE","DISPLAYED", "USING ", "DIFFERENT", "METHOD"};
	
	Object lock = new Object();// if you have not Predefined object that time you creat 
							//like this using object class
	//int x= 10; primitive data type not allowed cause it has not lock 

	public void show()
	{
		System.out.println("The Data show() is: ");
		synchronized(lock)//here you can also use 'this' that time no need creat object using Object class
		{
			for(int i=0;i<data1.length;i++)
			{
				try{Thread.sleep(600);}catch(Exception e){};
				System.out.println(data1[i]);
			}
		}
		System.out.println(Thread.currentThread().getName()+" is End");
	}
	public void display()
	{
		System.out.println("The Data display() is: ");
		synchronized(lock)//here you can also use 'this' that time no need creat object using Object class
		{
			for(int i=0;i<data2.length;i++)
			{
				try{Thread.sleep(600);}catch(Exception e){};
				System.out.println(data2[i]);
			}
		}
		System.out.println(Thread.currentThread().getName()+" is End");
	}
}
class  UsingSynchBlock
{
	public static void main(String[] args) 
	{
		System.out.println("Main() start");
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
				rob.display();
			}
		};
		t2.start();
		
	}
}
