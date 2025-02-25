import java.util.*;
import java.util.function.*;
class DemoLinkedList
{
	public static void main(String[] args) 
	{
		LinkedList<String> ob = new LinkedList<>();
		ob.add("Apple");
        ob.add("Banana");
        ob.add("Cherry");
        ob.add("Date");
        ob.add("Elderberry");

		// Using iterator() to print all elements
		Iterator<String> itr = ob.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("Hello World!");

		// Using listIterator() to traverse forward and backward, modifying elements
        System.out.println("\nUsing listIterator (forward and backward):");
		ListIterator<String> lstr = ob.listIterator();
		while(lstr.hasNext())
		{
			String fruit = lstr.next();
			if(fruit.equals("Banana"))
			{
				lstr.set("BlueBerray");
			}
			System.out.println(fruit);
		}

		System.out.println("Traversing backward:");
        while (lstr.hasPrevious()) {
            System.out.println(lstr.previous());
        }

		// Using spliterator() to split and process the list
		System.out.println("\n Using spliterator:");
		Spliterator<String> spliterator1 = ob.spliterator();
		Spliterator<String> spliterator2 = spliterator1.trySplit();

        Consumer<String> consumer = fruit -> System.out.println("Processing: " + fruit);


	}
}
