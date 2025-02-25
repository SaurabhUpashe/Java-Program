import java.util.*;
class ExampleOfLinkedHashSet 
{
	public static void main(String[] args) 
	{
		LinkedHashSet<String> link = new LinkedHashSet<>();
		link.add("One");
        link.add("Six");
        link.add("Three");
        link.add("Four");
        link.add("Five");
		link.add("Two");
		System.out.println("LinkedHashSet: "+link);

		link.add("Six");
		link.add("Four");
		link.add("Seven");
		System.out.println("After Duplicate LinkedHashSet : "+link);

		link.remove("Five");
		System.out.println("After Remove LinkedHashSet : "+link);

		System.out.println("Using for-each Loop: ");
		for(String val : link)
		{
			System.out.println(val);
		}

		System.out.println("Using iterator: ");
		Iterator<String> itr = link.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}


	}
}
