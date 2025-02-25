class Resources
{
	private int value;
	{
		value=0;
	}
	public int getValue()
	{
		return value;
	}
	public void incr()
	{
		value++;
		System.out.println("Produce - value: "+value);
	}
	public void decr()
	{
		value--;
		System.out.println("Consume - value: "+value);
	}
}
class Producer extends Thread
{
	Resources rob;
	public Producer( Resources rob)
	{
		this.rob=rob;
	}
	public void run()
	{
		synchronized(rob)
		{
			for(int i=0;i<10;i++)
			{
				if(rob.getValue()==1)
				{
					System.out.println("sayali upashe");
					try{rob.wait();}catch(Exception e){}
				}
				try{Thread.sleep(400);}catch(Exception e){}
				rob.incr();
				rob.notify();
			}
		}
	}
}
class Consumer extends Thread
{
	Resources rob;
	public Consumer(Resources rob)
	{
		this.rob=rob;
	}
	public void run()
	{
		synchronized(rob)
		{
			for(int i=0;i<10;i++)
			{
				if(rob.getValue()==0)
				{
					System.out.println("saurabh upashe");
					try{rob.wait();}catch(Exception e){}
				}
				try{Thread.sleep(800);}catch(Exception e){}
				rob.decr();
				rob.notify();
			}
		}
	}
}
class ProducerAndConsumer 
{
	public static void main(String[] args) 
	{
		Resources rob = new Resources();
		
		Producer p1 = new Producer(rob);
		p1.start();

		Consumer c1 = new Consumer(rob);
		c1.start();
	}
}
