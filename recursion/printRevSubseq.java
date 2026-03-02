import java.util.*;

public class printRevSubseq {
public void fun(int i,List<Integer>list, int n, int[]arr){
 if(i==n){
    System.out.println(Arrays.toString(list.toArray(new Integer[0])));
    return;
 }
 fun(i+1,list,n,arr);
 list.add(arr[i]);
 fun(i+1,list,n,arr);
 list.removeLast();
}
 public void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n =sc.nextInt();
    int []arr = new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    List<Integer> list = new ArrayList<>();
    fun(0,list,n, arr);
 }
}
