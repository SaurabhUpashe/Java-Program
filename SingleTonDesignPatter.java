class Example
{
	private static Example instance;
	private String msg="Hello I Am Saurabh: ";
	private Example()
	{
		System.out.println("Private Constructer: ");
	}
	public static Example creation()
	{
		if(instance==null)
		{
			instance = new Example();
		}
		return instance;
	}
	void showMessage()
	{
		System.out.println("Name: "+msg);
	}
}
class SingleTonDesignPatter 
{
	public static void main(String[] args) 
	{
		Example ob = Example.creation();
		Example ob1 = Example.creation();
		Example ob2 = Example.creation();

		ob.showMessage();
		ob1.showMessage();
		ob2.showMessage();

		System.out.println("Hello World!");
	}
}
