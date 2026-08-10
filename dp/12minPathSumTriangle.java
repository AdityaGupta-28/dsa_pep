public class 12minPathSumTriangle {
     public int helper(int i,int j,int n,List<List<Integer>>tr,int[][]dp){
        if(i==n-1)return tr.get(i).get(j);
        if(dp[i][j]!=Integer.MAX_VALUE)return dp[i][j];
        int down = tr.get(i).get(j) + helper(i+1, j, n, tr,dp);
        int diag = tr.get(i).get(j) + helper(i+1,j+1,n,tr,dp);
         return dp[i][j] = Math.min(down, diag);      
    }
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[][] dp = new int[n][n];
        // for(int []x: dp)Arrays.fill(x,Integer.MAX_VALUE);
        // return helper(0,0,n,triangle,dp);
       
    //    for(int j=0;j<n;j++){
    //     dp[n-1][j] = triangle.get(n-1).get(j);
    //    }
      
    //     for(int i=n-2;i>=0;i--){
    //         for(int j=0;j<=i;j++){
    //             int down = triangle.get(i).get(j) + dp[i+1][j];
    //             int diag = triangle.get(i).get(j) + dp[i+1][j+1];
    //             dp[i][j] = Math.min(down,diag);
    //         }
    //     }
    //   return dp[0][0];

                 //// Spacd optimization 
        int row [] = new int[n];
        for(int j=0;j<n;j++){
            row[j] = triangle.get(n-1).get(j);
        }
        for(int i=n-2;i>=0;i--){
            int temp[] = new int[i+1];
            for(int j=0;j<=i;j++){
                int down = triangle.get(i).get(j)+ row[j];
                int diag =triangle.get(i).get(j) + row[j+1];
                temp[j] = Math.min(down, diag);
            }
            row = temp;
        }
        return row[0];
    }
}
