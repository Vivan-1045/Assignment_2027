package Graph;

import java.util.ArrayList;
import java.util.List;

public class find_if_path_exist_in_graph {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        // edge case: no edges and source equals destination
        if(edges.length==0 && source==0 && destination == 0){
            return true;
        }

        // create adjacency list for the graph
        List<List<Integer>> adj = new ArrayList<>();
        int a = n; // store original number of nodes
        while(n-->0){
            adj.add(new ArrayList<>());
        }

        // populate adjacency list for undirected graph
        for(int[] ed : edges){
            int u = ed[0];
            int v = ed[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        // boolean array to track visited nodes
        boolean[] vis = new boolean[a];

        // start DFS from source to check if destination is reachable
        return dfs(source, destination, adj, vis);
    }

    // DFS to check if destination is reachable from current node
    boolean dfs(int node, int dest, List<List<Integer>> adj, boolean[] vis){
        if(node == dest) return true; // reached destination

        vis[node] = true; // mark current node as visited

        // explore all neighbors
        for(int nei : adj.get(node)){
            // recursively visit unvisited neighbors
            if(!vis[nei] && dfs(nei, dest, adj, vis)){
                return true; // path found
            }
        }

        return false; // no path found from this node
    }

}
