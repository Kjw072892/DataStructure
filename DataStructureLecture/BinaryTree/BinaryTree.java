package DataStructureLecture.BinaryTree;

public class BinaryTree<T extends Comparable<T>> {
    protected BinaryTreeNode<T> root;

    public BinaryTree() {
        root = null;
    }

    public BinaryTree(T rootElement) {
        root = new BinaryTreeNode<>(rootElement);
    }

    public BinaryTreeNode<T> getRoot() {
        return root;
    }

    public void insert(T element) {
        root = insertRec(root, element);
    }

    private BinaryTreeNode<T> insertRec(BinaryTreeNode<T> node, T element) {
        if (node == null) {
            // TODO Exercise 1: Create a new node if the current node is null
           node = new BinaryTreeNode<>(element);
        }

        int cmp = element.compareTo(node.getElement());

        if (cmp < 0) {
            // TODO Exercise 2: Insert into the left subtree
            node.left = insertRec(node.left, element);
        } else if (cmp > 0) {
            // TODO Exercise 3: Insert into the right subtree
            node.right = insertRec(node.right, element);
        } else {
            // Duplicate: do nothing or handle as needed
            System.out.println("Duplicate value ignored: " + element);
        }

        return node;
    }

    public void inorder() {
        inorder(root);
        System.out.println();
    }

    private void inorder(BinaryTreeNode<T> node) {
        // TODO Exercise 4: Implement inorder traversal
        if(node != null) {
            inorder(node.getLeft());
            System.out.print(node.getElement() + " ");
            inorder(node.getRight());
        }

    }

    public void preorder() {
        preorder(root);
        System.out.println();
    }

    private void preorder(BinaryTreeNode<T> node) {
        // TODO Exercise 5: Implement preorder traversal
    }

    public void postorder() {
        postorder(root);
        System.out.println();
    }

    private void postorder(BinaryTreeNode<T> node) {
        // TODO Exercise 6: Implement postorder traversal
    }

    public void levelOrder() {
        printPretty(root, 0);
    }

    private void printPretty(BinaryTreeNode<T> node, int depth) {
        if (node == null) {
            return;
        }

        printPretty(node.getLeft(), depth + 1);

        for (int i = 0; i < depth; i++) {
            System.out.print("    "); // 4 spaces per level
        }

        System.out.println(node.getElement());
        printPretty(node.getRight(), depth + 1);
    }
}
