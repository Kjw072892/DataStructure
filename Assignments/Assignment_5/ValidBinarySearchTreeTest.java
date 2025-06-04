package Assignments.Assignment_5;

import java.util.*;

public class ValidBinarySearchTreeTest {

    /**
     * Builds a binary tree from a level-order array representation.
     * Null values in the array represent null nodes in the tree.
     *
     * @param values Array containing the level-order representation of the tree
     * @return The root of the constructed tree
     */
    private static TreeNode<Integer> buildTree(Integer[] values) {
        if (values == null || values.length == 0 || values[0] == null) {
            return null;
        }

        TreeNode<Integer> root = new TreeNode<>(values[0]);
        Queue<TreeNode<Integer>> queue = new LinkedList<>();
        queue.offer(root);

        int i = 1;
        while (!queue.isEmpty() && i < values.length) {
            TreeNode<Integer> current = queue.poll();

            // Add left child
            if (values[i] != null) {
                current.left = new TreeNode<>(values[i]);
                queue.offer(current.left);
            }
            i++;

            // Add right child
            if (i < values.length && values[i] != null) {
                current.right = new TreeNode<>(values[i]);
                queue.offer(current.right);
            }
            i++;
        }

        return root;
    }

    /**
     * Parses an input string into an array of Integers.
     * The input should be in the format: [1,2,null,3] or [1,2,3]
     *
     * @param input The string representation of the array
     * @return An array of Integer objects
     */
    private static Integer[] parseInput(String input) {
        input = input.trim();
        if (input.startsWith("[")) {
            input = input.substring(1);
        }
        if (input.endsWith("]")) {
            input = input.substring(0, input.length() - 1);
        }

        if (input.isEmpty()) {
            return new Integer[0];
        }

        String[] parts = input.split(",");
        Integer[] result = new Integer[parts.length];

        for (int i = 0; i < parts.length; i++) {
            String part = parts[i].trim();
            if (part.equals("null")) {
                result[i] = null;
            } else {
                result[i] = Integer.parseInt(part);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the binary tree in level-order traversal format.");
        System.out.print("Input: ");

        String input = scanner.nextLine();
        scanner.close();

        Integer[] values = parseInput(input);
        TreeNode<Integer> root = buildTree(values);

        ValidBinarySearchTree<Integer> solution = new ValidBinarySearchTree<>();
        boolean isValid = solution.isValidBST(root);

        System.out.println("Is valid BST: " + isValid);
    }
}
