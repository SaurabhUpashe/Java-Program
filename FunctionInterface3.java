import java.util.function.Function;
class FunctionInterface3
{
	public static void main(String[] args)
	{
		Function<String,Integer> ob = str -> str.length();
		System.out.println(" "+ob.apply("Hello Evry One"));
		
	}
}
