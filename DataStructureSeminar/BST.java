package DataStructureSeminar;

import DataStructureLecture.Iterator.ArrayList;
import org.w3c.dom.ls.LSOutput;

public class BST <T extends Comparable<T>> {
    protected TreeNode<T> root;

    public BST(T val){
        root = new TreeNode<>(val);
    }

    public void insert (final T val) {
        TreeNode<T> tempRoot = root;

        //Need to check left values and right values

    }

    private void insert (TreeNode<T> node, T val){
        T tempVal = node.val;

        if(tempVal.compareTo(val) > 0) {
            if(node.left == null){
                root.left = new TreeNode<>(node.val);
            } else {
                insert(node.left, val);
            }

        } else if(tempVal.compareTo(val) < 0) {
            if(node.right == null) {
                root.right = new TreeNode<>(node.val);
            }
            insert(node.left, val);
        }

    }



    public static void main(String[] args) {
        BST<Integer> bst = new BST<>(6);

    }
}
