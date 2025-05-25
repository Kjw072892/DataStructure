package DataStructureLecture.BinaryTree;

public class TestBinaryTree {
    public static void main(String[] args) {
        BinaryTree<Integer> bst = new BinaryTree<>();

        int[] values = { 10, 5, 15, 3, 7, 12, 18 };
        for (int val : values) {
            bst.insert(val);
        }

        System.out.print("Inorder traversal (sorted): ");
        bst.inorder(); // 3 5 7 10 12 15 18

//        System.out.print("Preorder traversal: ");
//        bst.preorder(); // 10 5 3 7 15 12 18
//
//        System.out.print("Postorder traversal: ");
//        bst.postorder(); // 3 7 5 12 18 15 10
//
//        System.out.print("Level-order traversal:\n");
//        bst.levelOrder(); // 10 5 15 3 7 12 18
    }
}
