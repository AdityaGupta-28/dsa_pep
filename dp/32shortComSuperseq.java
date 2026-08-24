public class 32shortComSuperseq {
     public String lcs(int n1, int n2, String s, String t){
    int dp[][] = new int[n1+1][n2+1];
    for(int j=0;j<=n2;j++)dp[0][j]=0;
    for(int i=0;i<=n1;i++)dp[i][0]=0;
    for(int i=1;i<=n1;i++){
        for(int j=1;j<=n2;j++){
            if(s.charAt(i-1)==t.charAt(j-1))dp[i][j]=1 + dp[i-1][j-1];
            else dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
        }
    }
    String ans = "";
   int i=n1; int j=n2;
   while(i>0 && j>0){
    if(s.charAt(i-1)==t.charAt(j-1)){
        ans=s.charAt(i-1)+ans;
        i--; j--;
    }
    else if(dp[i-1][j]>dp[i][j-1]){
    ans=s.charAt(i-1)+ans;
     i--; 
    }

    else { 
    ans=t.charAt(j-1)+ans; 
    j--; 
    }
   }
   while(i>0){ans=s.charAt(i-1)+ans; i--;}
   while(j>0){ans = t.charAt(j-1)+ans; j--;}
   return ans;
       }
    public String shortestCommonSupersequence(String str1, String str2) {
        if(str1.contains(str2))return str1;
        if(str2.contains(str1))return str2;
        int n1 = str1.length();
        int n2 = str2.length();
        String ans = lcs(n1,n2,str1,str2);
        return ans;
    }
}
