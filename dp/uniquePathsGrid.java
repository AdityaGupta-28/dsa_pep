import java.util.*;
public class uniquePathsGrid {
    //// Memoization
    // public int helper(int i,int j, int m, int n,int dp[][]){
    //     if(i==m || j==n)return 0;
    //     if(i==m-1 && j==n-1)return 1;
    //     if(dp[i][j]!=-1)return dp[i][j];
    //     int left = helper(i+1,j,m, n,dp);
    //     int right = helper(i,j+1,m,n,dp);
    //     return dp[i][j]=left+right;
    // }

    public int helper(int i, int j, int dp[][]){
        if(i<0 || j<0)return 0;
        if(i==0 && j==0)return 1;
        if(dp[i][j]!=-1)return dp[i][j];
        int up = helper(i-1,j,dp);
        int left = helper(i, j-1,dp);
        return up + left;
    }
    public int uniquePaths(int m, int n) {
        int dp[][] = new int[m][n];
        // for(int[] x: dp){
        //     Arrays.fill(x,-1);
        // }
        // return helper(m-1,n-1,dp);

          //// Tabulation 
        // dp[0][0]=1;
        // for(int i=0;i<m;i++){
        //     for(int j=0;j<n;j++){
        //     if(i==0 && j==0)dp[i][j]=1;
        //     else{
        //         int up = 0;
        //         if(i>0)up = dp[i-1][j];
        //         int left=0;
        //         if(j>0) up = dp[i][j-1];
        //         dp[i][j] = left + up;
        //     }
        //     }
        // }
        // return dp[m-1][n-1];

        //// Space Optimization 
       int row[] = new int[n];
       Arrays.fill(row,0);
       row[0]=1;
       for(int i=0;i<m;i++){
        int temp[] = new int[n];
        Arrays.fill(temp,0);
        for(int j=0;j<n;j++){      
            int up = row[j];
            int left=0;
            if(j>0) left = temp[j-1];
             temp[j]= up + left;
        }
        row = temp;
       }
       return row[n-1];
    }
}
