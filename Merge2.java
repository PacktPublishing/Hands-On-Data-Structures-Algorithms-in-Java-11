import java.lang.*;
import java.time.*;

public class Merge2 {

    public static void main(String[] args) {

        // Initializers
        int theArray[] = {19, 82, 3, 8, 65, 22, 17, 78, 12, 32, 33, 24};

        //Print original array
        System.out.print("Before: ");
        for (int i=0; i < theArray.length; i++)
            System.out.print(theArray[i] + "\t");

        // Save current date-time in UTC
        Instant start = Instant.now();

        // Driver method to call Merge2.sort
        Merge2 theObject = new Merge2();
        theObject.sort(theArray, 0, theArray.length-1);

        // Print array after Merge Sort is completed
        System.out.println();
        System.out.print("After : ");
        for (int i=0; i < theArray.length; i++)
            System.out.print(theArray[i] + "\t");
        System.out.println();

        // Save current date-time in UTC
        Instant end = Instant.now();
        System.out.println("Time elapsed: " + Duration.between(start, end).toMillis() + " milliseconds.");

    }

    void mergeIt(int tArray[], int leftHalf, int aLen, int rightHalf) {
        // determine subset sizes
        int nbr1 = aLen - leftHalf + 1;
        int nbr2 = rightHalf - aLen;

        // temp arrays
        int left[] = new int [nbr1];
        int right[] = new int [nbr2];

        // populate arrays
        for (int i=0; i<nbr1; ++i)
            left[i] = tArray[leftHalf + i];
        for (int j=0; j<nbr2; ++j)
            right[j] = tArray[aLen + 1+ j];

        // merge temp arrays
        int i = 0, j = 0;
        int k = leftHalf;
        while (i < nbr1 && j < nbr2) {
            if (left[i] <= right[j]) {
                tArray[k] = left[i];
                i++;
            }
            else {
                tArray[k] = right[j];
                j++;
            }
            k++;
        }

        // copy elements of left[] if any remain /
        while (i < nbr1) {
            tArray[k] = left[i];
            i++;
            k++;
        }

        // copy elements of right[] if any remain /
        while (j < nbr2) {
            tArray[k] = right[j];
            j++;
            k++;
        }
    }

    // sort function using mergeIt()
    void sort(int tArray[], int left, int right)
    {
        if (left < right)
        {
            int middle = (left+right)/2;

            // sort both halves
            sort(tArray, left, middle);
            sort(tArray , middle+1, right);

            // merge sorted halves
            mergeIt(tArray, left, middle, right);
        }
    }
}
