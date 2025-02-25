import java.util.ArrayList;
public class OutOfMemoryErrorExample1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        
            while (true) {
                list.add(1); // Continually adding elements
            }
        
    }
}
