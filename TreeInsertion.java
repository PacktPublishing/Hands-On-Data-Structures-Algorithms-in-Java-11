import java.time.*;

public class TreeInsertion {

    TreeNode root;

    public static void main(String[] args) {

        // Save current date-time in UTC
        Instant start = Instant.now();

        TreeInsertion myTree = new TreeInsertion();
        myTree.insertNode(5);   myTree.insertNode(1);
        myTree.insertNode(2);   myTree.insertNode(9);
        myTree.insertNode(13);  myTree.insertNode(12);
        myTree.insertNode(3);   myTree.insertNode(8);

        System.out.println();
        myTree.printInOrder();

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

    void insertNode(int nodeValue) {
        root = insertNodeRecursion(root, nodeValue);
    }

    TreeNode insertNodeRecursion(TreeNode root, int newValue) {
        if (root == null) {
            root = new TreeNode(newValue);
            return root;
        }

        if (newValue < root.nodeValue)
            root.left = insertNodeRecursion(root.left, newValue);
        else if (newValue > root.nodeValue)
            root.right = insertNodeRecursion(root.right, newValue);

        return root;
    }

    void printInOrder() { printInOrderRecursion(root);}

    void printInOrderRecursion(TreeNode root) {
        if (root != null) {
            printInOrderRecursion(root.left);
            System.out.print(root.nodeValue + "\t");
            printInOrderRecursion(root.right);
        }
    }
}
