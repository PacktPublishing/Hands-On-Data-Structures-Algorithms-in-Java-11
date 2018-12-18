import java.lang.*;
import java.time.*;
import java.util.Iterator;
import java.util.LinkedList;

class TraverseDemo2 {
    private int Vertex; // 0 through 8
    private LinkedList<Integer> adjacencyList[];

    // Constructor
    TraverseDemo2(int vertex) {
        Vertex = vertex;
        adjacencyList = new LinkedList[vertex];
        for (int i = 0; i < vertex; ++i)
            adjacencyList[i] = new LinkedList();
    }

    // add edge
    void addEdge(int start, int end) {
        adjacencyList[start].add(end);
    }

    // DepthFirstSearch Helper Method
    void DFSHelper(int v, boolean visited[]) {
        // Current vertex = visited && output
        visited[v] = true;
        System.out.print(v + " ");

        // Call recursively (all adjacent vertices)
        Iterator<Integer> i = adjacencyList[v].listIterator();
        while (i.hasNext()) {
            int n = i.next();
            if (!visited[n])
                DFSHelper(n, visited);
        }
    }

    // Conduct traversal (uses Helper method)
    void DepthFirstSearch(int v) {
        // set vertices to not visited
        boolean visited[] = new boolean[Vertex];

        // Call helper for output
        DFSHelper(v, visited);
    }

    public static void main(String args[])
    {
        // Save current date-time in UTC
        Instant start = Instant.now();

        TraverseDemo2 myGraph = new TraverseDemo2(9);

        myGraph.addEdge(0, 3);
        myGraph.addEdge(0, 4);
        myGraph.addEdge(0, 7);
        myGraph.addEdge(1, 2);
        myGraph.addEdge(1, 3);
        myGraph.addEdge(1, 5);
        myGraph.addEdge(1, 8);
        myGraph.addEdge(5, 2);
        myGraph.addEdge(6, 7);
        myGraph.addEdge(6, 8);
        myGraph.addEdge(6, 0);

        System.out.print("\nDFS Traversal starting from 1: ");
        myGraph.DepthFirstSearch(1);
        System.out.print("\nDFS Traversal starting from 6: ");
        myGraph.DepthFirstSearch(6);

        // Save current date-time in UTC
        Instant end = Instant.now();
        System.out.println("\n\nTime elapsed: " + Duration.between(start, end).toMillis() + " milliseconds.");

    }
}