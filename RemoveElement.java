import java.util.*;
class RemoveElement 
{
	public static void main(String[] args) 
	{
		SortedSet<String> ob = new TreeSet<>();
		ob.add("Aryan");
		ob.add("Sayali");
		ob.add("Manthan");
		ob.add("Shubham");
		ob.add("Bhakti");

		boolean value1 = ob.remove("Shubham");
		System.out.println("Is boolean: "+value1);

		boolean value2 = ob.removeAll(ob);
		System.out.println("is boolena two: "+value2);
	}
}
