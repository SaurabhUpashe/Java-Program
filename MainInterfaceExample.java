interface Demo
{
	int CONSTANT=100;
	void display();
	void show();
}
class Sample extends Demo
{
    public void display()
	{
		System.out.println("In the display()");
	}
	public void show()
	{
		System.out.println("In the show()");
	}
}
class  MainInterfaceExample
{
	public static void main(String[] args) 
	{
		Sample ob = new Sample();
		ob.display();
		ob.show();
	}
}
