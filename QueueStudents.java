import java.lang.*;
import java.time.*;

public class QueueStudents {

    public static void main(String args[]) {

        // Save current date-time in UTC
        Instant start = Instant.now();

        QueueStudentIDs studentsInLine = new QueueStudentIDs(8);
        studentsInLine.insertStudent(885475); // first-in
        studentsInLine.insertStudent(290451);
        studentsInLine.insertStudent(500324);
        studentsInLine.insertStudent(769012);
        studentsInLine.insertStudent(489926);
        studentsInLine.insertStudent(319319);
        studentsInLine.insertStudent(652432);
        studentsInLine.insertStudent(824323); // last-in

        // [1] output number in queue
        System.out.println("\n[1] There are " + studentsInLine.size() +
                " students in queue.");
        // [2] output value of top element
        System.out.println("[2] First Student in queue: "
                + studentsInLine.peekAtFirstStudent() + " (top of stack)");
        // [3] serve next student -- FIFO
        System.out.println("[3] Now Serving: " + studentsInLine.serveNextStudent() +
                " (removed from queue)");
        // [4] output number in queue
        System.out.println("[4] There are " + studentsInLine.size() +
                " students in queue.");

        // [5] output stack
        System.out.print("[5] Students Left in queue: ");
        while (!studentsInLine.isEmpty() ) {
            long value = studentsInLine.serveNextStudent();
            System.out.print(value);
            System.out.print("\t");
        }
        System.out.println();

        // [6] output number in queue
        System.out.println("[6] There are " + studentsInLine.size() +
                " students in queue.");

        // Save current date-time in UTC
        Instant end = Instant.now();
        System.out.println("\nTime elapsed: " + Duration.between(start, end).toMillis() + " milliseconds.");
    }

    static class QueueStudentIDs {
        private int maximumSize;
        private long[] queueArray;
        private int frontStudent;
        private int rearStudent;
        private int numberOfStudents;

    // constructor
        public QueueStudentIDs(int size) {
            maximumSize = size;
            queueArray = new long[maximumSize];
            frontStudent = 0;
            rearStudent = -1;
            numberOfStudents = 0;
        }

        public void insertStudent(long studentToInsert) {
            if(rearStudent == maximumSize-1) {
                rearStudent = -1;
            }
            queueArray[++rearStudent] = studentToInsert;
            numberOfStudents++;
        }

        public long serveNextStudent() {
            long tStudent = queueArray[frontStudent++];
            if(frontStudent == maximumSize) {
                frontStudent = 0;
            }
            numberOfStudents--;
            return tStudent;
        }

        public long lastStudent() {
            long tStudent = queueArray[frontStudent++];
            if(frontStudent == maximumSize) {
                frontStudent = 0;
            }
            numberOfStudents--;
            return tStudent;
        }

        public long peekAtFirstStudent() {
            return queueArray[frontStudent];
        }

        public boolean isEmpty() {
            return (numberOfStudents == 0);
        }

        public boolean isFull() {
            return (numberOfStudents==maximumSize);
        }

        public int size() {
            return numberOfStudents;
        }
    }
}
