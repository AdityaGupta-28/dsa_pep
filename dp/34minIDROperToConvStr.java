public class 34minIDROperToConvStr {
    public int minOperations(int n1, int n2, String s1, String s2){
        int dp[][] = new int[n1+1][n2+1];
        for(int j=0;j<=n2;j++)dp[0][j]=j; /// if(s1 get exhausted then we only need to insert remaining elements of s2 )
        for(int i=0;i<=n1;i++)dp[i][0]=i; //// if s2 get exhausted then we need to remove excess elements from the s1 (is count of operations)
        for(int i=1;i<=n1;i++){
            for(int j=1;j<=n2;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1))dp[i][j] = dp[i-1][j-1];
                else{dp[i][j]= 1+Math.min(Math.min(dp[i][j-1],dp[i-1][j]),dp[i-1][j-1]);
                    ///// we are considering min of insertion, deletion and replacement respectively
                }
            }
        }
        return dp[n1][n2];
    }
    public int minDistance(String word1, String word2) {
        int n1 = word1.length();
        int n2 = word2.length();
        int operations = minOperations(n1,n2,word1,word2);
        return operations;
    }
}
