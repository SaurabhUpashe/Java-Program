import java.util.function.Predicate;
class UsingPredicateLamdaExpression 
{
	public static void main(String[] args) 
	{
		Predicate<Integer> ob = (Number) -> Number % 3 == 0;
		System.out.println("Number are Dived By Three: "+ob.test(9));
	}
}
