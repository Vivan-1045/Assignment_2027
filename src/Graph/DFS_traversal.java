package Graph;

import java.util.ArrayList;

public class DFS_traversal {
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {

        // Find the highest-numbered node to determine the size for visited array
        int node = 0;
        for (ArrayList<Integer> it : adj) {
            for (Integer i : it) {
                node = Math.max(node, i);
            }
        }

        // Perform DFS traversal starting from node 0
        boolean[] visit = new boolean[node + 1];
        ArrayList<Integer> ans = new ArrayList<>();
        DFS(0, adj, visit, ans);
        return ans;
    }

    // Helper function to perform DFS recursively
    public void DFS(int node, ArrayList<ArrayList<Integer>> adj_List, boolean[] visit, ArrayList<Integer> ans) {
        visit[node] = true;
        ans.add(node);

        // Explore all unvisited adjacent nodes recursively
        for (Integer it : adj_List.get(node)) {
            if (!visit[it]) {
                DFS(it, adj_List, visit, ans);
            }
        }
    }
}
