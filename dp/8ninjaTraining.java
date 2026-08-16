import java.util.*;

class ninjaTraining{
    public int helper(int n, int mat[][], int task,int[][]dp){
        if(n==0){
            int max=0;
            for(int i=0;i<3;i++){
                if(i!=task)max=Math.max(max,mat[0][i]);
            }
         return max;
        }
        if(dp[n][task]!=-1)return dp[n][task];
        int max=0;
        for(int i=0;i<3;i++){
            if(i!=task) max = Math.max(max,mat[n][i]+helper(n-1,mat,i,dp));
        }
       return dp[n][task]=max;
        
    }
    public int maximumPoints(int mat[][]) {
      int n=mat.length;
    //   int dp[][] = new int[n][4];
    //   for(int[] x: dp){
    //       Arrays.fill(x,-1);
    //   }
    //   return helper(n-1,mat,3,dp);
    //   dp[0][0] = Math.max(mat[0][1],mat[0][2]);
    //   dp[0][1] = Math.max(mat[0][0],mat[0][2]);
    //   dp[0][2] = Math.max(mat[0][0],mat[0][1]);
    //   dp[0][3] = Math.max(mat[0][0],Math.max(mat[0][1],mat[0][2]));
    //   for(int i=1;i<n;i++){
    //       for(int task=0;task<4;task++){
    //       int max=0;
    //       for(int j=0;j<3;j++){
    //       if(j!=task) max = Math.max(max,mat[i][j]+dp[i-1][j]);
    //       }
    //       dp[i][task] = max;
    //       }
    //   }
      
    //  return dp[n-1][3];   
       
        //// Space Optimization 
        int prev[] = new int[4];
          prev[0] = Math.max(mat[0][1],mat[0][2]);
      prev[1] = Math.max(mat[0][0],mat[0][2]);
      prev[2] = Math.max(mat[0][0],mat[0][1]);
      prev[3] = Math.max(mat[0][0],Math.max(mat[0][1],mat[0][2]));
      for(int i=1;i<n;i++){
          int temp[] = new int[4];
          for(int last=0;last<4;last++){
          temp[last]=0;
          for(int task=0;task<3;task++){
          if(task!=last) temp[last] = Math.max(temp[last],mat[i][task]+prev[task]);
          }
         
          }
           prev=temp;
      }
      return prev[3];        
    }
}