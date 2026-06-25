package tcs;
import java.util.*;
public class sortArray_containing {
    
    public void sort(int[] arr){
        int zero=0; 
        int two=0;
        int i=0; int j=arr.length-1;
        for(int x:arr){
            if(x==0)arr[i++]=0;
            else if(x==2)arr[j--]=2;

        }
        while(i<=j){
            arr[i++]=1;
        }
    
    }
    public void main(String[] args){
        int arr[] = {1,0,2,1,0,0,2,2,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
