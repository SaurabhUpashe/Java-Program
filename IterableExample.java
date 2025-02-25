import java.util.*;
import java.util.function.*;
class IterableExample 
{
	public static void main(String[] args) 
	{
		ArrayList<String> ob = new ArrayList<>();
		ob.add("C++");
		ob.add("Java");
		ob.add("python");
		ob.add(0,"C");

		System.out.println("Iterat over Element Using For each loop");
		for(String val : ob)
		{
			System.out.println(val);
		}

		 /*Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String str) {
                System.out.println(str);
            }
        };*/

		System.out.println("Iterat over Element Using iterator");
		Iterator <String> itr = ob.iterator();
		while(itr.hasNext())
		{
			String str = itr.next();
			System.out.println(str);
			//consumer.accept(itr.next());
		}

		System.out.println("Using listiterator:(FWD)");
		ListIterator <String> itrt = ob.listIterator();
		while(itrt.hasNext())
		{
			System.out.println(itrt.next());
		}

		System.out.println("Using listiterator:(PRV) Reverce Direction: ");
		// As it starts from 0th location, prv option give values only when you attend 
		//non-zero index, otherwise blank
		while(itrt.hasPrevious())
		{
			System.out.println(itrt.previous());
		}

		// Using forEach with a Lambda Expression
		System.out.println("Using Lambda Expression:");
		ob.forEach(n -> System.out.println(n));//Internally call consumer accept()

		// Using forEach with a Method Reference
		System.out.println("\nUsing Method Reference:");
		ob.forEach(System.out::println);
	}
}
