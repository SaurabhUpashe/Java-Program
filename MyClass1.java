interface A
{
	//void display();
	
	default void display()
	{
		System.out.println("Hiii am Saurabh");
	}
}
interface B
{
	void displays();
}
class Test implements A,B
{
	public void display()
	{
		A.super.display();
		System.out.println("Saurabh In archer Infotech: ");
	}
}
class MyClass1 
{
	public static void main(String[] args) 
	{
		Test t = new Test();
		t.display();
	}
}
