import java.util.*;


public class xor {

 public int func(int[]arr){
 Arrays.sort(arr);
 int count=1;
 for(int i=0;i<arr.length-1;i++){
  if(arr[i]==arr[i+1])count++;
  else{
    if(count==4)return arr[i];
    count=1;
  }
 }
  return 0;

}
public void main(String[] args){
     Scanner sc = new Scanner(System.in);
  int n=sc.nextInt();
  int arr[]=new int[n];
  for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();
  }
  int e=func(arr);
System.out.print(e);
}
    
}
