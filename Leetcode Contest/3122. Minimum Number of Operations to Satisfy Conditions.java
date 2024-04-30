class Solution {
    public int minimumOperations(int[][] grid) {
        
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int [n][10];
        
        
        for(int i = 0; i < n; i++){
            int [] count  = new int[10];
            for(int j = 0; j < m; j++){
                count[grid[j][i]]++;
            }
        
            
            for(int j = 0; j < 10 ; j++){
                dp[i][j] = m-count[j];
            }
        }
        
        
        int [][]dp2 = new int [n][10];
        for(int i = 0; i < 10; i++){
            dp2[0][i] = dp[0][i];
        }
            
            for(int i = 1; i < n; i++){
                for(int j = 0; j < 10; j++){
                    int min  = 1000000;
                    for(int k = 0; k < 10; k++){
                        if(k != j)
                            min = Math.min(min, dp2[i-1][k]);
                    }
                    dp2[i][j] = min + dp[i][j];
                }
            }
            int ans = Integer.MAX_VALUE;
            for(int i = 0; i < 10; i++) {
                ans = Math.min(ans,dp2[n-1][i]);
           
        }
             return ans;
        
        
        
    }
}

// Time Complexity-> O(m*n + n)
// Space Complexity-> O(n)
