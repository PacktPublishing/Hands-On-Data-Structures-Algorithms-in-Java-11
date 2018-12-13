import java.lang.*;
import java.time.*;
import java.util.Arrays;

public class Merge {

    public static void main(String[] args) {

        int[] array1 = new int[]{8, 15, 32, 33, 53, 82, 99};
        int[] array2 = new int[]{12, 19, 24, 52, 76};
        int[] array3 = new int[12];
        int i = 0, j = 0, k = 0, x = 0;

        // Print original arrays
        System.out.println();
        System.out.print("Array 1: ");
        for (x = 0; x < array1.length; x++)
            System.out.print(array1[x] + "\t");
        //
        System.out.print("\nArray 2: ");
        for (x = 0; x < array2.length; x++)
            System.out.print(array2[x] + "\t");
        System.out.println();

        // Save current date-time in UTC
        Instant start = Instant.now();

        while(i < array1.length && j < array2.length) {
            if (array1[i] < array2[j])
                array3[k++] = array1[i++];
            else
                array3[k++] = array2[j++];

            while (i < array1.length)
                array3[k++] = array1[i++];

            while (j < array2.length)
                array3[k++] = array2[j++];

            // Print merged array
            Arrays.sort(array3); // sort new array
            System.out.print("Array 3: ");
            for (x = 0; x < array3.length; x++)
                System.out.print(array3[x] + "\t");
            System.out.println();

            // Save current date-time in UTC
            Instant end = Instant.now();
            System.out.println("Time elapsed: " + Duration.between(start, end).toMillis() + " milliseconds.");
        }
    }
}
