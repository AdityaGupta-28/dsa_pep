import java.util.Scanner;

public class minBinaryRotated {
    public int search(int[] arr){
        int l=0; int h=arr.length-1;
        int min=-1;
        while(l<h){
            int mid=l+(h-l)/2;
           if(arr[mid]>arr[h]){
             l=mid+1;
           }
          
           else{
              h=mid;
           }
           
           
        }
        return l;
      
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
