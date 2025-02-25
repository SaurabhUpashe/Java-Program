import java.util.*;
class UsingRetailAll 
{
	public static void main(String[] args) 
	{
		ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        
        // Adding elements to the first ArrayList
        list1.add("apple");
        list1.add("banana");
        list1.add("orange");
        list1.add("grapes");
        
        // Adding elements to the second ArrayList
        list2.add("banana");
        list2.add("orange");
        list2.add("kiwi");
        
        // Printing the original lists
        System.out.println("Original list1: " + list1);
        System.out.println("Original list2: " + list2);

		// Retaining only the elements that are common in both lists
		boolean changed = list1.retainAll(list2);
		System.out.println(" list1: " + list1);

		// Checking if the list1 has been modified
        System.out.println("List1 has been modified: " +changed);
        
	}
}
