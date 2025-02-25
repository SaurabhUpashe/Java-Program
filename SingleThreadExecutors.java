import java.util.concurrent.*;
class countDown extends Thread
{
	private String clockName;

	public countDown(String clockName)
	{
		this.clockName = clockName;
	}
	public void run()
	{
		int tot=0;
		String ThreadName = Thread.currentThread().getName();
		for(int i=0;i<10;i++)
		{
			tot = tot+i;
			System.out.printf("%s -> %s =%d\n",ThreadName,clockName,i);
			try{Thread.sleep(500);}catch(Exception e){}
		}
		
	}
}
class SingleThreadExecutors 
{
	public static void main(String[] args) 
	{
		//ExecutorService pool = Executors.newSingleThreadExecutor();//only one thread execute the task at time like a sync
		ExecutorService pool = Executors.newFixedThreadPool(3);//here only 3 thread execute at one time if you have 4 thread 
															//and remaing one is execute after this 3 threads complete their all task
		//ExecutorService pool = Executors.newCachedThreadPool();//at time all thread execute the task if 5 Thread excute 5 thread at one time pallel(asynchronus)

		pool.execute(new countDown("Saurabh"));
		pool.execute(new countDown("Sayali"));
		pool.execute(new countDown("Shubham"));
		pool.execute(new countDown("Aryan"));

		pool.shutdown();
	}
}
