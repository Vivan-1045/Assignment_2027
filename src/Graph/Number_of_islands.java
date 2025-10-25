package Graph;

import java.util.LinkedList;
import java.util.Queue;

public class Number_of_islands {
    class Pair{
        int f; // row index
        int s; // column index

        Pair(int f, int s){
            this.f = f;
            this.s = s;
        }
    }

    public int numIslands(char[][] grid) {
        int n = grid.length; // number of rows
        int m = grid[0].length; // number of columns

        boolean[][] vis = new boolean[n][m]; // keeps track of visited cells
        int ans = 0; // counts the number of islands

        // traverse every cell in the grid
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                // if cell is land and not visited, it's a new island
                if(vis[i][j] == false && grid[i][j]=='1'){
                    ans++; // increment island count
                    bfs(i,j,vis,grid); // explore the entire island
                }
            }
        }

        return ans;
    }

    int[] dRow = {-1,1,0,0}; // row direction offsets for BFS (up, down)
    int[] dCol = {0,0,-1,1}; // column direction offsets for BFS (left, right)

    void bfs(int i, int j, boolean[][] vis, char[][] grid){
        vis[i][j] = true; // mark starting cell as visited
        Queue<Pair> que = new LinkedList<Pair>();
        que.add(new Pair(i,j)); // add starting cell to BFS queue

        int n = grid.length;
        int m = grid[0].length;

        while(!que.isEmpty()){
            int r = que.peek().f; // current cell row
            int c = que.peek().s; // current cell column
            que.remove(); // dequeue the cell

            // check all 4 neighboring cells
            for (int k = 0; k < 4; k++) {
                int nRow = r + dRow[k]; // neighbor row
                int nCol = c + dCol[k]; // neighbor column

                // if neighbor is within bounds, is land, and not visited
                if(nRow>=0 && nRow < n && nCol>=0 && nCol < m && grid[nRow][nCol]=='1' && vis[nRow][nCol] == false){
                    vis[nRow][nCol] = true; // mark neighbor as visited
                    que.add(new Pair(nRow, nCol)); // add neighbor to queue
                }
            }
        }
    }

}
