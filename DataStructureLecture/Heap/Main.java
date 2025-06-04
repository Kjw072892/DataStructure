package DataStructureLecture.Heap;


import java.util.Arrays;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        MinHeap heap = new MinHeap();
        heap.insert(5);
        heap.insert(3);
        heap.insert(8);
        heap.insert(1);
        heap.insert(2);

        heap.printHeap();               // e.g., 1 2 8 5 3 (level-order)

        heap.insert(4);

        heap.insert(10);

        heap.insert(9);

        heap.insert(6);

        heap.insert(23);
        heap.insert(47);
        heap.insert(147);
        heap.insert(7);

        StringBuilder orderedHeap = new StringBuilder();
        while(true){
            try{
                orderedHeap.append(heap.getMin()).append(" ");
                heap.deleteMin();

            } catch(RuntimeException rte) {
                break;
            }
        }

        System.out.println(orderedHeap);

        int[] arr = {9,3,7,10,20,11,87,90,32,5};
        arr = Arrays.stream(arr).sorted().toArray();
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
