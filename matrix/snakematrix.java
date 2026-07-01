package matrix;
import java.util.*;
public class snakematrix {
    

    public static void snake(int[][]arr){
        int n=arr.length;
        int m=arr[0].length;
        int i=0;
        for(int j=0;j<m;j++){
            if(i==0){
                 while(i<n){
                System.out.print(arr[i][j]+" ");
                i++;
            }
            i--;;
            }
           
          else{
              while(i>=0){
                  System.out.print(arr[i][j]+" ");
                  i--;
              }
              i++;
          }
           
        }
    }
    	public static void main(String[] args) {
		int[][] arr = { {6,8,10,2},{14,1,13,15},{5,11,9,3},{12,16,4,7} };
		snake(arr);
	}
}
