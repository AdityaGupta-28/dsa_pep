import java.util.Scanner;

public class twoSum {

    public void func(int[]arr, int target){
        int i=0; int j=arr.length-1;
        while(i<j){
            int sum=arr[i]+arr[j];
            if(sum==target){
                System.out.println(i+" "+j);
            i++;
            }
            else if(sum<target){
              i++;
            }
            else j--;
        }   }
    public void main(String[]args){
Scanner sc = new Scanner(System.in);
  int n=sc.nextInt();
  int arr[]=new int[n];
  for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();
  
  }
  int target=sc.nextInt();
  func(arr,target);
}
}
