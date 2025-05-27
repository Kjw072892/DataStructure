package Assignments.Assignment_4;

/**
 * Converts an ordered linked list into a linked-list-based BST
 * @param <T> any comparable object
 * @author Kassie Whitney
 * @version 5/27/2025
 */
public class ConvertSortedListToBST<T extends Comparable<T>> {
    private ListNode<T> rootNode;

    /**
     * Calls the methods that convert an ordered linked list into a BST linked list
     * @param head the head of the linked list
     * @return  linked-list-based BST
     */
    public TreeNode<T> sortedListToBST(ListNode<T> head) {
        int size = getSize(head);
        rootNode = head;
        return convert(0, size - 1);
    }

    /**
     * Gets the size of the linked list to determine the middle index
     * @param head the head of the linked list
     * @return  the size of the linked list
     */
    private  int getSize(ListNode<T> head) {
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        return count;
    }

    /**
     * Converts the sorted linked list into a BST linked list
     * @param min Left most node
     * @param max Right most node
     * @return  the root node
     */
   private TreeNode<T> convert(int min, int max) {
       //Returns null if there are no more children for the rootNode
        if (min > max){
            return null;
        }

        //Ensures to take the upper middle number if linked list length is even
        int mid = Math.ceilDiv((min + max), 2);

        //Recursively builds the left subtree from min to mid - 1
        TreeNode<T> leftChild = convert(min, mid - 1);

        //Instantiates a new root node given the current value of the rootNode
        TreeNode<T> root = new TreeNode<>(rootNode.val);

        //moves the pointer to the right setting the next node as the current root node
        rootNode = rootNode.next;

        //sets the left child for the current root node
        root.left = leftChild;

        //Recursively builds the right subtree from mid + 1 to max
       //sets the right child for the current root node
        root.right = convert(mid + 1, max);

        return root;
    }
}
