import java.util.*;
public class Reverse{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
     long ans=0;
        while(n>0){
            ans=ans*10+n%10;
            if(ans>=Integer.MAX_VALUE){
                ans=-1; 
                break;
            }
            n/=10;
        }
        System.out.print(ans);
    }
}