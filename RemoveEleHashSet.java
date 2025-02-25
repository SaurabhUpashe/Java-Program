import java.util.*;
class RemoveEleHashSet 
{
	public static void main(String[] args) 
	{
		HashSet <String> set = new HashSet<>();
		set.addAll(Arrays.asList("Apple","Banana","Orange","Gurva","Mango","Date"));
		System.out.println(set);

		set.remove("Mango");
		System.out.println("After remove: "+set);

		set.removeAll(Arrays.asList("Apple","Orange"));
		System.out.println("After remove Collection: "+set);

		set.removeIf(fruits -> fruits.startsWith("G"));//start with "G" Starting are remove
		System.out.println("After RemoveIf: "+set);
	}
}
