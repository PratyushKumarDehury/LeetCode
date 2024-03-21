class Solution {
    public int minPathSum(int[][] grid) {

        // 2D array algorithm are used
        int m = grid.length;
        int n = grid[0].length;

        for(int i = 1; i < m; i++){
            grid[i][0] += grid[i-1][0];

        }
        for(int j = 1; j < n; j++){
            grid[0][j] += grid[0][j-1];
        }
        // moving down & moving right(i,j)
        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                grid[i][j] += Math.min(grid[i-1][j], grid[i][j-1]);
            }
        }
        return grid[m-1][n-1];
        
    }
}

// T.C -> O(m*n)
// S.C -> O(1)