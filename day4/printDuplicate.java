import java.util.*;
/// when the range of no. is 1-n;
public class printDuplicate {

    public void func(int[]arr){
  for(int i=0;i<arr.length;i++){
    int index=Math.abs(arr[i])-1;
    if(arr[index]<0)System.out.print(Math.abs(arr[i])+" ");
    else{
        arr[index]= -arr[index];
    }
  }
}
public void main(String[]args){
Scanner sc = new Scanner(System.in);
  int n=sc.nextInt();
  int arr[]=new int[n];
  for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();
  }
  func(arr);}
}
