public class Single {

    public static void main(String[] args) {

        int classGrades [] = {67, 99, 32, 85};
        int i;

        // quick loop to print all array elements
        for (i = 0; i < classGrades.length; i++) {
            System.out.println(classGrades[i]);
        }

        // loop to average array elements
        float tSum = 0;
        for (i = 0; i < classGrades.length; i++) {
            tSum = tSum + classGrades[i];
        }
        System.out.println("Average grade is " + (tSum / classGrades.length));

        // Obtaining Min/Max values
        int min = 0;
        int max = 0;
        for (i = 1; i < classGrades.length; i++) {
            if (classGrades[i] < classGrades[min])
                min = i;
        }
        for (i = 1; i < classGrades.length; i++) {
            if (classGrades[i] > classGrades[max])
                max = i;
        }
        System.out.println("Low: " + classGrades[min] + "\nHigh: " + classGrades[max]);
    }

}
