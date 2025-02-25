import java.util.*;
class AccesingMethodHashMap 
{
	public static void main(String[] args) 
	{
		HashMap<String, Integer> map = new HashMap<>();
		map.put("apple",10);
		map.put("banana",15);
		map.put("Orange",45);

		//It give the value of key if the key is the map,otherwise return 'null'
		System.out.println("Value of key 'Apple': "+map.get("banana"));//15

		map.remove("Orange");
		System.out.println("After Remove the Element: "+map);

		// Iterating over elements
		for(Map.Entry<String,Integer> entry : map.entrySet())
		{
			System.out.println(entry.getKey()+" - "+entry.getValue());
		}

		// Checking if a key exists
		System.out.println("Checking 'Organe' is exist: "+map.containsKey("Orange"));//false

		// Checking if a value exists
		System.out.println("Checking 'Banana' is exist: "+map.containsValue(15));//true

		// Getting the size of the HashMap
        System.out.println("Size of the map: " + map.size());

        // Clearing the HashMap
        map.clear();
        System.out.println("Is the map empty? " + map.isEmpty());


	}
}
