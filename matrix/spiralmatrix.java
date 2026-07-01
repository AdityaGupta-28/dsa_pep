package matrix;
import java.util.*;
public class spiralmatrix {
    
    public static void spiral(int[][]arr){
        
        int r=3;
        int c=arr[0].length;
        
        
        int left=0; int right=c-1; int top = 0;
        int bottom = r-1;
        while(left<=right && top<=bottom){
            
            for(int i=left;i<=right;i++){
                System.out.print(arr[top][i]+" ");
            }
            top++;
        
        
            for(int i=top;i<=bottom;i++){
                System.out.print(arr[i][right]+" ");
            }
            right--;
          
          if(top<=bottom){
          for(int i=right;i>=left;i--){
              System.out.print(arr[bottom][i]+" ");
          }
          bottom--; 
          }
        
        if(left<=right){
         for(int i=bottom;i>=top;i--){
             System.out.print(arr[i][left]+" ");
         }
         left++; 
        }
        
        }   
        
    }
	public static void main(String[] args) {
		int[][] arr = { {6,8,10,2},{14,1,13,15},{5,11,9,3},{12,16,4,7} };
		spiral(arr);
	}
    
}
