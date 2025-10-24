package Graph;

import java.util.ArrayList;
import java.util.List;

public class Adjacency_list {
    public List<List<Integer>> printGraph(int V, int edges[][]) {
        // Build and return adjacency list representation of the graph
        return adjList(V, edges);
    }

    static List<List<Integer>> adjList(int V, int edges[][]) {
        // Initialize adjacency list with V empty lists
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            ans.add(new ArrayList<>());
        }

        // Add edges to the adjacency list (undirected graph)
        for (int[] ed : edges) {
            int u = ed[0];
            int v = ed[1];
            ans.get(u).add(v);
            ans.get(v).add(u);
        }

        // Return complete adjacency list
        return ans;
    }

}
