import java.util.*;
class ExampleOfUnmodifibleList 
{
	public static void main(String[] args) 
	{
		List<String> unmodify = Collections.unmodifiableList(fruits);

		System.out.println("\nUnmodifiable List: ");
        printList(unmodifiableList);

		try
		{
			unmodify.add("Mango");
			System.out.println("Successfully added Mango (should not happen!)");
		}
		catch (Exception e)
		{
			System.out.println("Adding element to unmodifiable list: " + e);
		}
		//System.out.println("Hello World!");
	}
}
