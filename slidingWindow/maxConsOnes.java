public class maxConsOnes {
     public int longestOnes(int[] nums, int k) {
        int n=nums.length;
        int i=0; int j=0;
        int maxl=0;
        int zero=0;
        // while(j<n){
        //  if(nums[j]==0){
        //     zero++;
        //  }
         
        
        //      while(zero>k){
        //         if(nums[i]==0)zero--;
        //       i++;
        //     }

         
        //     maxl=Math.max(maxl,j-i+1);
        //     j++;

        // }
        while(j<n){
            if(nums[j]==0)zero++;
            if(zero>k){
                if(nums[i]==0)zero--;
                i++;
            }
            if(zero<=k){
                maxl=Math.max(maxl,j-i+1);
            }
            j++;
        }
        return maxl;
    }
}

// Example 1:

// Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
// Output: 6
// Explanation: [1,1,1,0,0,1,1,1,1,1,1]
// Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.