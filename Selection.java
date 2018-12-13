import java.lang.*;
import java.time.*;

public class Selection {
    public static void main(String args[]) {
        // Save current date-time in UTC
        Instant start = Instant.now();

        // Implement Selection Sort

        int arrayToSort[] = {8755,1214,4436,8571,988,9387,3636,7081,8994,9642,4777,4417,1277,
                9606,9473,4544,3869,483,9721,6386,4534,5519,8584,8122,7158,2531,8506,
                2624,164,8873,9036,1527,2514,9265,1606,7019,4336,8700,3372,455,4991,
                4606,5597,4627,7337,6843,5619,4035,6173,3474,2493,2702,7287,4707,5974,
                9078,2263,7111,7729,6919,5763,2982,6562,1230,1642,9123,9095,4229,127,
                4421,8875,717,2153,6982,2920,5949,3186,3799,5017,3151,5264,6853,5691,
                2377,9769,4652,4338,2837,5244,426,6085,4535,6623,7625,5998,8077,5560,
                1578,4381,7897,6573,6327,1849,1618,3323,3587,2635,5583,8203,1236,3882,
                2016,5696,4648,4470,9449,859,293,4983,5869,3080,3431,2760,9245,9782,
                6505,8038,874,7585,3629,1846,5187,4281,7806,201,1965,63,5312,7240,5019,
                2123,7010,1507,3753,5281,9743,2667,5416,3664,2972,6433,747,4312,2236,
                7023,8178,1766,9684,3265,1058,7472,991,3291,1947,1700,3699,4000,4099};
        int i, j;
        int arrayLen = arrayToSort.length;

        // Sort Array using Selection Sort
        for (i = 0; i < arrayLen-1; i++) {
            int lowestValueIndex = i;
            for (j = i+1; j < arrayLen; j++)
                if (arrayToSort[j] < arrayToSort[lowestValueIndex])
                    lowestValueIndex = j;

            int tempIndex = arrayToSort[lowestValueIndex];
            arrayToSort[lowestValueIndex] = arrayToSort[i];
            arrayToSort[i] = tempIndex;
        }
        // Print for validation
        for (i=0; i<arrayLen; ++i)
            System.out.print(arrayToSort[i]+" ");
        System.out.println();

        // Save current date-time in UTC
        Instant end = Instant.now();
        System.out.println("Time elapsed: " + Duration.between(start, end).toMillis() + " milliseconds.");
    }
}
