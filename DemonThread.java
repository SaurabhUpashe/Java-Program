class WorkerThread extends Thread
{
	public WorkerThread()
	{
		start();
	}
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(i+" - "+Thread.currentThread().getName()+" is Demon "+Thread.currentThread().isDaemon());
			try{Thread.sleep(400);}catch(Exception e){}
		}
	}
}
class Runner extends Thread
{
	public void run()
	{
		while(true)
		{
			try{Thread.sleep(400);}catch(Exception e){}
			System.out.println("Ob is Runnung Runner: "+this.isAlive());
		}
	}
}
class DemonThread 
{
	public static void main(String[] args) 
	{
		Runner ob = new Runner();
		ob.setDaemon(true);
		ob.start();
		System.out.println("Ob is Running custom: "+ob.isAlive());

		Thread []t= new Thread[4];
		for(int i=0;i<t.length;i++)
		{
			t[i] = new WorkerThread();
		}
		System.out.println("Ob is Running MAin: "+ob.isAlive());
		System.out.println("Main is Ended:");
	}	
}
