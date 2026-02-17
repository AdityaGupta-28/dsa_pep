import java.util.*;

public class dnfSort {
    public void swap(int[] arr,int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public void dnf(int[] arr){
   int l=0;int h=arr.length-1;int mid=0;
   while(mid<=h){
    if(arr[mid]==0){
    swap(arr,l++,mid++);
    }
    else if(arr[mid]==1){
        mid++;
    }
    else{
       swap(arr, mid, h--);
    }
   }  
}
     public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        dnf(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        
}

}