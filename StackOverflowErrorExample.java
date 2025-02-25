public class StackOverflowErrorExample {
    public static void recursiveCall() {
        recursiveCall(); // Infinite recursion
    }

    public static void main(String[] args) {
        try {
            recursiveCall();
        } catch (StackOverflowError e) {
            System.out.println("Error: Stack overflow occurred!");
        }
    }
}

