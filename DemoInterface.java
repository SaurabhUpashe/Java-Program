interface A
{
	void display();
}
interface B
{
	default void display()
	{
		System.out.println("Saurabh Upashe");
	}
}
class C implements A,B
{
	public void display()
	{
		System.out.println("Aryan Upashe");
	}
	
}
class  DemoInterface
{
	public static void main(String[] args) 
	{
		C ob = new C();
		ob.display();
		ob.displayC();
	}
}
