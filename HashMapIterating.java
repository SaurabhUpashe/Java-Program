import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public class HashMapIterating {
    public static void main(String[] args) {
        // Creating a HashMap
        HashMap<String, String> map = new HashMap<>();
        map.put("Apple", "Red");
        map.put("Orange", "Orange");
        map.put("Banana", "Yellow");

       // Using `entrySet` and a `for-each` loop:
	   System.out.println("Using `entrySet` and a `for-each` loop:");
	   for(Map.Entry<String,String> entry : map.entrySet())
	   {
			System.out.println(entry.getKey()+" - "+entry.getValue());
	   }
	   System.out.println();

	   // Using `keySet` and a `for-each` loop:
       System.out.println("Using `keySet` and a `for-each` loop:");
	   for(String key : map.keySet())
	   {
		   System.out.println("Key: "+key+"\t Value: "+map.get(key));
	   }
	   System.out.println();

	   // Using `values` and a `for-each` loop:
	   System.out.println("Using `values` and a `for-each` loop:");
	   for(String val : map.values())
		{
			System.out.println("Value: "+val);
		}
		System.out.println();
		
		 // Using an `Iterator`:
        System.out.println("Using an `Iterator`:");
		Iterator<Map.Entry<String,String>> itr = map.entrySet().iterator();
		while(itr.hasNext())
		{
			Map.Entry<String,String> entry = itr.next();
			System.out.println(entry);
		}
		System.out.println();

		 // Using Java 8's `forEach` method:
		 map.forEach((key,value)-> System.out.println("Key: "+key+"\t Value: "+value));
    }
}
