public class Multiple {

    public static void main(String[] args) {

        // Setting up and populating a 2D Array
        int[][] classGrades = {
                {4001, 78, 90, 100, 62},
                {4002, 65, 81, 92, 93},
                {4003, 88, 92, 74, 96},
                {4004, 99, 100, 100, 57},
                {4005, 83, 77, 85, 86}};
        int i, row, col;
        float avg;

        // Printing our 2D Array
        System.out.println("Stud\tMat\tSci\tCom\tLit");
        for (row = 0; row < classGrades.length; row++) {
            for (col = 0; col < classGrades.length; col++)
                System.out.print(classGrades[row][col] + "\t");
            System.out.println();
        }
        System.out.println();


        // calculating an average for a specific student (ID = 4003)
        row = 2;
        System.out.print("Average grade for Student ID " + classGrades[2][0] + " is ");
        avg = 0;
        for (col=1; col < classGrades.length; col++) {
            avg = avg + classGrades[row][col];
        }
        System.out.println((avg / (classGrades.length -1)));


        // calculating an average for a specific subject (Math)
        col = 1;
        System.out.print("Average grade for Math is (all students) ");
        avg = 0;
        for (row=0; row < classGrades.length; row++) {
            avg = avg + classGrades[row][col];
        }
        System.out.println((avg / (classGrades.length)));



        // Calculate all Student Averages
        float[] tAvg = new float[classGrades.length]; // new array to hold averages
        for (row = 0; row < classGrades.length; row++) {
            avg = 0;
            for (col = 1; col < classGrades.length; col++) {
                avg = avg + classGrades[row][col];
            }
            avg = avg / (classGrades.length-1);
            tAvg[row] = avg;
        }

        // Print Table & all Student Averages
        System.out.println("\nStud\tMat\tSci\tCom\tLit\tAVG");
        for (row = 0; row < classGrades.length; row++) {
            for (col = 0; col < classGrades.length; col++)
                System.out.print(classGrades[row][col] + "\t");
            System.out.print(tAvg[row]);
            System.out.println();
        }
    }
}
