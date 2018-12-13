import java.lang.*;
import java.time.*;

public class Sequential<Key, Value> {
    public static void main(String[] args) {

        // Save current date-time in UTC
        Instant start = Instant.now();

        // Create Linked List with four nodes
        LinkedList registry = new LinkedList();
        registry.appendList("noah@fake.edu", "ffhd@#499");
        registry.appendList("l.arnez@fake.edu", "bdqq$887uth");
        registry.appendList("p.johnston3@fake.edu", "batheMain");
        registry.appendList("kyle.kooner@fake.edu", "rget33hemf8");

        // Sequential Search
        String inUserID = "l.arnez@fake.edu";
        String inPassword = "bdqq$887uth";
        Boolean found = false;
        Node currentNode = registry.head;
        searchRoutine:
        while (currentNode != null) {
            if ((currentNode.userID.equals(inUserID)) &&
                    (currentNode.password.equals(inPassword))) {
                System.out.println("UserID and password verified!");
                found = true;
                break searchRoutine;
            }
            else {
                currentNode = currentNode.next;
            }
        }
        if (!found) {
            System.out.println("No record found matching that UserID/password pair.");
        }

        System.out.println();

        // Save current date-time in UTC
        Instant end = Instant.now();
        System.out.println("Time elapsed: " + Duration.between(start, end).toMillis() + " milliseconds.");
    }

    static class Node{
        Node next;
        String userID;
        String password;

        // constructor
        Node(String userID, String password) {
            this.userID = userID;
            this.password = password;
        }
    }

    static class LinkedList {
        Node head;

        public void appendList(String userID, String password) {
            if (head == null) {
                head = new Node(userID, password);
                return;
            }
            Node currNode = head;
            while (currNode.next != null) {
                currNode = currNode.next;
            }
            currNode.next = new Node(userID, password);
        }
    }
}