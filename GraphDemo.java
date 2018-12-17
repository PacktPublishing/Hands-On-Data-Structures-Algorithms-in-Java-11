import java.lang.*;
import java.time.*;
import java.util.LinkedList;

public class GraphDemo {

    static class NetworkGraph {
        int Vertex;
        LinkedList<Integer> myNetwork[]; //Adjacency List Representation

        // Constructor
        NetworkGraph(int Vertex) {
            this.Vertex = Vertex;

            // Size == # of Vertices
            myNetwork = new LinkedList[Vertex];

            // Create a new list for each vertex
            // such that adjacent nodes can be stored
            for (int i = 0; i < Vertex; i++) {
                myNetwork[i] = new LinkedList<>();
            }
        }
    }

    public static void main(String args[]) {

        // Save current date-time in UTC
        Instant start = Instant.now();

        int Vertex = 9; // 0 through 8
        NetworkGraph myGraph = new NetworkGraph(Vertex);
        addVertexEdge(myGraph, 0, 3);
        addVertexEdge(myGraph, 0, 4);
        addVertexEdge(myGraph, 0, 7);
        addVertexEdge(myGraph, 1, 2);
        addVertexEdge(myGraph, 1, 3);
        addVertexEdge(myGraph, 1, 5);
        addVertexEdge(myGraph, 1, 8);
        addVertexEdge(myGraph, 5, 2);
        addVertexEdge(myGraph, 6, 7);
        addVertexEdge(myGraph, 6, 8);
        addVertexEdge(myGraph, 6, 0);

        // Output graph
        outputGraph(myGraph);

        // Save current date-time in UTC
        Instant end = Instant.now();
        System.out.println("\nTime elapsed: " + Duration.between(start, end).toMillis() + " milliseconds.");
    }

    // Add Edge
    static void addVertexEdge(NetworkGraph myGraph, int edgeStart, int edgeEnd) {

        // Start to End
        myGraph.myNetwork[edgeStart].add(edgeEnd);

        // End to Start
        myGraph.myNetwork[edgeEnd].add(edgeStart);
    }

    // Output Edge
    static void outputGraph(NetworkGraph myGraph) {
        System.out.println("\nVertex");
        System.out.println("Head\tConnections");
        for (int i = 0; i < myGraph.Vertex; i++) {
            System.out.print(i + "\t\t");
            for (Integer transverseGraph : myGraph.myNetwork[i]) {
                System.out.print(" -> " + transverseGraph);
            }
            System.out.println();
        }
    }
}
