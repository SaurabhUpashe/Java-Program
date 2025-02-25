import java.util.*;
import java.util.function.Predicate;
class RemoveIfInArrayList 
{
	public static void main(String[] args) 
	{
		ArrayList <Integer> numbers = new ArrayList<>(); 
		numbers.add(11);
        numbers.add(20);
        numbers.add(33);
        numbers.add(40);
        numbers.add(50);
        numbers.add(61);
        numbers.add(70);
        numbers.add(15); 
		System.out.println("Numbers: " + numbers);
		
		Predicate <Integer> isEven = (number) -> number % 2 == 0;

		numbers.removeIf(isEven);
		System.out.println("Numbers After Removing Even Number: "+numbers);

		Predicate<Integer> isGreater = (number) -> number > 30 ;
		numbers.removeIf(isGreater);
		System.out.println("Numbers After Removing Number Greater Than 30: "+numbers);

	}
}
