import java.lang.*;
import java.time.*;
import java.util.Iterator;
import java.util.LinkedList;

class TraverseDemo
{
    private int Vertex; // 0 through 8
    private LinkedList<Integer> adjacencyList[];

    // Constructor
    TraverseDemo(int vertex)
    {
        Vertex = vertex;
        adjacencyList = new LinkedList[vertex];
        for (int i=0; i<vertex; ++i)
            adjacencyList[i] = new LinkedList();
    }

    // add edge
    void addEdge(int start,int end)
    {
        adjacencyList[start].add(end);
    }

    // output traversal
    void BreadthFirstSearch(int startPoint)
    {
        // Default: vertices not visited
        boolean VertexVisited[] = new boolean[Vertex];

        // LinkedList for search
        LinkedList<Integer> bfsList = new LinkedList<>();

        // Current Vertex = visited; add to list
        VertexVisited[startPoint] = true;
        bfsList.add(startPoint);

        while (bfsList.size() != 0)
        {
            // Remove Vertex from List & Output
            startPoint = bfsList.poll();
            System.out.print(startPoint + " ");

            // Get Adj Vertices
            Iterator<Integer> i = adjacencyList[startPoint].listIterator();
            while (i.hasNext())
            {
                int j = i.next();
                if (!VertexVisited[j])
                {
                    VertexVisited[j] = true;
                    bfsList.add(j);
                }
            }
        }
    }

    public static void main(String args[])
    {
        // Save current date-time in UTC
        Instant start = Instant.now();

        TraverseDemo myGraph = new TraverseDemo(9);

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

        System.out.print("\nBFS Traversal starting from 1: ");
        myGraph.BreadthFirstSearch(1);
        System.out.print("\nBFS Traversal starting from 6: ");
        myGraph.BreadthFirstSearch(6);

        // Save current date-time in UTC
        Instant end = Instant.now();
        System.out.println("\n\nTime elapsed: " + Duration.between(start, end).toMillis() + " milliseconds.");

    }
}