import java.util.*;

public class Subseq_whose_sum_k {
  
     public void subSeqSumK(int k, int sum, List<Integer>list, int[]arr,int i, int n){
        if(sum>k)return;
        if(i==n){
      if(sum==k){
        System.out.println(list);
        
      }return; }
      list.add(arr[i]);
      sum+=arr[i];
      subSeqSumK(k, sum, list, arr, i+1, n);
      sum-=list.getLast();
      list.removeLast();
      subSeqSumK(k, sum, list, arr, i+1, n);
     }
    public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k = sc.nextInt();
        List<Integer>list = new ArrayList<>();
        int sum=0;
        subSeqSumK(k,sum,list,arr,0,n );
    }
}
