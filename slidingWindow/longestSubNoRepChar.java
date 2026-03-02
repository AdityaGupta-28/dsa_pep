

import java.util.*;

public class longestSubNoRepChar {
    
    public int longestSub(char[]arr){
   int n=arr.length;
   int i=0,j=0,max=0;
   int hash[]=new int[256];
   Arrays.fill(hash,-1);
   while(j<n){
    char ch= arr[j];
   
    if(hash[ch]!=-1){
        if(hash[ch]>=i){
            i=hash[ch]+1;
        }    
    }
       
        hash[ch]=j;
        max=Math.max(max,j-i+1);
        
    j++;
   }
  return max;
    }
     public void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    char arr[]=new char[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.next().charAt(0);
    }

    System.out.print(longestSub(arr));
}  
}
