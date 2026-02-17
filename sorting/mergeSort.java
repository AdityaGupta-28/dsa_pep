import java.util.*;

public class mergeSort {
    public void merge(int[]arr , int l, int m, int h){
        ArrayList<Integer>ans = new ArrayList<>();
    int i=l;int j=m+1; 
    
    while(i<=m && j<=h){
        if(arr[i]<arr[j]){
            ans.add(arr[i]);
            i++;
        }
        else{
            ans.add(arr[j]); j++;
        }
    }
    while(i<=m){
        ans.add(arr[i]); i++;
    }
   while(j<=h){
    ans.add(arr[j]); j++;
   }
  for(int k=0;k<ans.size();k++){
     arr[l+k]=ans.get(k);
  }
    
    }
    public void mergeSort(int[] arr,int low,int high){
        if(low>=high)return;
        int mid = (low+high)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high); 
    }
    public void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        mergeSort(arr,0,n-1);
        for(int x:arr){
            System.out.print(x+" ");
        }
}
}