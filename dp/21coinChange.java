public class 21coinChange {
       public int minCoins(int i, int[]coins,int amount,int[][]dp){
    
        if(i==0){
             if(amount%coins[0]==0)return amount/coins[0];
             return Integer.MAX_VALUE / 2;
        }
        if(dp[i][amount]!=-1)return dp[i][amount];
        int take=Integer.MAX_VALUE;
        int notake = minCoins(i-1,coins,amount,dp);
        if(coins[i]<=amount)take = 1 + minCoins(i,coins,amount-coins[i],dp);
        return dp[i][amount]=Math.min(take,notake);
    }
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int dp[][] = new int[n][amount+1];
        // for(int x[]:dp){
        //     Arrays.fill(x,-1);
        // }
        // int ans = minCoins(n-1,coins,amount,dp);
        // return ans>=Integer.MAX_VALUE/2?-1:ans;
               
               //////  space optimization
        int row[] = new int[amount+1];
       for(int i=0;i<=amount;i++){
        if(i%coins[0]==0)row[i]=i/coins[0];
        else row[i] = Integer.MAX_VALUE/2;
       }

        for(int i=1;i<n;i++){
            int temp[] = new int[amount+1];
            for(int j=0;j<=amount;j++){
                int notake = row[j];
                int take = Integer.MAX_VALUE;
                if(coins[i]<=j)take=1 + temp[(j-coins[i])];
                temp[j] = Math.min(take,notake);
            }
        row = temp;
        }
         return row[amount]>=Integer.MAX_VALUE/2?-1:row[amount];   
        

    }
}
