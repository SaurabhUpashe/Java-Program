import java.util.function.Predicate;
class Demo implements Predicate<Integer>
{
	public boolean test(Integer number)
	{
		return number % 2 == 0;
	}
}
class UsingPredicateClass
{
	public static void main(String[] args) 
	{
		Predicate <Integer> ob = new Demo();
		System.out.println("Number is Even: "+ob.test(4));
		System.out.println("Number is Even: "+ob.test(13));
	}
}
