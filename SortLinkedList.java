import java.lang.*;
import java.time.*;
import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class SortLinkedList {

    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();
        // add 4 nodes
        linkedList.add(3);
        linkedList.add(19);
        linkedList.add(33);
        linkedList.add(2);
        // add 2 nodes at the first position
        linkedList.addFirst(30);
        linkedList.addFirst(52);
        // add a node at the midpoint
        midpointIterator( linkedList ).add( 1 );
        // add 2 nodes at the first position
        linkedList.addFirst(20);
        linkedList.addFirst(7);
        // append 4 nodes
        linkedList.add(5);
        linkedList.add(9);
        linkedList.add(16);
        linkedList.add(24);
        // add nodes at specific index positions (index, value)
        linkedList.add(3, 45);
        linkedList.add(10,44);
        // append 4 nodes
        linkedList.add(85);
        linkedList.add(8);
        linkedList.add(22);
        linkedList.add(37);
        // add a node at the midpoint
        midpointIterator( linkedList ).add( 66 );
        // add a node at the first position
        linkedList.addFirst(99);
        // append 3 nodes
        linkedList.add(12);
        linkedList.add(11);
        linkedList.add(76);

        // Save current date-time in UTC
        Instant start = Instant.now();


        System.out.println("\nOriginal :->  " + linkedList);
        Collections.sort(linkedList);
        System.out.println("Sorted   :->  " + linkedList);

        // Save current date-time in UTC
        Instant end = Instant.now();
        System.out.println("\nTime elapsed: " + Duration.between(start, end).toMillis() + " milliseconds.");

    }

    private static <E> ListIterator<E> midpointIterator(LinkedList<E> lList) {
        return lList.listIterator( lList.size() / 2 );




    }
}
