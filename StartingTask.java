class Task extends Thread
{
	public void run()
	{
		int total=0;
		for(int i=0;i<10;i++)
		{
			total=total+i;
			try{Thread.sleep(400);}catch(Exception e){}
			System.out.println("i: "+i);
		}
		System.out.println("Tatal is: "+total);
	}
}
class  StartingTask
{
	public static void main(String[] args) 
	{
		Task t1 = new Task();
		t1.start();
	}
}
