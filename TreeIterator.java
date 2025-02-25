import java.util.*;
class TreeIterator 
{
	public static void main(String[] args) 
	{
		TreeSet<Integer> tree = new TreeSet<>();
		tree.add(25);
		tree.add(12);
		tree.add(3);
		tree.add(96);
		System.out.println("Tree Set: "+tree);

		//Using iterator
		Iterator<Integer> itr = tree.iterator();
		while(itr.hasNext())
		{
			Integer sort = itr.next();
			System.out.println(sort);
		}
	}
}
