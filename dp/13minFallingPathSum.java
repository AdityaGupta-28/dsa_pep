public class 13minFallingPathSum {
      public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int dp[][] = new int[n][n];
        // for(int[] x: dp)Arrays.fill(x,-1);
        for(int i=0;i<n;i++)dp[n-1][i] = matrix[n-1][i];
        // return memoization(n-1,0,matrix,dp); 

              ///// Tabulation      
        for(int i=n-2;i>=0;i--){
            for(int j=0;j<n;j++){
             int up = matrix[i][j] + dp[i+1][j];
             int left = Integer.MAX_VALUE;
             if(j>0) left=matrix[i][j] + dp[i+1][j-1];
             int right = Integer.MAX_VALUE;
             if(j<n-1) right =matrix[i][j] + dp[i+1][j+1];
             dp[i][j]= Math.min(up,Math.min(left,right));
            }
        }
        int ans = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            ans = Math.min(ans,dp[0][i]);
        }
        return ans;
    }
}
