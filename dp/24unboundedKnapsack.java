public class 24unboundeKnapsack {
     public int maxprofit(int i, int[]val, int[]wt, int capacity, int[][]dp){
        if(i==0){
          return val[i]*(capacity/wt[i]); }
        
        if(capacity==0)return 0;
        if(dp[i][capacity]!=-1)return dp[i][capacity];
        int notake = maxprofit(i-1, val, wt, capacity, dp);
        int take=0;
        if(wt[i]<=capacity)take=val[i]+ maxprofit(i,val,wt,capacity-wt[i],dp);
      
        return dp[i][capacity] = Math.max(take,notake);
        
    }
    public int knapSack(int val[], int wt[], int capacity) {
      int n = val.length;
      int dp[][] = new int[n][capacity+1];
      for(int x[] : dp)Arrays.fill(x,-1);
      return maxprofit(n-1, val, wt, capacity, dp);
        
    }
}
