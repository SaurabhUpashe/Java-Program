class Demo
{
	Demo()
	{
		System.out.println("Hello  every one: ");
	}
	public Demo(String name)
	{
		System.out.println(name);
	}
	public void display(String message)
	{
		System.out.println(message);
	}
	public void display()
	{
		System.out.println("Default Argument: ");
	}
}
class MainDefaultArgs 
{
	public static void main(String[] args) 
	{
		Demo ob = new Demo();
		ob.display();
		ob.display("Saurabh upashe: ");
	
		Demo ob1 = new Demo("Sangita Dhananjay Upashe");
		
	}
}
