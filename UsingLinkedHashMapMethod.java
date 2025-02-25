import java.util.*;
class UsingLinkedHashMapMethod 
{
	public static void main(String[] args) 
	{
		LinkedHashMap<String,Integer> link = new LinkedHashMap<>();
		link.put("Mon",1);
		link.put("Tue",2);
		link.put("Wen",3);
		link.put("Thu",4);
		link.put("Fri",5);
		link.put("Sat",6);
		link.put("Sun",7);

		 // Display the map
		System.out.println("Intial Map: "+link);

        // Access an element
		System.out.println("Value of 'Thursday' is: "+link.get("Thu"));

		// Remove an element
		link.remove("Sat");
		System.out.println("After Removing Map: "+link);

		// Check for key and value
		System.out.println("Sat is Contain: "+link.containsKey("Sat"));
		System.out.println("Monday is containing: "+link.containsValue(1));

		 // Iterate over the map using forEach
		link.forEach((key,value) -> System.out.println("Key: "+key+"\t Value: "+value));

		// Using entrySet to iterate over the map
		for(Map.Entry<String,Integer> entry : link.entrySet())
		{
			System.out.println(entry.getKey()+" - "+entry.getValue());
		}

		// Use putIfAbsent
		link.putIfAbsent("Sau",11);
		System.out.println("After pushIfAbsent() : "+link);

		// Replace an entry
		link.replace("Mon",14);
		System.out.println("After replace() : "+link);

		// Compute a value if absent
		link.computeIfAbsent("Wen", k -> 17);
        System.out.println("After computeIfAbsent 'Wen': " +link);

		//Clear the Map
		link.clear();
		System.out.println("After Clear(): " +link);

		//Size of Map
		System.out.println("Size of Map: "+link.size());//0
	}
}
