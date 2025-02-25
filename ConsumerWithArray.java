import java.util.function.Consumer;
class  ConsumerWithArray
{
	public static void main(String[] args) 
	{
		int []arr = {11,56,32,74,89,12};
		Consumer<Integer> result = n -> System.out.println(" "+n);
		
		for(int val : arr)
		{
			result.accept(val);
		}
		
		System.out.println("Hello World!");
	}
}
