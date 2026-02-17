
import java.util.*;
public class bubbleSort{ 
    public static void BubbleSort(int[]arr){
        int n=arr.length;
        int check=1;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    check=0;
                }
            }
            if(check==1)return;
        }        /// BubbleSort
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		BubbleSort(arr);
		for(int x:arr){
		    System.out.print(x+" ");
		}
	}
}
