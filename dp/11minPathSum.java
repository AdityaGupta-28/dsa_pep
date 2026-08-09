public class 11minPathSum {
        //// Memoization 
    // public int helper(int i, int j, int[][]grid, int[][]dp){
    // if(i==0 && j==0)return grid[i][j];
    // if(i<0 || j<0)return 100000;
    // if(dp[i][j]!=-1)return dp[i][j];
    // int up = grid[i][j] + helper(i-1,j, grid, dp);
    // int left = grid[i][j] + helper(i, j-1, grid, dp);
    // return dp[i][j] = Math.min(left,up);
    // }
    public int minPathSum(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int dp[][] = new int[n][m];
    //    for(int x[] : dp){
    //     Arrays.fill(x,-1);
    //    }
    //     return helper(n-1, m-1, grid, dp);
       
            //// Tabulation 
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<m;j++){
        //         if(i==0 && j==0)dp[i][j]=grid[i][j];
        //         else{
        //         int up = grid[i][j];
        //         if(i>0) up+=dp[i-1][j];
        //         else up =  Integer.MAX_VALUE;
        //         int left = grid[i][j];
        //         if(j>0) left+= dp[i][j-1];
        //         else left= Integer.MAX_VALUE;
        //         dp[i][j] = Math.min(left, up);
        //         }
        //     }
        // }
        // return dp[n-1][m-1];

        //  Space Optimization 
        int[] row = new int[m];
        for(int i=0;i<n;i++){
            int[] temp = new int[m];
            for(int j=0;j<m;j++){
                if(i==0 && j==0)temp[0]=grid[0][0];
                else{
                 int up =grid[i][j];
                 if(i>0)up+= row[j];
                 else up = Integer.MAX_VALUE;
                 int left = grid[i][j];
                 if(j>0) left+=temp[j-1];
                 else left = Integer.MAX_VALUE;
                 temp[j] = Math.min(left,up);
                }
                
            }
            row = temp;
        }
            return row[m-1];

    }
}
