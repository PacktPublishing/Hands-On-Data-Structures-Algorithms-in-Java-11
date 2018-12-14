import java.lang.*;
import java.time.*;
import java.util.Stack;
import java.util.ListIterator;

public class StackSorter {

    // Driver method
    public static void main(String[] args)
    {
        // Save current date-time in UTC
        Instant start = Instant.now();

        Stack<Integer> jerseyNumbers = new Stack<>();
        jerseyNumbers.push(32);
        jerseyNumbers.push(24);
        jerseyNumbers.push(8);
        jerseyNumbers.push(44);
        jerseyNumbers.push(33);
        jerseyNumbers.push(34);
        jerseyNumbers.push(13);
        jerseyNumbers.push(22);
        jerseyNumbers.push(42);
        jerseyNumbers.push(52);


        System.out.print("\nOriginal Order: " + jerseyNumbers);

        sortMyStack(jerseyNumbers);

        System.out.print("\nSorted Order  : " + jerseyNumbers);

        System.out.print("\nTop to Bottom : ");
        printTopToBottom(jerseyNumbers);

        // Save current date-time in UTC
        Instant end = Instant.now();
        System.out.println("\n\nTime elapsed: " + Duration.between(start, end).toMillis() + " milliseconds.");
    }

    static void placeInSortedStack(Stack<Integer> theStack, int tempJersey)
    {
        // check for empty stack or if tempJersey < top element
        if (theStack.isEmpty() || tempJersey < theStack.peek())
        {
            theStack.push(tempJersey);
            return;
        }

        // recursion if tempJersey > top element
        int tempElement = theStack.pop();
        placeInSortedStack(theStack, tempJersey);

        // replace tempElement
        theStack.push(tempElement);
    }

    static void sortMyStack(Stack<Integer> theStack)
    {
        if (!theStack.isEmpty())
        {
            int tempJersey = theStack.pop(); // pop the top
            sortMyStack(theStack); // recursion: sort
            placeInSortedStack(theStack, tempJersey); // put top element back
        }
    }

    static void printTopToBottom(Stack<Integer> theStack)
    {
        ListIterator<Integer> myIterator = theStack.listIterator();

        // shift forward
        while(myIterator.hasNext())
            myIterator.next();

        // print top-to-bottom
        while(myIterator.hasPrevious())
            System.out.print(myIterator.previous() + " ");
    }
}
