import java.util.ArrayList;

public class OutOfMemoryErrorExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        try {
            while (true) {
                list.add(1); // Continually adding elements
            }
        } catch (OutOfMemoryError e) {
            System.out.println("Error: Out of memory!");
        }
    }
}
