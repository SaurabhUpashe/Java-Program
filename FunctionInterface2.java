import java.util.function.Function;
class FunctionInterface2
{
	public static void main(String[] args) 
	{
		Function<Integer,String> ob = num -> "Number: "+num;
		System.out.println(" "+ob.apply(8565));
		
	}
}
