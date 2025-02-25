import java.util.Random;
class Cart extends Thread
{
	private double bill=0.0;
	public double getBill()
	{
		return bill;
	}
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			try{Thread.sleep(400);}catch(Exception e){}
			System.out.println("run() Waiting: "+i);
			if(i==4)
			{
				System.out.println("===========Dead===============");
			}
		}
		synchronized(this)
		{
			for(int i=0;i<5;i++)
			{
				try{Thread.sleep(400);}catch(Exception e){}
				int price = new Random().nextInt(200);
				this.notify();
				System.out.println("Item: "+i+" price: "+price);
				bill=bill+price;
			}
			//
		}
		
	}
}
class  ShoppingMain
{
	public static void main(String[] args) 
	{
		Cart c1 = new Cart();
		c1.start();

		synchronized(c1)
		{
			for(int i=0;i<20;i++)
			{	
				//System.out.println("Main() is runnig: "+i);
				try{Thread.sleep(400);}catch(Exception e){};
					System.out.println("Main() is waiting: "+i);
				if(i==10)
				{
					try{
						c1.wait();
					}
					catch(Exception e)
					{
						System.out.println("Exeption is Generated: ");
					}
					System.out.println("Main method is Infinite Sleep");
				}
			}
		}
		System.out.println("Total Bill is: "+c1.getBill());
	}
}
