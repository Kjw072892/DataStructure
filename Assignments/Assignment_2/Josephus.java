package Assignments.Assignment_2;

/**
 * Course: Data Structure
 * Instructor: Dongfang Zhao
 * Assignment Name: LinkedList based queue
 * Due Date: 04/29/2025
 *
 * @author Kassie Whitney
 * @version 4/28/2025
 */
public class Josephus {

    /**
     * Solves the Josephus Problem.
     *
     * @param numOfPeople the number of people in a circle.
     * @param stepSize the number of steps taken before a person gets eliminated.
     */
    public static void josephusProblem(final int numOfPeople, final int stepSize){

        //Creates an empty queue
        LinkedListQueue<Integer> circleOfPeople = new LinkedListQueue<>();
        int luckyPerson;
        int counter = 1;

        //Problem setup, fills the queue with a number of people
        for(int i = 1; i <= numOfPeople; i++) {
            circleOfPeople.enqueue(i);
        }

        //Iterates sends the top of the queue to the back of the queue until the step size is
        // reached. Removes the person at the designated step size.
        while(circleOfPeople.size() > 1) {
            int nextPerson;

            if(counter == stepSize) {
                counter = 1;
                int theSoldier = circleOfPeople.dequeue();
                System.out.println("soldier " + theSoldier);
            }

            //Sets the person in the front of the queue to the back of the queue.
            nextPerson = circleOfPeople.dequeue();
            circleOfPeople.enqueue(nextPerson);
            counter++;
        }

        // Sets the final person in the queue as the lucky person (the last person standing).
        luckyPerson = circleOfPeople.dequeue();

        System.out.println("soldier " + luckyPerson);

    }

    public static void main(String[] args) {
       josephusProblem(25,5);
    }
}
