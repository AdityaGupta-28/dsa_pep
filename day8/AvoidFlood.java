import java.util.*;

public class AvoidFlood {
    public int[] function(int[] rains){
     Queue<Integer>zero=new LinkedList<>();
      Set<Integer>st = new HashSet<>();
        int arr[]=new int[rains.length];
        int count=0;
        for(int i=0;i<rains.length;i++){
            int x=rains[i];
            if(x==0){
              count++;
              zero.add(i);
            }
            else{
                if(st.contains(x)){
                    if(count>0){
                    st.remove(x);
                    arr[zero.poll()]=x;
                    arr[i]=-1;
                    count--;}
                    else{
                    return new int[0];}
                }
                else{
                st.add(x);
                arr[i]=-1;}
            }  }
        while(count!=0){
            arr[zero.poll()]=1;
            count--;
        }
   return arr;
    }
    public int[] avoidFlood(int[] rains) {
        return function(rains);
    }
 public void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    arr= avoidFlood(arr);
    for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
    }

 }
}
