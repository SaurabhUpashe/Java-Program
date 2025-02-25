class Demo
{
	private String []s1 = {"hello", "Good day", "to", "all", "of you","wish", "you ", "all the", "best"};
	private String []s2 = {"THIS", "IS", "THE", "ANOTHER", "MESSAGE","DISPLAYED", "USING ", "DIFFERENT", "METHOD"};
	
	synchronized public void show()
	{
		System.out.println("In Show()");
		for(int i=0;i<s1.length;i++)
		{
			try{Thread.sleep(600);}catch(Exception e){};
			System.out.println(s1[i]);
		}
		System.out.println(Thread.currentThread().getName()+" is End in show()");
	}
	synchronized public void output()
	{
		System.out.println("In Output()");
		for(int i=0;i<s2.length;i++)
		{
			try{Thread.sleep(600);}catch(Exception e){}
			System.out.println(s2[i]);
		}
		System.out.println(Thread.currentThread().getName()+" is End in output()");
	}
}
class Syncho 
{
	public static void main(String[] args) 
	{
		System.out.println("Main() Start");
		Demo dob = new Demo();
		Demo dob1 = new Demo();

		Thread t1 = new Thread(){
			public void run()
			{
				dob.show();
			}

		};
		t1.start();

		Thread t2 = new Thread(){
			public void run()
			{
				dob1.show();
			}

		};
		t2.start();
		
	}
}
