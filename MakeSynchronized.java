import java.util.*;
class MakeSynchronized 
{
	public static void main(String[] args) 
	{
		List<Integer> number = new LinkedList<>();
        
		List<Integer> ob = Collections.synchronizedList(number);

		Thread t1 = new Thread(()->{
			for(int i=1;i<=100;i++)
			{
				ob.add(i);
				try
				{
					Thread.sleep(200);
				}
				catch (Exception e){};
			}
		});

		Thread t2 = new Thread(() ->{
			while(true)
			{
				System.out.println("List Size(): "+ob.size());
				try
				{
					Thread.sleep(500);
				}
				catch (Exception e){}
			}
		});
        
		t1.start();
		t2.start();
	}
}
