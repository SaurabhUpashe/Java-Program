import java.util.*;
class AddElementInHashSet 
{
	public static void main(String[] args) 
	{
		HashSet<String> set1 = new HashSet<>();
		set1.add("Java");
		set1.add("Python");
		set1.add("JavaScript");
		set1.add("Python");
		set1.add("Ruby");
		set1.add("Java");
		set1.add("Swift");
		System.out.println("Displayin Hashset Element: ");
		for(String val : set1)
		{
			System.out.println(val);
		}
	}
}
