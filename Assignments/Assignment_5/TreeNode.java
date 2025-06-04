package Assignments.Assignment_5;

public class TreeNode<T extends Comparable<T>>{
    protected final T element;
    protected TreeNode<T> left;
    protected TreeNode<T> right;

    /**
     * Instantiates a TreeNode object
     * @param obj the comparable object
     */
    public TreeNode(final T obj) {
        left = null;
        right = null;
        element = obj;
    }

    /**
     *
     * @return the element of the node
     */
    public T getElement() {
        return element;
    }

    /**
     * The left tree/node child
     * @return the left node
     */
    public TreeNode<T> getLeft() {
        return left;
    }

    /**
     * The right tree/node child
     * @return the right node
     */
    public TreeNode<T> getRight() {
        return right;
    }

    /**
     * Sets the left child of type TreeNode
     * @param node a new/existing left tree
     */
    public void setLeft(final TreeNode<T> node) {
        left = node;
    }

    /**
     * Sets the right child of type TreeNode
     * @param node a new/existing right tree
     */

    public void setRight(final TreeNode<T> node) {
        right = node;
    }
}
