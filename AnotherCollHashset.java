import java.util.*;
class AnotherCollHashset 
{
	public static void main(String[] args) 
	{
		List<Integer> list1 = new ArrayList<>();
		list1.add(5);
		list1.add(10);
		list1.add(15);
		list1.add(20);
		list1.add(25);

		List<Integer> list2 = new ArrayList<>();
		list2.add(3);
		list2.add(6);
		list2.add(9);
		list2.add(12);
		list2.add(15);

		Set <Integer> set1 = new HashSet<>(list1);
		System.out.println("HashSet one: "+set1);

		set1.addAll(list2);
		System.out.println("HashSet Two: "+set1);

		Iterator<Integer>ob = set1.iterator();
		while(ob.hasNext())
		{
			System.out.println(ob.next());
		}
	}
}
