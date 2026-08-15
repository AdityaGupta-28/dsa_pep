public  static int findCount(int i,int[] arr, int target){
       
        if(i==0){
            if(target==0 && arr[i]==0)return 2;
            else if(target==0 || arr[i]==target)return 1;
            return 0;
        }
       
        int take=0;
        int notake = findCount(i-1,arr,target);
        if(arr[i]<=target)take = findCount(i-1,arr,target-arr[i]);
        return take+notake;
    }
    static int perfectSum(int[] arr, int target) {
       
       int n = arr.length;
    //   return findCount(n-1,arr,target);
            ///// tabulation
        int dp[][] = new int[n][target+1];
        
        if(arr[0]==0)dp[0][0]=2;
        else{
        dp[0][0]=1;
        if(arr[0]<=target)dp[0][arr[0]]=1;
        }
        for(int i=1;i<n;i++){
            for(int j=0;j<=target;j++){
                
                    int take=0;
                int notake = dp[i-1][j];
                if(arr[i]<=j)take = dp[i-1][j-arr[i]];
                dp[i][j] = take+notake;
            
            }
        }
        return dp[n-1][target];
        
    } {
    
}
