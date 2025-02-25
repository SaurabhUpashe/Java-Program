class MyThread
{
	int start,end;
	MyThread(int start,int end)
	{
		this.start = start;
		this.start = end;
	}
	public void calsum()
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
class SumExcuter extends Thread
{
	MyThread task;
	public SumExcuter(MyThread task)
	{
		this.task=task;
		start();
	}
	public void run()
	{
		task.calsum();
	}
}
class StartingTheTask 
{
	public static void main(String[] args) 
	{
		MyThread task1 = new MyThread(2,5);
		SumExcuter m1 = new SumExcuter(task1);

		MyThread task2 = new MyThread(1,5);
		SumExcuter m2 = new SumExcuter(task2);

		//MyThread task3 = new MyThread(1,9);
		SumExcuter m3 = new SumExcuter(task1);
		SumExcuter m4 = new SumExcuter(task2);
		SumExcuter m5 = new SumExcuter(task1);
		//System.out.println("Hello World!");
	}
}
