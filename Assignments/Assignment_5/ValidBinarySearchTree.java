package Assignments.Assignment_5;


import java.util.HashMap;
import java.util.Hashtable;

public class ValidBinarySearchTree<T extends Comparable<T>>  {

    private TreeNode<T> theRoot = null;


    ValidBinarySearchTree(){}

    /**
     * The left subtree of a node contains only nodes with keys less than the node's key. The right
     * subtree of a node contains only nodes with keys greater than the node's key. Both the left and
     * right subtrees must also be binary search trees.Checks if the binary search tree is valid or not
     */
    public boolean isValidBST(final TreeNode<T> rootNode) {
        theRoot = rootNode;

        return isValidHelper(rootNode, null, null);

    }

   /**
     * Helper function that validates the left and right elements
     */
    private boolean isValidHelper(TreeNode<T> rootNode, T leftElement, T rightElement) {
    if (rootNode == null){
        return true;
    }

    T rootElement = rootNode.element;

    if (leftElement != null && rootElement.compareTo(leftElement) < 0){
        return false;
    }

    if (rightElement != null && rootElement.compareTo(rightElement) > 0) {
        return false;
    }

    return isValidHelper(rootNode.left, leftElement, rootNode.element) &&
           isValidHelper(rootNode.right, rootNode.element, rightElement);
    }
}
