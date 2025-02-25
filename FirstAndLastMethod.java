import java.util.*;
class FirstAndLastMethod 
{
	public static void main(String[] args) 
	{
		TreeSet<Integer> tree = new TreeSet<>();
		tree.add(85);
		tree.add(63);
		tree.add(77);
		tree.add(3);
		tree.add(12);
		System.out.println("Tree Set: "+tree);
		
		int first = tree.first();
		System.out.println("Tree Set First: "+first);

		int last = tree.last();
		System.out.println("Tree Set Last: "+last);

	}
}
