public class StringDemo {
    public static void main( String [ ] args) {
        String str1 = "My first string";
        String str2 = ("My second string");
        String str3 = new String ("My last string"); // this is redundant

        // Concatenation
        String str4 = str1 + "\n" + str2 + "\n" + str3;

        System.out.println(str4);

    }
}
