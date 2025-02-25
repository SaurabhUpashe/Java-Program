class MyThread extends Thread
{
	public MyThread()
	{
		System.out.println("Thread is Created: ");
	}
	public void run()
	{
		System.out.println("Thread is Running: ");
	}
}
class  ExampleOfThread
{
	public static void main(String[] args) 
	{
		System.out.println("in main-()-Start");
		MyThread t1 = new MyThread();
		t1.start();
		System.out.println("T1 is Running: "+t1.isAlive());
		System.out.println("Main-()-End");
	}
}
