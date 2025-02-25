import java.util.TreeSet;
public class TreeSetMethodsDemo {
    public static void main(String[] args) {
        // Creating a TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Adding elements to the TreeSet
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(40);
        treeSet.add(50);
        treeSet.add(30);
        treeSet.add(19);

        // Displaying the original TreeSet
        System.out.println("Original TreeSet: " + treeSet);

        // Demonstrating headSet() method
        TreeSet<Integer> headSet = (TreeSet<Integer>) treeSet.headSet(50);
        System.out.println("headSet(40): " + headSet);

        // Demonstrating tailSet() method
        TreeSet<Integer> tailSet = (TreeSet<Integer>) treeSet.tailSet(40);
        System.out.println("tailSet(40): " + tailSet);

        // Demonstrating subSet() method
        TreeSet<Integer> subSet = (TreeSet<Integer>) treeSet.subSet(20, 50);
        System.out.println("subSet(20, 50): " + subSet);
    }
}
