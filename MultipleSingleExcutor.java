import java.util.concurrent.*;
class MultipleSingleExcutor 
{
	public static void main(String[] args) 
	{
		ExecutorService pool = Executors.newSingleThreadExecutor();
		ExecutorService pool = Executors.newCachedThreadPool();
		Runnable task = new Runnable(){
			public void run()
			{
				for(int i=0;i<10;i++)
				{
					System.out.println(Thread.currentThread().getName()+" - "+i);
					try{Thread.sleep(400);}catch(Exception e){}
				}
			}
		};
		pool.execute(task);
		

		Runnable task1 = new Runnable(){
			public void run()
			{
				for(int i=0;i<10;i++)
				{
					System.out.println(Thread.currentThread().getName()+" - "+i);
					try{Thread.sleep(400);}catch(Exception e){}
				}
			}
		};
		pool.execute(task1);
		pool.shutdown();
	}
}
