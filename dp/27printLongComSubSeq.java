import java.util.*;
public class 27printLongComSubSeq {
     public static int[] lcs(int n1,int n2, int[]num1, int[]num2){
        int dp[][] = new int[n1+1][n2+1];
        for(int j=0;j<=n2;j++)dp[0][j]=0;
        for(int i=0;i<=n1;i++)dp[i][0]=0;
        for(int i=1;i<=n1;i++){
            for(int j=1;j<=n2;j++){
            if(num1[i-1]==num2[j-1]){
               dp[i][j] = 1 + dp[i-1][j-1]; }
            else dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        int len = dp[n1][n2];
        int index=len-1;
        int ans[] =new int[len];
        int i=n1, j=n2;
        while(i>0 && j>0){
         if(num1[i-1]==num2[j-1]){ans[index--]=num1[i-1];
         i--; j--;}
        else if(dp[i-1][j]>dp[i][j-1])i--;
        else j--;}
        return ans;
     }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int num1[] = new int[n1];
        int num2[] = new int[n2];
        for(int i=0;i<n1;i++){
            num1[i] = sc.nextInt();
        }
        for(int j=0;j<n2;j++){
            num2[j] = sc.nextInt();
        }
        int ans[]= lcs(n1,n2,num1,num2);
        for(int x:ans)System.out.print(x+" ");
    }
}
