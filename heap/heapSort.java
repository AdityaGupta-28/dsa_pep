import java.util.*;
public class heapSort {
    public void heapsort(int n, int[]arr){
        int i=0; int l=n-1;
        while(l>0){
            int temp=arr[l];
            arr[l]=arr[0];
            arr[0]=temp;
            heapify(l,0,arr);
            l--;
        }
    }
    public void heapify(int n, int i, int[]arr){
        int left = 2*i+1;
        int right = 2*i+2;
        int parent=i;
        if(left<n && arr[left]>arr[parent])parent=left;
        if(right<n && arr[right]>arr[parent])parent=right;
        if(parent!=i){
            int temp = arr[i];
            arr[i]=arr[parent];              /// downstep
            arr[parent]=temp;
            heapify(n,parent,arr);
        }
    }
    public void BuildMaxHeap(int n, int[]arr){
        for(int i=(n-1)/2;i>=0;i--){
            heapify(n, i, arr);
        }
    }

public void main(String args[]){

    int n = 8;
    int arr[] = {4,1,6,2,0,7,3,8};
    BuildMaxHeap(n, arr);
    heapsort(n,arr);
    for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
    }

}
}
