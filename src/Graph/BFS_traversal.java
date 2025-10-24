package Graph;

public class BFS_traversal {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {

        // Find the highest-numbered node to determine the size for visited array
        int node = 0;
        for (ArrayList<Integer> it : adj) {
            for (Integer i : it) {
                node = Math.max(node, i);
            }
        }

        // Perform BFS traversal starting from node 0
        return BFS(adj, node);
    }

    // Helper function to perform BFS traversal
    public ArrayList<Integer> BFS(ArrayList<ArrayList<Integer>> adj_List, int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<Integer> que = new LinkedList<>();
        boolean[] visit = new boolean[n + 1];

        // Start BFS from node 0
        que.add(0);
        visit[0] = true;

        while (!que.isEmpty()) {
            Integer node = que.poll();
            ans.add(node);

            // Traverse all adjacent (unvisited) nodes
            for (Integer it : adj_List.get(node)) {
                if (!visit[it]) {
                    visit[it] = true;
                    que.add(it);
                }
            }
        }

        return ans;
    }
}
