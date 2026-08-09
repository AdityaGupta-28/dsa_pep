import java.util.*;
public class uniquePath2 {
     // public int helper(int i, int j, int[][] obstacleGrid, int[][]dp){
    //     if(obstacleGrid[i][j]==1)return 0;
    //     if(i==0 &&  j==0)return 1;
    //     if(i<0 || j<0)return 0;
    //     if(dp[i][j]!=-1)return dp[i][j];
    //     int up = 0;
    //      if(i>0) up = helper(i-1,j, obstacleGrid, dp);
    //      int left=0;
    //      if(j>0) left = helper(i,j-1,obstacleGrid, dp);
    //      return dp[i][j] = left+up;
    // }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n = obstacleGrid.length;
        int m = obstacleGrid[0].length;
        // int dp[][] = new int[n][m];
        // for(int x[] : dp){
        //     Arrays.fill(x,-1);
        // }
        // return helper(n-1,m-1,obstacleGrid, dp);
          
          //// Tabulation   
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<m;j++){
        //         if(i==0 && j==0 && obstacleGrid[i][j]!=1)dp[i][j]=1;
        //         else{
        //          if(obstacleGrid[i][j]==1){dp[i][j]=0;
        //             continue;}
        //          int up =0;
        //          if(i>0) up = dp[i-1][j];
        //          int left = 0;
        //         if(j>0) left = dp[i][j-1];
        //         dp[i][j] = left + up;
        //         }
        //     }
        // }
        // return dp[n-1][m-1];

        //// Space optimization 
        int []dp = new int[m];
          for(int i=0;i<n;i++){
            int temp[] = new int[m];
            for(int j=0;j<m;j++){
                if(i==0 && j==0 && obstacleGrid[i][j]!=1)dp[0]=1;
                else{
                 if(obstacleGrid[i][j]==1){temp[j]=0;
                    continue;}
                 int up=dp[j];
                 int left = 0;
                if(j>0) left = dp[j-1];
                temp[j] = left + up;
                }
            }
            dp = temp;
        }
        return dp[m-1];
       
    }
}
