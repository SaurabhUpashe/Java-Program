class Task
{
	public void CalTotal()
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
class TaskExcuter extends Thread
{
	Task tob;
	public TaskExcuter( Task tob )
	{
		this.tob = tob;
	}
	public void run()
	{
		tob.CalTotal();
	}
}
class  StartingTask1
{
	public static void main(String[] args) 
	{
		Task tob = new Task();

		TaskExcuter t1 = new TaskExcuter(tob);
		t1.start();
	}
}
