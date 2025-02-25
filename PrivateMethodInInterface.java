interface Demo
{
	default void sayHello()
	{
		System.out.println("default sayhello Method: ");
		log("SayHello from deafult Method: ");
		logStatic("SayHi from default method: ");
	}
	static void sayHi()
	{
		System.out.println("Static sayHi method: ");
		logStatic("SayHi from Static method: ");
		log("SayHello from Static Method: ");
	}
	private void log(String msg)
	{
		System.out.println("Logging: "+msg);
	}
	private static void logStatic(String msg)
	{
		System.out.println("Logging(static): "+msg);
	}
}
class  PrivateMethodInInterface
{
	public static void main(String[] args) 
	{
		Demo ob = new Demo(){};
		ob.sayHello();
		Demo.sayHi();
	}
}
