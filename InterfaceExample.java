interface Demo
{
	 int DATA=10;//It is bydefault public static and final you must be 
				//provide value at time of decleaer

	/*static
	{
		//DATA=200;//error: initializers not allowed in interfaces
		System.out.println("Hi am Saurabh Upashe:");
	}*/
}
class InterfaceExample 
{
	public static void main(String[] args) 
	{
		System.out.println("Data is: "+Demo.DATA);
		//Demo.DATA=200;// error: cannot assign a value to static final variable DATA
	}
}
