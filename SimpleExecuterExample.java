import java.util.concurrent.*;
class SimpleExecuterExample 
{
	public static void main(String[] args) 
	{
		//ExecutorService pool = Executors.newCachedThreadPool();
		//ExecutorService pool = Executors.newSingleThreadExecutor();
		ExecutorService pool = Executors.newFixedThreadPool(2);

		Runnable ob = new Thread(){
			public void run()
			{
				for(int i=0;i<10;i++)
				{
					System.out.println(Thread.currentThread().getName()+" = "+i);
					try{Thread.sleep(400);}catch(Exception e){}
				}
				System.out.println("======================");
			}
		};
		pool.execute(ob);
		//ob.setName("Saurabh");

		Runnable ob1 = new Runnable(){
			public void run()
			{
				for(int i=0;i<10;i++)
				{
					System.out.println(Thread.currentThread().getName()+" = "+i);
					try{Thread.sleep(400);}catch(Exception e){}
				}
				System.out.println("======================");
			}
		};
		pool.execute(ob1);

		Runnable ob2 = new Runnable(){
			public void run()
			{
				for(int i=0;i<10;i++)
				{
					System.out.println(Thread.currentThread().getName()+" = "+i);
					try{Thread.sleep(400);}catch(Exception e){}
				}
			}
		};
		pool.execute(ob2);

		Runnable ob3 = new Runnable(){
			public void run()
			{
				for(int i=0;i<10;i++)
				{
					System.out.println(Thread.currentThread().getName()+" = "+i);
					try{Thread.sleep(400);}catch(Exception e){}
				}
				System.out.println("======================");
			}
		};
		pool.execute(ob3);

		Runnable ob4 = new Runnable(){
			public void run()
			{
				for(int i=0;i<10;i++)
				{
					System.out.println(Thread.currentThread().getName()+" = "+i);
					try{Thread.sleep(400);}catch(Exception e){}
				}
				System.out.println("======================");
			}
		};
		pool.execute(ob4);
		//pool.setName("Saurabh");
		pool.shutdown();
	}
}
