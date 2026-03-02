import java.util.*;
public class insertionSort{
    // public void insertionSort(int[] arr){
    //     for(int i=1;i<arr.length;i++){
    //       int curElement =arr[i];
    //         int j=i-1;
    //         while(j>=0 && arr[j]>curElement){
    //             arr[j+1]=arr[j];
    //             j--;
    //         }
    //         arr[j+1]=curElement;
    //     }
    // }
    public void insertionSort(int[] arr){
      int n = arr.length;
      for(int i=1;i<n;i++){
        int j=i-1;
        int cur = arr[i];
        while(j>=0 && arr[j]>cur){
          arr[j+1]=arr[j];
          j--;
        }
        arr[j+1]=cur;
      }
    }
public void main(String[]args){
    Scanner sc = new Scanner(System.in);
  int n=sc.nextInt();
  int arr[]=new int[n];
  for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();
  }
  insertionSort(arr);
  for(int x:arr){
    System.out.print(x+" ");
  }
}
}