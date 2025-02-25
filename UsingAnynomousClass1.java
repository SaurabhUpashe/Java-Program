/*class Demo extends Thread
{
	Thread t = null;
	public Demo()
	{
		t = new Thread(this);
		t.setName("Aryan");
		t.start();
	}
}*/
class  UsingAnynomousClass1
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		//Thread t1 = new Thread();
		Runnable d = new Demo(){

			public void run()
			{
				for(int i=0;i<10;i++)
				{
					System.out.println(Thread.currentThread());
				}
			}
		};
		//d.start();
		/*d.setName("Saurabh");
		d.setPriority(10);
		*/		
	}
}
