import java.util.concurrent.*;
class Resources
{
	int x [] = {11,22,33,44,55,66};
	//Semaphore obj = new Semaphore(1);
		//Semaphore obj = new Semaphore(2,true);
		//Semaphore obj = new Semaphore(3);
		Semaphore obj = new Semaphore(3,true);
		//Semaphore obj = new Semaphore(1);
	public void show()
	{
		

		try
		{
			obj.acquire();
			//System.out.println("Permits acquires");
			for(int i=0;i<10;i++)
			{
				System.out.println(Thread.currentThread().getName()+" - "+i);
				try{Thread.sleep(400);}catch(Exception e){}
			}

		}
		catch(Exception e){}
		finally
		{
			System.out.println(Thread.currentThread().getName()+"release Permit");
			obj.release();
		}
	}
}
class SemophoreExample 
{
	public static void main(String[] args) 
	{
		Resources rob = new Resources();

		for(int i=0;i<10;i++)
		{
			new Thread(){
				public void run()
				{
					rob.show();
				}
			}.start();
			
		}
	}
}
