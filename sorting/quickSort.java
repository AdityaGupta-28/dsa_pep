import java.util.Scanner;

public class quickSort {


    public int  partition(int[]arr, int l, int h){
        int i=l-1;
        int pivot = arr[h];
        for(int j=l;j<h;j++){
          if(arr[j]<pivot){
            i++;
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
          }
        }
        int temp = arr[i+1];
        arr[i+1] = pivot;
        arr[h]=temp;
        return i+1;
    }

//  public int partition(int[] arr, int l, int h){
  
//   int pivot=h;
//   int i=l;int j=h-2;
//   while(l<j){
//     if(arr[i]>arr[pivot]){
//         if(arr[j]<arr[pivot]){
//         int temp=arr[i];
//         arr[i]=arr[j];
//         arr[j]=temp; j--; i++;}
//         else{
//             j--;
//         }
//     }
//     else{
//         i++;
//     }
//   }
//   int temp=arr[j+1];
//   arr[j+1]=arr[pivot];
//   arr[pivot]=temp;
  
//   return j+1;
   
//  }

// public int partition(int[]arr, int l, int h){
//     int x=l-1;
//     int piv= arr[h];
    
//     for(int i=l;i<h;i++){
//         if(arr[i]<piv){
//             x++;
//             int temp=arr[x];
//             arr[i]=arr[x];
//             arr[x]=temp;
//         } }
//         int temp=arr[h];
//         arr[h]=arr[x+1];
//         arr[x+1]=temp;
//     return x+1;
// }
public void quicksort(int[]arr,int l, int h){
    if(l<h){
        int p= partition(arr, l, h);
        quicksort(arr, l, p-1);
        quicksort(arr, p+1, h);
    }
}
    public void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        quicksort(arr,0,n-1);
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
}
