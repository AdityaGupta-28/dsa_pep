package tcs;
import java.util.*;
public class move_zero {

     public static void move(int[] arr){
        int i=0; 
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=0){
                arr[i]=arr[j];
                i++;
            }
        }
        while(i<arr.length){
            arr[i]=0; 
            i++;
        }
     }
    
    public static void main(String args[]){
        int arr[] = {1,4,3,5,0,3,0,1,0};
        move(arr);
        System.out.println(Arrays.toString(arr));

    }
}
