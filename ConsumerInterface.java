import java.util.function.Consumer;
class ConsumerInterface 
{
	public static void main(String[] args) 
	{
		Integer []arr = {11,22,33,44,55,66};
		Consumer<Integer> ob = ar -> System.out.println(ar);
		for(Integer val : arr)
		{
			ob.accept(val);
		}
		
	}
}
