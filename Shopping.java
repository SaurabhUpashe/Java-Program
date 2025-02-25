import java.util.Random;
class Cart extends Thread 
{
	double bill=0.0;
    private Object lockob;
	public double getBill(){return bill;}
	public Cart(Object lock)
	{
		lockob = lock;
	}
	public void run()
	{
		synchronized(lockob)
		{
			for(int i=0;i<5;i++)
			{
				try{Thread.sleep(400);}catch(Exception e){};
				int price= new Random().nextInt(300);
				System.out.println("Iteam: "+i+" price: "+price);
				bill=bill+price;
			}
			lockob.notify();

		}
	}
}
class Shopping
{
	public static void main(String[] args) 
	{
		Object lock = new Object();
		Cart c = new Cart(lock);
		c.start();

		synchronized(lock)
		{
			try
			{
				c.wait();
				System.out.println("Total bill: "+c.getBill());
			}
			catch (Exception e)
			{
			}
		}
		
		
	}
}
