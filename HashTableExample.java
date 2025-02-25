import java.util.*;
class HashTableExample 
{
	public static void main(String[] args) 
	{
		Hashtable<String,String> ht = new Hashtable<>();
		ht.put("Saurabh","Upashe");
		ht.put("Aryan","Patil");
		ht.put("Gaurav","Atugade");
		ht.put("Shubham","Jadhav");
		ht.put("Sangita","Kalokhe");
		ht.put("Dhananjay","Upashe");
		System.out.println("HashTable is : "+ht);

		 // Constructor with initial capacity
        Hashtable<String, Integer> initialCapacityHashtable = new Hashtable<>(20);
        initialCapacityHashtable.put("Three", 3);
        initialCapacityHashtable.put("Four", 4);
        System.out.println("Constructor with initial capacity: " + initialCapacityHashtable);

        // Clone constructor
        Hashtable<String, Integer> cloneHashtable = new Hashtable<>(initialCapacityHashtable);
        System.out.println("Clone constructor: " + cloneHashtable);
	}
}
