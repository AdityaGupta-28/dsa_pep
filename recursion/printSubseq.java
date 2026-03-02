import java.util.*;

public class printSubseq {
public void subSequence(int i, int[]arr,List<Integer>list, int n){
    if(i==n){
        System.out.println(list);
        return;
    }
    list.add(arr[i]);
    subSequence(i+1,arr,list,n);
    list.removeLast();
    subSequence(i+1,arr,list,n);
}
public void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    List<Integer> list = new ArrayList<>();
    subSequence(0,arr,list,n);
}
    
}
