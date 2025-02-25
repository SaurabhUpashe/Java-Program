import java.io.*;

public class InputOutputFailureExample {
    public static void main(String[] args) {
        try {
            // Simulating I/O failure (e.g., network stream interrupted)
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter something:");
            String input = reader.readLine(); // Could throw IOException if I/O fails
        } catch (IOException e) {
            System.out.println("I/O failure occurred: " + e.getMessage());
        }
    }
}

