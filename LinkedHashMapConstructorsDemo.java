import java.util.LinkedHashMap;
import java.util.Map;
public class LinkedHashMapConstructorsDemo {

    public static void main(String[] args) {
        // 1. Default constructor
        LinkedHashMap<String, Integer> defaultMap = new LinkedHashMap<>();
        defaultMap.put("One", 1);
        defaultMap.put("Two", 2);
        System.out.println("Default constructor: " + defaultMap);

        // 2. Constructor with initial capacity
        LinkedHashMap<String, Integer> initialCapacityMap = new LinkedHashMap<>(10);
        initialCapacityMap.put("Three", 3);
        initialCapacityMap.put("Four", 4);
        System.out.println("Constructor with initial capacity: " + initialCapacityMap);

        // 3. Constructor with initial capacity and load factor
        LinkedHashMap<String, Integer> capacityAndLoadFactorMap = new LinkedHashMap<>(10, 0.75f);
        capacityAndLoadFactorMap.put("Five", 5);
        capacityAndLoadFactorMap.put("Six", 6);
        System.out.println("Constructor with initial capacity and load factor: " + capacityAndLoadFactorMap);

        // 4. Constructor with initial capacity, load factor, and access order
        LinkedHashMap<String, Integer> accessOrderMap = new LinkedHashMap<>(10, 0.75f, true);
		accessOrderMap.put("Eleven",11);
        accessOrderMap.put("Seven", 7);
        accessOrderMap.put("Eight", 8);
        // Accessing one of the elements to change order if accessOrder is true
      //  accessOrderMap.get("Seven");
        System.out.println("Constructor with initial capacity, load factor, and access order: " + accessOrderMap);

        // 5. Copy constructor
        Map<String, Integer> existingMap = new LinkedHashMap<>();
        existingMap.put("Nine", 9);
        existingMap.put("Ten", 10);
        LinkedHashMap<String, Integer> copyMap = new LinkedHashMap<>(existingMap);
        System.out.println("Copy constructor: " + copyMap);
    }
}
