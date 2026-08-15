public class 19partitionWithDiffd {
  public int solve(int i, int[]arr, int target,int[][]dp){
        if(i==0){
            if(arr[i]==0 && target==0)return 2;
            if(target==0 || arr[i]==target)return 1;
            return 0;
        }
        if(dp[i][target]!=-1)return dp[i][target];
        int take =0;
        int notake = solve(i-1,arr,target,dp);
        if(arr[i]<=target)take = solve(i-1,arr,target-arr[i],dp);
        return dp[i][target] = take+notake;
    }
    
    //// since s1-s2=d;
    ////       s1-(total-s1)=d;
   // //       2s1 = total-d;
   // //       s1 = (total-d)/2;
    public int countPartitions(int[] arr, int diff) {
     int n = arr.length;
     int sum = Arrays.stream(arr).sum();
     int target = sum-diff;
     if(target<0 || target%2!=0)return 0;
     target/=2;
    //  int[][] dp = new int[n][target+1];
    //  for(int[]x: dp)Arrays.fill(x,-1);
    //  return solve(n-1,arr,target,dp);
        
        //// Space optimisation
        int row[] = new int[target+1];
        if(arr[0]==0)row[0]=2;
        else row[0]=1;
        if(arr[0]!=0 && arr[0]<=target)row[arr[0]]=1;
        
        for(int i=1;i<n;i++){
            int []temp = new int[target+1];
            for(int j=0;j<=target;j++){
                int take =0;
                int notake = row[j];
                if(arr[i]<=j) take=row[j-arr[i]];
                temp[j] = take+notake;
            }
            row = temp;
        }
       return row[target]; 
    }
    
}