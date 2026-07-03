import java.util.*;
public class NoOfSubArrExactKDist {
    public int subarrays(int[] nums, int k) {
      Map<Integer,Integer>map = new HashMap<>();
      int i=0;
      int count=0;
      for(int j=0;j<nums.length;j++){
        int x = nums[j];
        map.put(x,map.getOrDefault(x,0)+1);
        while( map.size()>k){
            int y=nums[i];
            map.put(y,map.getOrDefault(y,0)-1);
            if(map.get(y)<=0)map.remove(y);
            i++;
            
        }  
        count+=j-i+1;  
      } 
      return count; 
    }

    public int subarraysWithKDistinct(int[]nums, int k){
    return subarrays(nums,k)-subarrays(nums,k-1);
    }

    public void main(String[] args){
        int arr[] = {1,2,1,2,3};
        System.out.print(subarrays(arr, 2));
    }
}
