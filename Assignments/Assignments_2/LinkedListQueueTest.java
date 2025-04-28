import Assignments.Assignments_2.LinkedListQueue;

import java.util.*;

/**
 * This is the test class for the LinkedListQueue implementation.
 * This program will perform operations to test the queue functionality.
 *
 * @author TCSS 143 B Instruction Team
 * @version 0.1
 */
public class LinkedListQueueTest {
    /**
     * This is the main method for the LinkedListQueueTest class.
     *
     * @param theArgs is used for the command line arguments.
     */
    public static void main(String[] theArgs) {
        System.out.println("Welcome to the LinkedListQueue Testing Program!");
        System.out.println("This program will test the enqueue, dequeue, first, and other queue methods.");

        LinkedListQueue<String> queue = new LinkedListQueue<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an operation: enqueue, dequeue, first, size, isEmpty, or exit:");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Exiting the program.");
                break;
            }

            try {
                switch (input.toLowerCase()) {
                    case "enqueue":
                        System.out.println("Enter an element to enqueue:");
                        String element = scanner.nextLine();
                        queue.enqueue(element);
                        System.out.println("Enqueued: " + element);
                        break;
                    case "dequeue":
                        String dequeued = queue.dequeue();
                        System.out.println("Dequeued: " + dequeued);
                        break;
                    case "first":
                        System.out.println("First element: " + queue.first());
                        break;
                    case "size":
                        System.out.println("Queue size: " + queue.size());
                        break;
                    case "isempty":
                        System.out.println("Queue is empty: " + queue.isEmpty());
                        break;
                    default:
                        System.out.println("Invalid operation. Try again.");
                        break;
                }
            } catch (NoSuchElementException e) {
                System.out.println("Error: The queue is empty.");
            } catch (Exception e) {
                System.out.println("An unexpected error occurred: " + e.getMessage());
            }

            System.out.println("-----------------------------------------");
        }

        scanner.close();
    }
}
