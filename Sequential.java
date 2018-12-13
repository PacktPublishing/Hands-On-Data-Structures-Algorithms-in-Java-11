import java.lang.*;
import java.time.*;
import java.util.Random;

public class Sequential {

    public static void main(String[] args) {

        // 500 unsorted unique numbers ranging from 30000 to 90000
        int studentID[] = {58825, 70852, 79613, 75742, 85755, 88023, 45724, 75766, 86801,
                58842, 79225, 48574, 63887, 44486, 66645, 49590, 69973, 47661, 76746,
                45713, 66550, 37602, 52663, 62652, 47588, 53308, 88803, 34250, 44505,
                71252, 38452, 50602, 30601, 68956, 87138, 55060, 33613, 75586, 42988,
                70822, 76000, 69887, 60800, 46317, 55759, 84594, 41607, 80432, 58600,
                46031, 82755, 57866, 32931, 37915, 41897, 80285, 44346, 73496, 61550,
                86242, 83116, 37623, 56766, 72344, 38804, 50652, 71121, 38531, 63908,
                69444, 42907, 56813, 54912, 65248, 86926, 44343, 77399, 52512, 32182,
                54976, 64674, 62332, 40676, 43485, 43194, 41620, 44774, 73852, 34335,
                89033, 80709, 32072, 82967, 40178, 31287, 38283, 74677, 79829, 53681,
                60996, 49704, 32506, 82983, 35800, 77963, 35941, 67381, 80514, 60048,
                69980, 34136, 53563, 52474, 34483, 44974, 81420, 50651, 48623, 59482,
                72000, 33574, 55405, 80883, 33776, 54388, 78070, 80939, 73947, 38788,
                75727, 67796, 50627, 42699, 59752, 85581, 86428, 82212, 48036, 48771,
                38374, 40345, 76647, 62362, 31128, 30483, 82997, 53374, 83467, 76755,
                39221, 41707, 46704, 43757, 50127, 75721, 31026, 70922, 31617, 39344,
                32304, 63950, 61659, 36952, 39312, 41671, 63111, 85838, 81551, 68923,
                64420, 88746, 61091, 47030, 50411, 34559, 43309, 50325, 85811, 83725,
                54644, 72582, 59755, 42411, 62702, 70106, 32711, 37660, 57205, 46355,
                75107, 30654, 86624, 60077, 40616, 71759, 64005, 59294, 70622, 41683,
                70970, 82399, 82605, 75987, 82335, 33549, 45854, 83244, 65806, 36122,
                61442, 39153, 63981, 74691, 54410, 71856, 41904, 64556, 73294, 39292,
                65373, 76303, 49674, 47418, 85028, 32127, 80863, 44669, 50986, 73626,
                75263, 47024, 47222, 71623, 64591, 42099, 77180, 53493, 47781, 85506,
                52025, 38546, 72366, 84112, 31962, 39513, 77517, 56006, 34990, 37650,
                69635, 60474, 79922, 58946, 84810, 65406, 54508, 53619, 75113, 84202,
                38938, 60572, 39349, 60242, 50777, 43126, 83433, 75972, 65035, 50114,
                75675, 61885, 33894, 37297, 88833, 51809, 74752, 34972, 88599, 68034,
                68125, 65047, 80423, 34328, 39082, 38841, 67730, 51024, 76724, 73724,
                63050, 75953, 48196, 86097, 35243, 56891, 30746, 80575, 76730, 80153,
                57107, 55181, 73762, 60692, 39596, 44254, 68911, 89821, 48836, 80737,
                70777, 81937, 64721, 84787, 66561, 42372, 47710, 61148, 45439, 80853,
                36850, 67085, 89923, 45264, 71961, 88301, 61311, 57916, 75777, 53223,
                86922, 78393, 31018, 52524, 77949, 63903, 67245, 59469, 78655, 32802,
                77669, 36468, 31748, 45335, 32607, 65888, 79865, 59176, 66983, 68944,
                70532, 61815, 75897, 62769, 78485, 40723, 58288, 44923, 73566, 43538,
                73921, 70386, 35621, 71864, 33446, 31530, 56844, 62772, 38039, 37416,
                63036, 60916, 62807, 44738, 73309, 56344, 79697, 81902, 50218, 73302,
                74176, 45771, 66756, 66796, 56406, 80977, 52777, 72491, 43100, 75204,
                47245, 77819, 35850, 85315, 81373, 86691, 65939, 79355, 39634, 70843,
                76532, 35129, 85308, 44332, 35289, 59313, 68287, 33142, 65940, 47483,
                55138, 79771, 54096, 53019, 72307, 89160, 79241, 88656, 33500, 46214,
                72185, 43883, 75117, 46569, 89903, 54141, 73117, 50260, 64681, 48813,
                66045, 59537, 55113, 73719, 76681, 59340, 52700, 41681, 42413, 84861,
                84007, 66304, 65318, 41567, 65278, 50234, 49579, 80789, 57612, 39436,
                37861, 69174, 67769, 73337, 85388, 40250, 56010, 87764, 32941, 60333,
                50084, 75653, 79801, 36421, 54533, 69137, 49198, 38735, 68840, 65427,
                39621, 35093, 86035, 77970, 70746, 30228, 35589, 88912, 65789, 30496,
                31373, 47345, 38921, 73344, 74421, 84282, 86512, 70045, 80502, 76290,
                81926, 30106, 38560, 40167, 44305, 35779, 68236, 42594, 74052, 31062,
                61637};

        int[] selectedStudents = new int[3];
        int i;

        // Save current date-time in UTC
        Instant start = Instant.now();

        // Randomly select 3 students (index position)
        Random randomIndex = new Random();
        for (i = 0; i < 3; i++)
            selectedStudents[i] = randomIndex.nextInt(studentID.length) + 1;

        // Print selected students
        System.out.println("\nRandomly Selected Students");
        System.out.println("Index\tStudent ID");
        for (i = 0; i < 3; i++)
            System.out.println(selectedStudents[i] + "\t\t" + studentID[selectedStudents[i]]);

        // Save current date-time in UTC
        Instant end = Instant.now();
        System.out.println("Time elapsed: " + Duration.between(start, end).toMillis() + " milliseconds.");
    }
}
