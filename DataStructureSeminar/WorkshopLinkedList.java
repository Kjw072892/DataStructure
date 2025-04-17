package DataStructureSeminar;

public class WorkshopLinkedList<T> {

    private LinkedNode<T> top;
    private int count;

    public WorkshopLinkedList() {
        top = new LinkedNode<>();
        count++;
    }

    public void add(final T element) {
        LinkedNode<T> temp = new LinkedNode<T>(element);
        temp.setNext(top);
        top = temp;
        count++;
    }

    public static void main(String[] args) {
        WorkshopLinkedList<Integer> test = new WorkshopLinkedList<Integer>();

        test.add(4);


    }



}


