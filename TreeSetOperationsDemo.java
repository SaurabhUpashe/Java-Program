import java.util.*;
public class TreeSetOperationsDemo {
    public static void main(String[] args) {
        // Creating TreeSets
        TreeSet<Integer> set1 = new TreeSet<>();
        TreeSet<Integer> set2 = new TreeSet<>();

        // Adding elements to the first set
        set1.addAll(Arrays.asList(1, 2, 3, 4, 5));

        // Adding elements to the second set
        set2.addAll(Arrays.asList(4, 5, 6, 7, 8));

        // Displaying the original sets
        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);

        // Union operation
        TreeSet<Integer> union = new TreeSet<>(set1);
        union.addAll(set2);
        System.out.println("Union of set1 and set2: " + union);

        // Subset operation
        TreeSet<Integer> subset = new TreeSet<>(set1);
        subset.retainAll(set2);
        System.out.println("Subset of set1 and set2: " + subset);

        // Difference operation (set1 - set2)
        TreeSet<Integer> difference1 = new TreeSet<>(set1);
        difference1.removeAll(set2);
        System.out.println("Difference of set1 and set2: " + difference1);

        // Difference operation (set2 - set1)
        TreeSet<Integer> difference2 = new TreeSet<>(set2);
        difference2.removeAll(set1);
        System.out.println("Difference of set2 and set1: " + difference2);

        // Intersection operation
        TreeSet<Integer> intersection = new TreeSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("Intersection of set1 and set2: " + intersection);
    }
}
