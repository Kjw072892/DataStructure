package DataStructureSeminar;

public class LinkedNode<T> {
    LinkedNode<T> next;
    T element = null;

    public LinkedNode() {
        next = null;
    }
    public LinkedNode(final T element){
        this();
        this.element = element;
    }
    public T getNext() {
        System.out.println("test");
        return next.element;
    }

    public void setNext(final LinkedNode<T> newLinkedNode) {
        next = newLinkedNode;

    }

    private void setElement(final T element) {
        this.element = element;
    }

    private T getElement() {
        return element;
    }

}
