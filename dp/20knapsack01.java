public class 20knapsack01 {
     public int solve(int i, int w, int[]val,int[]wt, int[][]dp){
        
        if(i==0){
            if(wt[0]<=w)return val[0];
            return 0;
        }

        if(dp[i][w]!=-1)return dp[i][w];
        int take=0;
        int notake = solve(i-1,w,val,wt,dp);
        if(wt[i]<=w)take =val[i]+solve(i-1,w-wt[i],val,wt,dp);
        return dp[i][w] = Math.max(take,notake);
    }
    public int knapsack(int W, int val[], int wt[]) {
       int n = val.length;
       int dp[][] = new int[n][W+1];
    //   for(int x[]:dp){
    //       Arrays.fill(x,-1);
    //   }
    //   return solve(n-1,W,val,wt,dp);
      
        ///////    tabulation 
        
    //   for(int i=0;i<=W;i++){
    //   if(wt[0]<=i)dp[0][i] = val[0];
    //   else dp[0][i] =0;
    //   }
    //   for(int i=1;i<n;i++){
    //       for(int j=0;j<=W;j++){
    //           int notake = dp[i-1][j];
    //           int take =Integer.MIN_VALUE;
    //           if(wt[i]<=j) take=val[i]+dp[i-1][j-wt[i]];
    //           dp[i][j] = Math.max(take,notake);
    //       }
    //   }
    //   return dp[n-1][W];
            
                     ////// Space optimization 
    //  int row[] = new int[W+1];
    //   for(int i=0;i<=W;i++){
    //   if(wt[0]<=i)row[i] = val[0];
    //   else row[i] =0;
    //   }
      
    //   for(int i=1;i<n;i++){
    //       int temp[] = new int[W+1];
    //       for(int j=0;j<=W;j++){
    //           int notake = row[j];
    //           int take =Integer.MIN_VALUE;
    //           if(wt[i]<=j) take=val[i]+row[j-wt[i]];
    //           temp[j] = Math.max(take,notake);
    //       }
    //       row = temp;
    //   }
    //  return row[W];
    
      
     ////// Single Array Space optimization 
       int row[] = new int[W+1];
      for(int i=0;i<=W;i++){
      if(wt[0]<=i)row[i] = val[0];
      else row[i] =0;
      }
      
      for(int i=1;i<n;i++){
          for(int j=W;j>=0;j--){
              int notake = row[j];
              int take =Integer.MIN_VALUE;
              if(wt[i]<=j) take=val[i]+row[j-wt[i]];
              row[j] = Math.max(take,notake);
          }

      }
     return row[W];
    
     
    
    
    }
}
