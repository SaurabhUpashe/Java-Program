import java.util.*;
public class HashtableExampleSecond {

    public static void main(String[] args) {
        // Initialize the Hashtable
        Hashtable<String, Integer> hashtable = new Hashtable<>();

        // Adding new key-value pairs to the Hashtable
        hashtable.put("One", 1);
        hashtable.put("Two", 2);
        hashtable.put("Three", 3);

        // Display the map
        System.out.println("Initial hashtable: " + hashtable);

        // Access an element
        System.out.println("Value for key 'Two': " + hashtable.get("Two"));

        // Remove an element
        hashtable.remove("Two");
        System.out.println("After removing key 'Two': " + hashtable);

        // Check for key and value
        System.out.println("Contains key 'Three'? " + hashtable.containsKey("Three"));
        System.out.println("Contains value 3? " + hashtable.contains(3));

        // Iterate over the map using entrySet
        for (Map.Entry<String, Integer> entry : hashtable.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Use putIfAbsent
        hashtable.putIfAbsent("Four", 4);
        System.out.println("After putIfAbsent 'Four': " + hashtable);

        // Replace an entry
        hashtable.replace("Four", 40);
        System.out.println("After replace 'Four' with 40: " + hashtable);

        // Compute a value if absent
        hashtable.computeIfAbsent("Five", lS -> 5);
        System.out.println("After computeIfAbsent 'Five': " + hashtable);

        // Clear the map
        hashtable.clear();
        System.out.println("After clear: " + hashtable.isEmpty());
    }
}
