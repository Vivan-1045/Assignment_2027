package Graph;

import java.util.ArrayList;
import java.util.List;

public class Number_of_provincess {
    public int findCircleNum(int[][] isConnected) {
        // return number of connected components (provinces)
        return numOfProvinces(isConnected);
    }

    int numOfProvinces(int[][] adj){
        int n = adj.length;

        // build adjacency list from adjacency matrix
        List<List<Integer>> adj_list = new ArrayList<>();
        for(int i = 0; i < n; i++) adj_list.add(new ArrayList<>());

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(adj[i][j] == 1 && i != j){
                    adj_list.get(i).add(j);
                    adj_list.get(j).add(i);
                }
            }
        }

        boolean[] visited = new boolean[n];
        int provinces = 0;

        // count connected components
        for(int i = 0; i < n; i++){
            if(!visited[i]){
                provinces++;
                dfs(i, visited, adj_list);
            }
        }

        return provinces;
    }

    // explore all nodes in a connected component
    void dfs(int node, boolean[] visited, List<List<Integer>> adj_list){
        visited[node] = true;
        for(int neighbor : adj_list.get(node)){
            if(!visited[neighbor]){
                dfs(neighbor, visited, adj_list);
            }
        }
    }

}
