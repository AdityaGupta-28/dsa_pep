import java.util.*;
public class primeDiff {
  public boolean isPrime(int i){
    if(i<=1)return false;
    if(i==2)return true;
    if(i%2==0)return false;
   for(int j=3;j*j<=i;j+=2){
    if(i%j==0)return false;
   }
   return true;
  }
    public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=2;i<=n-6;i++){
            if(isPrime(i) && isPrime(i+6)){
                int r=i+6;
                System.out.println(i+" "+r);
            }
        }
    }
}
