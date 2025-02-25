class  RunnableAnExample
{
	public static void main(String[] args) 
	{
		Thread t = new Thread(new Runnable(){
			public void run()
			{
				for(int i=0;i<25;i++)
				{
					System.out.println("Name: "+Thread.currentThread().getName()+"\t T is : "+i);
					
					try
					{
						Thread.sleep(400);
					}
					catch (Exception e)
					{

					}
				}

			}
		});
		t.start();
		t.setName("Saurabh");
		
		Thread t1 = new Thread(new Runnable(){
			public void run()
			{
				for(int i=0;i<25;i++)
				{
					System.out.println("Name T1: "+Thread.currentThread().getName()+"\t T1 is : "+i);
					try
					{
						Thread.sleep(500);
					}
					catch (Exception e)
					{
					}
				}
			}
		});
		t1.start();
		t1.setName("Sayali");
	}
}
