import java.util.*;

public class largestSubarray {
// public int fun(int[]nums){
//    int max=0;
// int i=0; int j=0;
// Map<Integer,Integer>map = new HashMap<>();
// map.put(0,-1);
// for(int k=0;k<nums.length;k++){
//     if(nums[k]==0)i++;
//     else j++;
//     int d=j-i;
//    if(map.containsKey(d)){
//     max=Math.max(max,(k-map.get(d)));
//    }
//    else map.put(d,k);
  
// }

// return max;

// }

public int fun(int[]nums){
   int count=0;
int i=0; int j=0;
Set<Integer>st = new HashSet<>();
for(int k=0;k<nums.length;k++){
    if(nums[k]==0)i++;
    else j++;
    int d=j-i;
   if(st.contains(d)){
    
   count++;
   }
   else st.add(d);
  
}
return count;

}

     public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print(fun(arr));
        
}
}
