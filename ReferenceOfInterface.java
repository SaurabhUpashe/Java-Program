interface Sample
{
	void show();
}
class Example implements Sample
{
	public void show()
	{
		System.out.println("In Example show()");
	}
	public void getter()
	{
		System.out.println("In Example getter()");
	}
}
class ReferenceOfInterface 
{
	public static void main(String[] args) 
	{
		Sample ref = new Example();
		ref.show();
		ref.getter();// error: cannot find symbol
	}
}
