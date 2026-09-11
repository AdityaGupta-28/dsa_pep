import java.util.ArrayList;
import java.util.*;
public class permutation_optimal{

    public void swap(int i, int j, int[]nums){
        int t = nums[i];
        nums[i]=nums[j];
        nums[j] = t;
    }

    public void permutation(int i, int n, int[]nums, List<List<Integer>>list){
        if(i==n){
            List<Integer>temp = new ArrayList<>();
            for(int x:nums)temp.add(x);
            list.add(temp);
            return;
        }

        for(int j=i;j<n;j++){
        swap(i,j,nums);
        permutation(i+1, n, nums, list);
        swap(i,j,nums);
        }
    }


 public void main(String[] args){
  int nums[] = {1,2,3};
  List<List<Integer>>ans = new ArrayList<>();
  permutation(0, 3, nums, ans);
  System.out.println(ans);
 }
}