import java.util.*;
public class rajdeep {
    public void fun(int[] arr){
        int i=0; int j=3;
        int n=arr.length;
        if(n<4){
            System.out.print(Arrays.toString(arr));
        }
        else{
         while(j<n){
            System.out.print(arr[i]+" "+arr[j]+" ");
            j++;
            i++;
         }
        }
    }
    public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        fun(arr);
    }
}
