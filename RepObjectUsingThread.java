class Myclass extends Thread
{
	Thread t;
	String info;
	public Myclass()
	{
		super("Thread-0");
		t=this;
	}
	public String toString()
	{
		t= Thread.currentThread();
		info = "["+t.getName()+","+t.getPriority()+","+t.getThreadGroup()+"]";
		return info;
	}
}
class RepObjectUsingThread
{
	public static void main(String[] args) 
	{
		Myclass ob = new Myclass();
		System.out.println("Object Info: "+ob);
	}
}
