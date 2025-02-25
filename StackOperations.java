import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class StackOperations {
    public static void main(String[] args) {
        LinkedList<String> stack = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		boolean running = true;

        while (running) {
            System.out.println("\nStack Operations Menu:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Check if Stack is Empty");
            System.out.println("5. Display Stack");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();  // Consume the newline
            
            switch(choice)
			{
				case 1: 
					System.out.println("Enter the Element in Stack");
					String element = sc.nextLine();
					stack.push(element);
					System.out.println("Add in Stack: "+element);
					break;
				case 2:
					if(!stack.isEmpty())
					{
						String PoppedElement = stack.pop();
						System.out.println("Pop Element: "+PoppedElement);
					}
					else
					{
						System.out.println("stack is Empty ,nothing to pop");
					}
					break;
				case 3:
					if(!stack.isEmpty())
					{
						String Peek = stack.peek();//Ist only return first element not remove
						System.out.println("Peek Element: "+Peek);
					}
					else
					{
						System.out.println("Stack is Empty ,nothing to Dequeue");
					}
					break;
				case 4:
					System.out.println("Stack is Empty: "+stack.isEmpty());
					break;
				case 5:
					System.out.println("stack: "+stack);
					break;
				case 6:
					running = false;
					System.out.println("Exiting...");
                    break;
				default:
				    System.out.println("Invalid choice. Please try again.");
			}
        }
        sc.close();
    }
}
