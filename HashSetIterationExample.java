import java.util.HashSet;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;
public class HashSetIterationExample {
    public static void main(String[] args) {
        // Create a HashSet of Integers
        HashSet<Integer> set = new HashSet<>();

        // Add elements to the HashSet
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);

		//Using iterator Method
		System.out.println("Using iterator Method");
		Iterator<Integer> itr = set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

        
    }
}
