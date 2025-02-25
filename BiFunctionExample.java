import java.util.function.BiFunction;
class BiFunctionExample 
{
	public static void main(String[] args) 
	{
		BiFunction<Integer,Double,Double> ob = (a,b) -> a+b;

		Double answer = ob.apply(10,85.63);
		System.out.println("Addition is: "+answer);
	}
}
