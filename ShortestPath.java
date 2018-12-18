import java.time.*;

public class ShortestPath {

    static final int Vertex=9;

    int cheapestPath(int distance[], Boolean pos[])
    {
        int minimum = Integer.MAX_VALUE, minimumIndex=-1;

        for (int i = 0; i < Vertex; i++)
            if (pos[i] == false && distance[i] <= minimum)
            {
                minimum = distance[i];
                minimumIndex = i;
            }
        return minimumIndex;
    }

    // build array of distances
    void printSolution(int distance[], int n)
    {
        System.out.println("\nVertex\tDistance");
        for (int i = 0; i < Vertex; i++)
            System.out.println(i + " ----> " + distance[i]);
    }

    // Dijkstra's infamous algorithm
    void dijkstra(int graph[][], int source)
    {
        int distance[] = new int[Vertex];
        Boolean shortestPathTreeSet[] = new Boolean[Vertex];

        // Default: distance = infinite
        for (int i = 0; i < Vertex; i++)
        {
            distance[i] = Integer.MAX_VALUE;
            shortestPathTreeSet[i] = false;
        }

        // When distance & source are the same
        distance[source] = 0;

        // Determine shortest path for all vertices
        for (int count = 0; count < Vertex-1; count++)
        {
            // Find minDist Vertex from those not visited
            int unk = cheapestPath(distance, shortestPathTreeSet);

            // Mark as 'Visited'
            shortestPathTreeSet[unk] = true;

            // Update value
            for (int v = 0; v < Vertex; v++)

                // Update dist[v] only if is not in sptSet, there is an
                // edge from u to v, and total weight of path from src to
                // v through u is smaller than current value of dist[v]
                if (!shortestPathTreeSet[v] && graph[unk][v]!=0 &&
                        distance[unk] != Integer.MAX_VALUE &&
                        distance[unk]+graph[unk][v] < distance[v])
                    distance[v] = distance[unk] + graph[unk][v];
        }

        // Output array
        printSolution(distance, Vertex);
    }

    // Driver method
    public static void main (String[] args)
    {
        // Save current date-time in UTC
        Instant start = Instant.now();

        /* Let us create the example graph discussed above */
        int myGraph[][] = new int[][]{{7, 12, 9, 0, 2, 0, 7, 11, 6, 0, 7},
                {0, 8, 2, 0, 6, 0, 0, 3, 5, 0, 7},
                {3, 2, 2, 0, 5, 14, 4, 3, 5, 0, 7},
                {0, 1, 0, 0, 3, 13, 5, 3, 5, 0, 7},
                {1, 0, 9, 0, 5, 11, 6, 3, 5, 0, 7},
                {0, 11, 7, 0, 13, 0, 7, 2, 13, 0, 7},
                {1, 4, 4, 3, 0, 12, 9, 6, 0, 0, 7},
                {3, 2, 1, 3, 0, 0, 11, 3, 9, 0, 7},
                {0, 0, 0, 11, 0, 0, 3, 0, 1, 0, 7},
                {0, 0, 0, 11, 0, 0, 3, 0, 1, 0, 7} };

        ShortestPath temp = new ShortestPath();
        temp.dijkstra(myGraph, 0);

        // Save current date-time in UTC
        Instant end = Instant.now();
        System.out.println("\nTime elapsed: " + Duration.between(start, end).toMillis() + " milliseconds.");

    }
}
