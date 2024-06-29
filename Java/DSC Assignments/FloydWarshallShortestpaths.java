import java.util.*;

public class FloydWarshallShortestpaths {

    private int[][] dist; 
    private int[][] next; 
    private int V; 
    private static final int INF = Integer.MAX_VALUE / 2; 
    public FloydWarshallShortestpaths(int[][] graph) {
        V = graph.length;
        dist = new int[V][V];
        next = new int[V][V];

        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                dist[i][j] = graph[i][j];
                if (graph[i][j] != INF && i != j) {
                    next[i][j] = j;
                } else {
                    next[i][j] = -1;
                }
            }
        }

        for (int k = 0; k < V; k++) {
            for (int i = 0; i < V; i++) {
                for (int j = 0; j < V; j++) {
                    if (dist[i][j] > dist[i][k] + dist[k][j]) {
                        dist[i][j] = dist[i][k] + dist[k][j];
                        next[i][j] = next[i][k];
                    }
                }
            }
        }
    }

    public int getShortestDistance(int u, int v) {
        return dist[u][v];
    }

    public List<Integer> getShortestPath(int u, int v) {
        List<Integer> path = new ArrayList<>();
        if (dist[u][v] == INF) {
            return path; 
        }
        
        int current = u;
        path.add(current);
        while (current != v) {
            current = next[current][v];
            path.add(current);
        }
        
        return path;
    }

    public static void main(String[] args) {
        int[][] graph = {
            {0, 5, INF, 10},
            {INF, 0, 3, INF},
            {INF, INF, 0, 1},
            {INF, INF, INF, 0}
        };

        FloydWarshallShortestpaths fw = new FloydWarshallShortestpaths(graph);

        System.out.println("Shortest distance between 0 and 3: " + fw.getShortestDistance(0, 3)); 
        
        System.out.println("Shortest path between 0 and 3: " + fw.getShortestPath(0, 3));
    }
}