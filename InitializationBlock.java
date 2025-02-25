class Demo
{
	{
		System.out.println("Initailizerr Block: ");
	}
	public Demo()
	{
		System.out.println("Defalut Constructer: ");
	}
	public Demo(int a)
	{
		System.out.println("Para Constructer-1: ");
	}
	public Demo(int a,int b)
	{
		System.out.println("para Constructer-2: ");
	}

}
class  InitializationBlock
{
	public static void main(String[] args) 
	{
		Demo ob = new Demo();
		Demo ob1 = new Demo(100);
		Demo ob2 = new Demo(500,600);
	}
}
