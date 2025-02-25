import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class QueueOperations {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		boolean running = true;

        while (running) {
            System.out.println("\n Queue Operations Menu:");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Check if Queue is Empty");
            System.out.println("5. Display Queue");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();  // Consume the newline

            switch(choice)
			{
				case 1: 
					System.out.println("Enter the Element in Enqueue");
					String element = sc.nextLine();
					queue.add(element);
					System.out.println("Add in Enqueue: "+element);
					break;
				case 2:
					if(!queue.isEmpty())
					{
						String removeElement = queue.remove();
						System.out.println("Dequeue Element: "+removeElement);
					}
					else
					{
						System.out.println("Queue is Empty ,nothing to Dequeue");
					}
					break;
				case 3:
					if(!queue.isEmpty())
					{
						String removePeek = queue.peek();
						System.out.println("Dequeue Element: "+removePeek);
					}
					else
					{
						System.out.println("Queue is Empty ,nothing to Dequeue");
					}
					break;
				case 4:
					System.out.println("Queue is Empty: "+queue.isEmpty());
					break;
				case 5:
					System.out.println("Queue: "+queue);
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
