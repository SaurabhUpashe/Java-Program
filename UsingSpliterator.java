import java.util.*;
class UsingSpliterator 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> arlst=new ArrayList<Integer>();
		arlst.add(12);
		arlst.add(32);
		arlst.add(142);
		arlst.add(127);
		arlst.add(42);
		arlst.add(16);
		arlst.add(112);
		System.out.println("Entered Arraylist is: "+arlst);

		Iterator<Integer> itr = arlst.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

		//Using forEach 
		itr.forEachRemaining(element -> System.out.println(element));

		//-----------------------------------

		Spliterator<Integer> sob = arlst.spliterator();
		System.out.println("\n using spliterator tryadvance()-I: ");
		while(sob.tryAdvance(element ->System.out.println(element)));

		sob = arlst.spliterator();
		System.out.println("\n using spliterator tryadvance()-II: ");
		while(sob.tryAdvance(System.out::println));

		sob=arlst.spliterator();
		Spliterator<Integer> sob1 = sob.trySplit();
		System.out.println("\n Entered Arraylist(split part) is: ");
		if(sob1!=null)
		{
			sob1.forEachRemaining(n -> System.out.println(n));
		}
		
		sob.forEachRemaining(n -> System.out.println(n));
	}
}
