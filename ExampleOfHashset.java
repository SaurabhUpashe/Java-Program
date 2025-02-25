import java.util.*;
class ExampleOfHashset 
{
	public static void main(String[] args) 
	{
		HashSet<String> set1 = new HashSet<>();
		set1.add("One");
		set1.add("Three");
		set1.add("Two");
		set1.add("One");
		System.out.println("HashSet is : "+set1);

		//asList() conveting array into fixed size List<>
		//Defined as static in  Arrays class
		Collection<String> c1 = Arrays.asList("Four","five","six");

		HashSet <String> set2 = new HashSet<>(c1);
		System.out.println("HashSet Set2: "+set2);

		// Using the constructor that accepts an initial capacity
		HashSet<String> set3 = new HashSet<>(10);
		set3.add("Seven");
		set3.add("eight");
		set3.add("nine");
		System.out.println("HashSet set3: "+set3);
		
		 // Using the constructor that accepts an initial capacity and load factor
		 HashSet<String> set4 = new HashSet<>(10,0.5f);
		 set4.add("Eleven");
		 set4.add("Twenty");
		 System.out.println("HashSet set4: "+set4);

	}
}
