import java.time.*;

public class TreeDemo {

    TreeNode root;

    public static void main(String[] args) {

        // Save current date-time in UTC
        Instant start = Instant.now();

        TreeDemo myTree = new TreeDemo();     // Create tree
        myTree.root = new TreeNode(5);        // Create root
        myTree.root.left = new TreeNode(3);   // Create 1st child
        myTree.root.right = new TreeNode(8);  // Create 2nd child

        // Save current date-time in UTC
        Instant end = Instant.now();
        System.out.println("\nTime elapsed: " + Duration.between(start, end).toMillis() + " milliseconds.");
    }

    static class TreeNode {
        int nodeValue;
        TreeNode left;
        TreeNode right;

        public TreeNode(int nodeValue) {
            this.nodeValue = nodeValue;
            right = null;
            left = null;
        }
    }
}
