class Greeting
{
	void sayHello()
	{
		System.out.println("Hello form Greeting class: ");
	}
}
class AnonymousInnerClass
{
	public static void main(String[] args) 
	{
		Greeting ob = new Greeting();
		ob.sayHello();

		Greeting ob1 = new Greeting();
		ob1.sayHello();

		Greeting ob2 = new Greeting()
		{
			void sayHello()
			{
				System.out.println("Hello i am in Annonymous class: ");
			}
		};
		ob2.sayHello();
	}
}
