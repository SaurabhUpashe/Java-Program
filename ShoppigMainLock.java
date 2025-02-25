import java.util.Random;
class Cart extends Thread
{
	private double bill = 0.0;
	Object lock; 
	public Cart(Object lock)
	{
		this.lock = lock;
	}
	public double getBill()
	{
		return bill;
	}
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			try{Thread.sleep(500);}catch(Exception e){}
				System.out.println("Cart Waiting..........: "+i);
		}
		synchronized(lock)
		{
			for(int i=0;i<5;i++)
			{
				try{Thread.sleep(400);}catch(Exception e){}
				int price = new Random().nextInt(300);
				System.out.println("Iteam : "+(i+1)+" Price: "+price);
				bill=bill+price;
			}
			lock.notify();
		}
	}
}
class TaskCaller extends Thread
{
	Object lock;
	Cart c1;
	public TaskCaller(Object lock,Cart c1)
	{
		this.lock = lock;
		this.c1 = c1;
	}
	public void run()
	{
		synchronized(lock)
		{
			for(int i=0;i<15;i++)
			{
				try{Thread.sleep(500);}catch(Exception e){}
				System.out.println("Taskcaller waiting()...."+i);
				if(i==10)
				{
					try{lock.wait();}catch(Exception e){}
				}
			}
			System.out.println("Total Bill is: "+c1.getBill());
		}
	}
}
class ShoppigMainLock 
{
	public static void main(String[] args) 
	{
		Object lock = new Object();

		Cart c1 = new Cart(lock);
		TaskCaller t1 = new TaskCaller(lock,c1);

		c1.start();
		t1.start();
	}
}
