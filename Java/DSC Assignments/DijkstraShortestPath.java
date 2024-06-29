import java.util.*;

public class DijkstraShortestPath {

    static class Edge {
        int target;
        int weight;

        public Edge(int target, int weight) {
            this.target = target;
            this.weight = weight;
        }
    }

    static class Graph {
        int V;
        List<List<Edge>> adj;

        public Graph(int V) {
            this.V = V;
            adj = new ArrayList<>(V);
            for (int i = 0; i < V; ++i)
                adj.add(new ArrayList<>());
        }

        void addEdge(int u, int v, int weight) {
            adj.get(u).add(new Edge(v, weight));
            adj.get(v).add(new Edge(u, weight)); // for undirected graph
        }

        void dijkstra(int src) {
            int[] dist = new int[V];
            Arrays.fill(dist, Integer.MAX_VALUE);
            dist[src] = 0;

            PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.comparingInt(v -> dist[v]));
            pq.offer(src);

            while (!pq.isEmpty()) {
                int u = pq.poll();

                for (Edge e : adj.get(u)) {
                    int v = e.target;
                    int weight = e.weight;

                    if (dist[u] != Integer.MAX_VALUE && dist[u] + weight < dist[v]) {
                        dist[v] = dist[u] + weight;
                        pq.offer(v);
                    }
                }
            }

            // Print the shortest distances stored in dist[]
            System.out.println("Shortest distances from source vertex to all other vertices:");
            for (int i = 0; i < V; ++i)
                System.out.println("Vertex " + i + ": " + dist[i]);
        }
    }

    public static void main(String[] args) {
        int V = 5; // Number of vertices
        int source = 0; // Source vertex

        Graph graph = new Graph(V);
        graph.addEdge(0, 1, 4);
        graph.addEdge(0, 2, 1);
        graph.addEdge(1, 2, 2);
        graph.addEdge(1, 3, 5);
        graph.addEdge(2, 3, 2);
        graph.addEdge(2, 4, 4);
        graph.addEdge(3, 4, 1);

        graph.dijkstra(source);
    }
}