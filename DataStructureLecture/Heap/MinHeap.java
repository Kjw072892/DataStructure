package DataStructureLecture.Heap;

import java.util.Arrays;

public class MinHeap {
    private HeapNode root = null;
    private int size = 0;

    // Helper: find node at position `index` (0-based) in BFS order
    private HeapNode getNodeAt(int index) {
        String path = Integer.toBinaryString(index + 1).substring(1);
        HeapNode curr = root;
        for (char c : path.toCharArray()) {
            if (c == '0') {
                curr = curr.left;
            } else {
                curr = curr.right;

            }
        }
        return curr;
    }

    public void insert(int val) {
        HeapNode newNode = new HeapNode(val);

        if (size == 0) {
            root = newNode;
        } else {
            HeapNode parent = getNodeAt((size - 1) / 2);
            newNode.parent = parent;

            // TODO: attach new node as left or right child
            if (parent.left == null) {
                parent.left = newNode;
            } else {
                parent.right = newNode;
            }
        }



        size++;
        heapifyUp(newNode);
    }

    public int getMin() {
        if (root == null) throw new RuntimeException("Heap is empty");
        return root.value;
    }

    public int deleteMin() {
        if (size == 0) throw new RuntimeException("Heap is empty");
        int minVal = root.value;

        if (size == 1) {
            root = null;
        } else {
            HeapNode lastNode = getNodeAt(size - 1);

            // TODO: replace root value with last node value
            root.value = lastNode.value;

            // TODO: remove last node from tree
            if (lastNode.parent.right == lastNode) {
                lastNode.parent.right = null;
                minVal = lastNode.value;
            } else {
                lastNode.parent.left = null;
            }
        }

        size--;
        if (root != null) {
            heapifyDown(root);
        }
        return minVal;
    }

    private void heapifyUp(HeapNode node) {
        while (node.parent != null && node.value < node.parent.value) {

            // TODO: swap value with parent
            int temp = node.value;
            node.value = node.parent.value;
            node.parent.value = temp;
            node = node.parent;
        }
    }

    private void heapifyDown(HeapNode node) {

        while (true) {
            HeapNode smallest = node;

            // TODO: find the smallest among node, left, and right children
            if (node.left != null && node.left.value < smallest.value) {
                smallest = node.left;
            }

            if (node.right != null && node.right.value < smallest.value) {
                smallest = node.right;
            }

            if (smallest == node) {
                break;
            }

            // TODO: swap values with smallest child
            int temp = node.value;//the node;
            node.value = smallest.value;//the child;
            smallest.value = temp;
            node = smallest;
        }
    }

    // Optional: helper for debugging
    public void printHeap() {
        java.util.Queue<HeapNode> q = new java.util.LinkedList<>();
        double levelCounter = 1;
        int level = (int) Math.pow(2, levelCounter);
        q.add(root);

        while (!q.isEmpty()) {
            HeapNode curr = q.poll();
            System.out.print(curr.value + " ");
            if (curr.left != null) {
                q.add(curr.left);
            }
            if (curr.right != null) {
                q.add(curr.right);
            }
             levelCounter ++;
        }

        System.out.println();
    }
}
