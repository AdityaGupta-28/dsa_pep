import java.util.Scanner;

public class pascalTriangle {
// public int factorial(int n){
//     if(n==1 || n==0)return 1;
//     return n*factorial(n-1);
// }
// public int[]row(int n){
//       int arr[]=new int[n+1];
//      arr[0]=1;
//    for(int i=1;i<=n;i++){
//     int val=factorial(n)/(factorial(i)*factorial(n-i));
//     arr[i]=val;
//    }
//    return arr;
// }

public int[] row(int n){
    int arr[]=new int[n+1];
   
    arr[0]=1;
    for(int i=0;i<n;i++){
    arr[i+1]=arr[i]*(n-i)/(i+1);
     }
    return arr;

}
public void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n =sc.nextInt();
    int arr[] = row(n);
    for(int x: arr){
        System.out.print(x+" ");
    }
  
 }

}
