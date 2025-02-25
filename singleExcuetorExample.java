import java.util.concurrent.*;
class singleExcuetorExample 
{
	public static void main(String[] args) 
	{
		ExecutorService pool = Executors.newSingleThreadExecutor();

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
		pool.shutdown();
	}
}
