import java.util.*;
import java.util.function.*;
class ReplaceAllMethodUsing 
{
	public static void main(String[] args) 
	{
		List <Integer> numbers = new ArrayList<>();

		// Adding elements to the ArrayList
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

		System.out.println(numbers);
		UnaryOperator<Integer> ob = n -> n*n;

		numbers.replaceAll(ob);
		//you can write directly
		//numbers.replaceAll(n -> n*n);

		System.out.println("Numbers after Replycing squre: "+numbers);

	}
}
