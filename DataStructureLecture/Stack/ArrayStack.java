package DataStructureLecture.Stack;

import DataStructureLecture.Exception.EmptyCollectionException;
import java.util.Arrays;
import java.util.EmptyStackException;

/**
* An array implementation of a stack in which the bottom of the
* stack is fixed at index 0.
*
* @author Lewis and Chase
* @version 4.0
*/
public class ArrayStack<T> implements StackADT<T> {
    private final static int DEFAULT_CAPACITY = 100;
    private int top;
    private T[] stack;
    private T obj;

    /**
     * Creates an empty stack using the default capacity.
     */
    public ArrayStack() {
        this(DEFAULT_CAPACITY);

    }

    /**
     * Creates an empty stack using the specified capacity.
     *
     * @param initialCapacity the initial size of the array
     */
    public ArrayStack(int initialCapacity) {
        top = 0;
        stack = (T[]) (new Object[initialCapacity]);
    }

    /**
     * Adds the specified element to the top of this stack, expanding
     * the capacity of the array if necessary.
     *
     * @param element generic element to be pushed onto stack
     */
    public void push(T element) {
        if (size() == stack.length)
            expandCapacity();
        stack[top] = element;
        top++;
        obj = element;
        System.out.println("Pushing: " + element);

    }

    /**
     * Creates a new array to store the contents of this stack with
     * twice the capacity of the old one.
     */
    private void expandCapacity() {
        stack = Arrays.copyOf(stack, stack.length * 2);
    }

    /**
     * Removes the element at the top of this stack and returns a
     * reference to it.
     *
     * @return element removed from top of stack
     * @throws EmptyStackException if stack is empty
     */
    @Override
    public T pop() {
        if (isEmpty())
            throw new EmptyCollectionException("Stack");
        top--;
        T result = stack[top];
        stack[top] = null;
        System.out.println("Popped: " + obj);
        obj = stack[top - 1];
        return result;
    }

    /**
     * Returns a reference to the element at the top of this stack.
     * The element is not removed from the stack.
     *
     * @return element on top of stack
     * @throws EmptyStackException if stack is empty
     */
    @Override
    public T peek() {
        if (isEmpty())
            throw new EmptyCollectionException("stack");
        return stack[top - 1];
    }

    /**
     * Returns true if this stack is empty and false otherwise.
     *
     * @return true if this stack is empty
     */
    @Override
    public boolean isEmpty() {
        return top == 0;
    }

    /**
     * Returns the number of elements in this stack.
     *
     * @return the number of elements in the stack
     */
    @Override
    public int size() {
        System.out.println("Current stack size: " + top);
        return top;
    }

    /**
     * Returns a string representation of this stack.
     *
     * @return a string representation of the stack
     */
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("Stack: [");
        for (int i = top - 1; i >= 0; i--) {
            result.append(stack[i]);
            if (i != 0) {
                result.append(", ");
            }
        }
        result.append("]");
        return result.toString();
    }
}
