// Different Ways to Iterate Over a Vector in Java
import java.util.Vector;
import java.util.*;
class  DiffrentWayVectorIterat
{
	public static void main(String[] args) 
	{
		Vector <String> fruits = new Vector<>();
		fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

		System.out.println("Index based Iteration");
		for(int i=0;i<fruits.size();i++)
		{
			System.out.println(fruits.get(i));
		}

		System.out.println("Using for-each loop");
		for(String str : fruits)
		{
			System.out.println(str);
		}

		System.out.println("Using Iterator:");
		Iterator<String> itr = fruits.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

		System.out.println("Using ListIterator (FWD):");
		ListIterator<String> lstr = fruits.listIterator();
		while(lstr.hasNext())
		{
			System.out.println(lstr.next());
		}

		System.out.println("Using ListIterator (REV):");
		while(lstr.hasPrevious())
		{
			System.out.println(lstr.previous());
		}

		System.out.println("Using Enumeration:");
		Enumeration<String>  e = fruits.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}

		System.out.println("Using Lamda Expression:");
		fruits.forEach(fruit -> System.out.println(fruit));

		System.out.println("Using Method Reference:");
		fruits.forEach(System.out::println);


	}
}
