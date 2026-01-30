import java.util.Scanner;

public class minBinary {
    public int search(int[] arr){
        int l=0; int h=arr.length-1;
        int min=-1;
        while(l<=h){
            int mid=l+(h-l)/2;
           if(arr[mid]>arr[h]){
             l=mid+1;
           }
           else if(arr[l]<arr[h]){
            h=mid-1;
           }
           else{

           }
           
           
        }
      
    }
    public void main(String[] st){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
   
    System.out.print(search(arr));
   }
}
