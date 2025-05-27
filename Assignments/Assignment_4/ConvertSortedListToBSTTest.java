package Assignments.Assignment_4;

import java.util.*;

public class ConvertSortedListToBSTTest {
    private static ListNode<Integer> createLinkedList(int[] values) {
        if (values == null || values.length == 0) {
            return null;
        }

        ListNode<Integer> dummy = new ListNode<>(0);
        ListNode<Integer> current = dummy;

        for (int val : values) {
            current.next = new ListNode<>(val);
            current = current.next;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        // Accept entire array as input
         int counter = 1;

         System.out.println("""
                 
                 Enter the entire array (e.g., [1,2,3,4,5])(type 'exit' to \
                 exit):
                 """);
         while(true) {
            Scanner scanner = new Scanner(System.in);


            System.out.println("Example " + counter);
            System.out.println("Input: ");
            String input = scanner.nextLine();

            if ("exit".equalsIgnoreCase(input)) {
                scanner.close();
                break;
            }

            // Parse the input string into an array of integers
            input = input.trim();
            if (input.startsWith("[")) input = input.substring(1);
            if (input.endsWith("]")) input = input.substring(0, input.length() - 1);

            String[] strValues = input.split(",");
            int[] values = new int[strValues.length];

            for (int i = 0; i < strValues.length; i++) {
                values[i] = Integer.parseInt(strValues[i].trim());
            }

            // Create linked list from the input array
            ListNode<Integer> head = createLinkedList(values);

            // Create instance and convert to BST
            ConvertSortedListToBST<Integer> converter = new ConvertSortedListToBST<>();
            TreeNode<Integer> root = converter.sortedListToBST(head);

            // Perform level-order traversal to verify tree structure
            List<Integer> result = levelOrderTraversal(root);
            System.out.println("\nOutput: ");
            System.out.println(result + "\n");
            counter ++;
        }
    }

    private static <T> List<T> levelOrderTraversal(TreeNode<T> root) {
        List<T> result = new ArrayList<>();
        if (root == null) return result;

        Queue<TreeNode<T>> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode<T> node = queue.poll();
            if (node != null) {
                result.add(node.val);
                queue.offer(node.left);
                queue.offer(node.right);
            } else {
                result.add(null);
            }
        }

        // Trim trailing nulls to match expected format
        int i = result.size() - 1;
        while (i >= 0 && result.get(i) == null) {
            result.remove(i--);
        }
        return result;
    }
}