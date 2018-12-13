import java.lang.*;
import java.time.*;

public class StackCars {
    public static void main(String args[]) {
        // Save current date-time in UTC
        Instant start = Instant.now();

        MyCarStack myCars = new MyCarStack(6);
        myCars.push(3);
        myCars.push(5);
        myCars.push(17);
        myCars.push(2);
        myCars.push(24);
        myCars.push(9);

        // output value of top element
        System.out.println("\nTop of Stack: " + myCars.peek());

        // output stack
        while (!myCars.isEmpty() ) {
            long value = myCars.pop();
            System.out.print(value);
            System.out.print("\t");
        }
        System.out.println();

        // output value of top element or provide 'empty' indication
        if (myCars.isEmpty()) { System.out.println("Stack is empty."); }
        else { System.out.println("Top of Stack: " + myCars.peek()); }

        // Save current date-time in UTC
        Instant end = Instant.now();
        System.out.println("\nTime elapsed: " + Duration.between(start, end).toMillis() + " milliseconds.");
    }

    static class MyCarStack {
        private int maxSize;
        private long[] theStackArray;
        private int top;

        // constructor
        public MyCarStack(int s) {
            maxSize = s;
            theStackArray = new long[maxSize];
            top = -1;
        }

        public void push(long j) { theStackArray[++top] = j; }

        public long pop() { return theStackArray[top --]; }

        public long peek() { return theStackArray[top]; }

        public boolean isEmpty() { return (top == -1); }

        public boolean isFull() { return (top == maxSize-1); }
    }
}

