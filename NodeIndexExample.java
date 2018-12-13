import java.lang.*;
import java.time.*;

public class NodeIndexExample {

    public static void main(String[] args) {

        LinkedList directoryList = new LinkedList();

        directoryList.appendList("Neo");
        directoryList.appendList("Trinity");
        directoryList.appendList("Morpheus");
        directoryList.appendList("The Oracle");
        directoryList.appendList("Cypher");
        directoryList.appendList("Spoon Boy");
        directoryList.appendList("Agent Smith");
        directoryList.appendList("Dozer");
        directoryList.appendList("Woman in Red");
        directoryList.appendList("Tank");

        // Save current date-time in UTC
        Instant start = Instant.now();

        // Find index of Spoon Boy
        System.out.println("Spoon Boy is located at index " + directoryList.indexOf("Spoon Boy"));

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

        public int indexOf(String characterName) {
            Node cNode = head;
            int cIndex = 0;
            while (cNode.next != null) {
                if (cNode.name.equals(characterName)) {
                    return cIndex;
                } else {
                    cNode = cNode.next;
                    cIndex += 1;
                }
            }
            return -1;
        }
    }
}
