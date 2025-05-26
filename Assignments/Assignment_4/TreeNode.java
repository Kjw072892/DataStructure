package Assignments.Assignment_4;

public class TreeNode<T> {
    public T val;
    public TreeNode<T> left;
    public TreeNode<T> right;


    public TreeNode(T elem) {
        val = elem;
        left = null;
        right = null;
    }


    public T getVal() {
        return val;
    }

    public TreeNode<T> getLeftSubTree() {
        return left;
    }

    public TreeNode<T> getRightSubTree() {
        return right;
    }

    public void setLeftSubTree(TreeNode<T> node) {
        left = node;
    }

    public void setRightSubTree(TreeNode<T> node) {
        right = node;
    }
}
