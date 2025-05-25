package DataStructureLecture.BinaryTree;

public class BinaryTreeNode<T> {
    protected T element;
    protected BinaryTreeNode<T> left;
    protected BinaryTreeNode<T> right;

    public BinaryTreeNode(T obj) {
        element = obj;
        left = null;
        right = null;
    }

    public T getElement() {
        return element;
    }

    public BinaryTreeNode<T> getLeft() {
        return left;
    }

    public BinaryTreeNode<T> getRight() {
        return right;
    }

    public void setLeft(BinaryTreeNode<T> node) {
        left = node;
    }

    public void setRight(BinaryTreeNode<T> node) {
        right = node;
    }
}
