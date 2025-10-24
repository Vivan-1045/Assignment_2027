package Graph;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Connected_components {
    public boolean isCyclic(int V, int[][] edges) {
        // Build adjacency list
        Map<Integer, Set<Integer>> adj = new HashMap<>();
        for (int[] ed : edges) {
            adj.computeIfAbsent(ed[0], k -> new HashSet<>()).add(ed[1]);
        }

        boolean[] visited = new boolean[V];
        boolean[] path = new boolean[V];

        // Check each component for cycle
        for (int i = 0; i < V; i++) {
            if (!visited[i] && dfs(i, adj, visited, path)) return true;
        }
        return false;
    }

    private boolean dfs(int idx, Map<Integer, Set<Integer>> adj,
                        boolean[] vis, boolean[] path) {
        vis[idx] = true;
        path[idx] = true;

        // Traverse neighbors
        for (int nei : adj.getOrDefault(idx, new HashSet<>())) {
            if (!vis[nei] && dfs(nei, adj, vis, path)) return true;
            else if (path[nei]) return true; // Cycle found
        }

        path[idx] = false; // Backtrack
        return false;
    }
}
