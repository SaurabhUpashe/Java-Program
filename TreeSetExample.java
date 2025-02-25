import java.util.*;
class TreeSetExample 
{
	public static void main(String[] args) 
	{
		TreeSet<Integer> tree = new TreeSet<>();
		tree.add(15);
		tree.add(47);
		tree.add(1);
		tree.add(85);
		tree.add(33);
		System.out.println("Tree Set is: "+tree);

		Set<Integer> set = new TreeSet<>();
		set.add(85);
		set.add(12);
		set.add(95);
		System.out.println("Using Set: "+set);

		// Using the constructor with a collection parameter
		List<Integer> list = Arrays.asList(36,47,2,13,75,22);
		TreeSet<Integer> ob = new TreeSet<>(list);
		System.out.println("Using Constructor: "+ob);

		TreeSet<String> tree1 = new TreeSet<>(Comparator.reverseOrder());
		tree1.add("Banana");
		tree1.add("Apple");
		tree1.add("Orange");
		System.out.println("Using Comparator: "+tree1);

	}
}
