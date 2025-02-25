class Message
{
	synchronized public void show()
	{
		System.out.println("Hi");
		System.out.println("Every");
		System.out.println("one");
		System.out.println("Good");
		System.out.println("Afternoon");
		System.out.println("all");
		System.out.println("of");
		System.out.println("you");
		System.out.println("Bye");
	}
}
class MyThread extends Thread
{
	Message msg;
	public MyThread(Message ob)
	{
		msg = ob ;
	}
	public void run()
	{
		msg.show();
	}
}
class  UsingSynchronization
{
	public static void main(String[] args) 
	{
		Message m = new Message();

		MyThread t1 = new MyThread(m);
		t1.start();
		try{t1.join();}catch(Exception e){}
		System.out.println("++++++++++++++++++++++++++++");
		MyThread t2 = new MyThread(m);
		t2.start();
		//System.out.println("Hello World!");
	}
}
