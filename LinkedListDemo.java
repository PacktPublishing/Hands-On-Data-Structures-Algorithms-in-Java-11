import java.lang.*;
import java.time.*;

public class LinkedListDemo {

    public static void main(String[] args) {

        // Save current date-time in UTC
        Instant start = Instant.now();

        // Create Linked List with four nodes
        LinkedList studentList = new LinkedList();
        studentList.appendList("Sebastian");
        studentList.appendList("Lucy");
        studentList.appendList("Pat");
        studentList.appendList("Kyle");

        /*
             -------------   --------   -------   --------
             | Sebastian |-->| Lucy |-->| Pat |-->| Kyle |
             -------------   --------   -------   --------
         */
        // Determining two seats away
        System.out.println();
        System.out.println(studentList.head.next.next.name +
                " sits two seats to the right of " +
                studentList.head.name + ".");

        // Save current date-time in UTC
        Instant end = Instant.now();
        System.out.println("Time elapsed: " + Duration.between(start, end).toMillis() + " milliseconds.");
    }

    static class Node{
        Node next;
        String name;

        // constructor
        Node(String name) {
            this.name = name;
        }
    }

    static class LinkedList {
        Node head;

        public void appendList(String name) {
            if (head == null) {
                head = new Node(name);
                return;
            }
            Node currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = new Node(name);
        }
    }
}

