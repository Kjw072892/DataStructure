package DataStructureLecture.Stack;

public class Main {
    public static void main(String[] args) {
//        ArrayStack<Integer> myStack = new ArrayStack<>();
//
//        myStack.push(1);
//        myStack.push(3);
//        myStack.push(5);
//
//        System.out.println(myStack.size());
//
//        System.out.println(myStack);
//        myStack.pop();
//        myStack.size();
//        System.out.println(myStack);
//        myStack.pop();
//        myStack.size();
//        System.out.println(myStack);

        LinkedStack<Integer> myLinkedStack = new LinkedStack<>();

        myLinkedStack.push(1);
        myLinkedStack.push(3);
        myLinkedStack.push(5);

        System.out.println(myLinkedStack);
        myLinkedStack.pop();
        System.out.println(myLinkedStack);





    }
}
