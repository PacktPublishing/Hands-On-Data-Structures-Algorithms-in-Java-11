import java.lang.*;
import java.time.*;

public class LinkedListDemo2 {

    public static void main(String[] args) {

        // Save current date-time in UTC
        Instant start = Instant.now();

        // Create Linked List with four nodes
        LinkedList studentList = new LinkedList();
        studentList.appendList("Noah");
        studentList.appendList("Lucy");
        studentList.appendList("Pete");
        studentList.appendList("Kyle");

        // Print all nodes
        System.out.print("Originals    :--> ");
        Node currentNode = studentList.head;
        while (currentNode != null) {
            System.out.print(currentNode.name + "\t");
            currentNode = currentNode.next;
        }
        System.out.println();

        // Deleting a specific node
        studentList.deleteBasedOnValue("Pete");

        // Print all nodes
        System.out.print("Without Pete :--> ");
        Node aNode = studentList.head;
        while (aNode != null) {
            System.out.print(aNode.name + "\t");
            aNode = aNode.next;
        }
        System.out.println();

        // Prepending a node
        studentList.prependList("Pete");

        // Print all nodes
        System.out.print("Pete is back :--> ");
        Node xNode = studentList.head;
        while (xNode != null) {
            System.out.print(xNode.name + "\t");
            xNode = xNode.next;
        }
        System.out.println();


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
            Node currNode = head;
            while (currNode.next != null) {
                currNode = currNode.next;
            }
            currNode.next = new Node(name);
        }

        public void prependList(String name) {
            Node newHeadNode = new Node(name);
            newHeadNode.next = head;
            head = newHeadNode;
        }

        public void deleteBasedOnValue (String name) {
            if (head == null) return;
            if (head.name == name) {
                head = head.next;
                return;
            }

            Node cNode = head;
            while (cNode.next != null) {
                if (cNode.next.name.equals(name)) {
                    cNode.next = cNode.next.next;
                    return;
                }
                cNode = cNode.next;
            }
        }
    }
}

