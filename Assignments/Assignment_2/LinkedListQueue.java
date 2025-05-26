package Assignments.Assignment_2;

import DataStructureLecture.ArrayList.EmptyCollectionException;

/**
 * Course: Data Structure
 * Instructor: Dongfang Zhao
 * Assignment Name: LinkedList based queue
 * Due Date: 04/29/2025
 *
 * @author Kassie Whitney
 * @version 4/28/2025
 * @param <T> any primitive or class object type.
 */
public class LinkedListQueue<T> implements QueueADT<T>  {
    /**
     * Points to the current HEAD node
     */
    private LinearNode<T> HEAD_POINTER;

    /**
     * Points to the current TAIL node
     */
    private LinearNode<T> TAIL_POINTER;

    /**
     * Designates the current size of the queue. Counts the number of elements in the queue.
     */
    private int counter;

    /**
     * Constructs an empty queue;
     */
    public LinkedListQueue() {
        HEAD_POINTER = null;
        TAIL_POINTER = null;
        counter = 0;
    }

    @Override
    public void enqueue(T element) {
       LinearNode<T> node = new LinearNode<>(element);
        if(isEmpty()) {
            HEAD_POINTER = node;

        } else {
            TAIL_POINTER.setNext(node);

        }
        TAIL_POINTER = node;
        counter++;
    }

    @Override
    public T dequeue() {
        T result;
        if(isEmpty()) {
            throw new EmptyCollectionException("Queue");
        } else {
            result = HEAD_POINTER.getElement();
            HEAD_POINTER = HEAD_POINTER.getNext();
        }
        counter--;
        return result;
    }

    @Override
    public T first() {
        return HEAD_POINTER.getElement();
    }

    @Override
    public boolean isEmpty() {
        return counter == 0;
    }

    @Override
    public int size() {
        return counter;
    }


   @Override
    public String toString(){
       return "[Head: " + first() +" , Tail: " + TAIL_POINTER.getElement() + "]";
   }

}
