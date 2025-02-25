import java.util.function.Consumer;
import java.util.Arrays;
class  ConsumerInterfaceArray
{
	public static void main(String[] args) 
	{
		Integer [] arr = {85,96,32,75,14,95};
		Consumer <Integer []> ob = n -> System.out.println(" "+Arrays.toString(n));
		ob.accept(arr);

		//Your can write like but consumer take input as object so write as above problem
		//int [] arr = {85,96,32,75,14,95};
		//Consumer<int []> ob = n -> System.out.println(" "+Arrays.toString(n));
		//ob.accept(arr);
	}
}
