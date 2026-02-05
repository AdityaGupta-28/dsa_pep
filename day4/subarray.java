import java.util.*;
public class subarray {
 
    // public boolean func(int[]arr){
    //     int n=arr.length;
    //     for(int i=0;i<arr.length;i++){
    //        int sum=0;
    //         for(int j=i;j<n;j++){
    //           sum+=arr[j];
    //           if(sum==0)return true;

    //         }
    //     }
    //     return false;

    // }

    // public boolean func(int[]arr){
    //    int sum=0; int n=arr.length;
    //    HashSet<Integer>st = new HashSet<>();  // O(1);
    //     // fail if [-1,1];
    // //  List<Integer>st = new ArrayList<>(); /// average time complexity of searching is o(n);
    //    for(int i=0;i<n;i++){
    //     sum+=arr[i];
    //     //  arr[i]=sum;
    //      if(st.contains(sum) || sum == 0)return true;
    //      st.add(sum);
    //    }                                  /// optimal approach using set to find whether subarray exists with sum equal to zero 
    //    return false;
    //   }

 public int func(int[]arr){
       int sum=0; int n=arr.length;
       Map<Integer,Integer>map = new HashMap<>();  
       map.put(0,1);
       int count=0;
       for(int i=0;i<n;i++){
        sum+=arr[i];
      
         if(map.containsKey(sum)){
          count++;
          map.put(sum,map.getOrDefault(sum,0)+1);
         }
         map.put(sum,1);
       }                              
       return count;
      }

    public void main(String[]s){
    Scanner sc = new Scanner(System.in);
      int n=sc.nextInt();
  int arr[]=new int[n];
  for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();
  
  }  
  System.out.print(func(arr));
    }
}
//3 2 -1 4 -3 -2 5 -5 -3