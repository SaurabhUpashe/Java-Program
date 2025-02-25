class Resources
{
	private int value;
	{
		value=0;
	}
	public int getValue(){return value;}
	public void produce()
	{
		value++;
		System.out.println("Produces Value: "+value);
	}
	public void consume()
	{
		value--;
		System.out.println("Consume Value: "+value);
	}
}
class ProdAndConsUsingAnonymous  
{
	public static void main(String[] args) 
	{
		Resources rob = new Resources();
		//Resources rob = new Resources();

		Thread t1 = new Thread(){
			public void run()
			{
				synchronized(rob)
				{
					for(int i=0;i<15;i++)
					{
						if(rob.getValue()==1)
						{
							System.out.println("Saurabh");
							try{rob.wait();}catch(Exception e){}
						}
						try{Thread.sleep(400);}catch(Exception e){}
						rob.produce();
						rob.notify();
					}
				}
			}
		};
		//t1.start();

		Thread t2 = new Thread(){
			public void run() {
				synchronized(rob) {
					for(int i=0 ; i<15 ; i++) {
						if(rob.getValue()==0)
						{
							try{ rob.wait(); } catch(Exception e){}
						}
						try{Thread.sleep(300);}catch(Exception e){}
						rob.consume();
						rob.notify();
					}
				}
			}
		};
		t1.start();
		t2.start();
		
	}
}

