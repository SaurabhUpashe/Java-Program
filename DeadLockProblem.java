import java.util.Random;
class Message
{
	String msg;
	boolean empty = true;
	public synchronized String read()//Method used by reader
	{
		while(empty)
		{
			try
			{
				wait();
			}
			catch (Exception e)
			{
				System.out.println(Thread.currentThread().getName() + "Interrupted.");
			}
			//System.out.println("Waiting for data write....!! so able to read");			
			//try {Thread.sleep(2000);} catch (InterruptedException e) {}
		}
		empty=false;
		notify();
		return msg;
	}
	public synchronized void write(String msg)//method used by writer
	{
		while(!empty)
		{
			try
			{
				wait();
			}
			catch (Exception e)
			{
				System.out.println(Thread.currentThread().getName() + "Interrupted.");
			}
			//System.out.println("Waiting for data write....!! so able to write");
			//try{Thread.sleep(2000);}catch(Exception e){}
		}
		this.msg = msg;
		empty = false;
		notify();
	}
}
class Reader implements Runnable
{
	Message msg;
	public Reader(Message msg)
	{
		this.msg = msg;
	}
	public void run()
	{
		Random r = new Random();
		for(String latestMessage = msg.read(); !"Finished!".equals(latestMessage);latestMessage = msg.read())
		{
			System.out.println(latestMessage);
			try{Thread.sleep(r.nextInt(2000));}catch(Exception e){}
		}
	}
}
class Writer implements Runnable
{
	Message msg;
	public Writer(Message msg)
	{
		this.msg  = msg;
	}
	public void run()
	{
		String Messages [] = {
			"Johnny, Johnny, Yes Papa",
            "Eating sugar? No, Papa!",
            "Telling lies? No, Papa!",
            "Open your mouth, Ha! Ha! Ha!"
		};

		Random r = new Random();
		for(int i=0;i<Messages.length;i++)
		{
			msg.write(Messages[i]);
			try{Thread.sleep(r.nextInt(2000));}catch(Exception e){}
		}
		msg.write("Finished!");
	}
}
class DeadLockProblem 
{
	public static void main(String[] args) 
	{
		Message msg = new Message();

		Thread writerob = new Thread(new Writer(msg));
		writerob.start();

		Thread readerob = new Thread(new Reader(msg));
		readerob.start();
	}
}
