package Assignments.Assignment_4;


public class ConvertSortedListToBST<T extends Comparable<T>> {
    private ListNode<T> current;

    public TreeNode<T> sortedListToBST(ListNode<T> head) {
        int size = getSize(head);
        current = head;
        return convert(0, size - 1);
    }

    private  int getSize(ListNode<T> head) {
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        return count;
    }

   private TreeNode<T> convert(int left, int right) {
    if (left > right){
        return null;
    }

    int mid = Math.ceilDiv((left + right), 2);

    TreeNode<T> leftChild = convert(left, mid - 1);

    TreeNode<T> root = new TreeNode<>(current.val);
    current = current.next;

    root.left = leftChild;
    root.right = convert(mid + 1, right);

    return root;
    }
}
