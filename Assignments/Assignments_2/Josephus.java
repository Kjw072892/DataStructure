package Assignments.Assignments_2;

public class Josephus {

    public static void josephsProblem(final int numOfPeople, final int stepSize){

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

            nextPerson = circleOfPeople.dequeue();
            circleOfPeople.enqueue(nextPerson);
            counter++;
        }

        // Sets the final person in the queue as the lucky person
        luckyPerson = circleOfPeople.dequeue();

        System.out.println("soldier " + luckyPerson);

    }

    public static void main(String[] args) {
       josephsProblem(25,5);
    }
}
