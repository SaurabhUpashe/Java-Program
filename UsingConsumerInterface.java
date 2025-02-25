import java.util.function.Consumer;
/*class UsingConsumerInterface 
{
	public static void main(String[] args) 
	{
		Consumer<String> result = msg -> System.out.println("Message is: "+msg);
		result.accept("Hello Saurabh");
		//System.out.println("Hello World!");
	}
}*/

class UsingConsumerInterface 
{
	public static void main(String[] args) 
	{
		Consumer<Integer> result = (no) -> {
			//int tmp=30;
			if(no1>no)
			{
				System.out.println("Tmp is Greter than Number");
			}
			else
			{
				System.out.println("Number is Greter than tmp");
			}
		};
		result.accept(20);
		//System.out.println("Hello World!");
	}
}