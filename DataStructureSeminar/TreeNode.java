package DataStructureSeminar;

public class TreeNode <T extends Comparable<T>> {
    TreeNode<T> left;
    TreeNode<T> right;
    T val;

    public TreeNode(){
        left = null;
        right = null;
    }

    public TreeNode(T val){
        super();
        this.val = val;
    }
}
