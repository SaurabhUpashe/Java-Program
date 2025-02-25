class Demo implements Runnable
{
	Thread t= null;
	public Demo()
	{
		t= new Thread(this);
		t.setName("Aryan");
	}
}
class  UsingAnynomousClass
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Demo d=  new Demo();
		d.t.start()
		for(int i=0;i<10;i++)
		{
			System.out.println(Thread.currentThread().getName());
		}
		
	}
}
