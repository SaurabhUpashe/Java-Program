import java.util.*;
class HashMapExample 
{
	public static void main(String[] args) 
	{
		//HashMap store data in key-value pairs
		Map<String,Integer> map = new HashMap<>();
		map.put("key1",null);
		map.put("key2",45);
		map.put(null,60);//one null key and multiple null value is allowed is allowed 
		map.put("key4",null);
		map.put("key5",25);
		map.put("key1",78);//does not allow duplicate key
		System.out.println("Hash Map: "+map);

		HashMap<String,Integer> capacity = new HashMap<>(10);
		capacity.put("Key 3",9);
		capacity.put("key6",20);
		System.out.println("Hash Map Using Capacity: "+capacity);

		HashMap<String, Integer> capacityLoadFactorMap = new HashMap<>(10, 0.7f);
        capacityLoadFactorMap.put("Key4", 400);
        System.out.println("Constructor with initial capacity and load factor: " + capacityLoadFactorMap);

		//
		Map<String,Integer> orgmap = new HashMap<>();
		orgmap.put("keyA",100);
		orgmap.put("keyB",200);
		System.out.println("Existing Map: "+orgmap);

		Map<String,Integer> copymap = new HashMap<>(orgmap);
		System.out.println("Copy Map: "+copymap);



		
	}
}
