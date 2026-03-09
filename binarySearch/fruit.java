import java.util.*;

public class fruit {
    public boolean isPossible(int[]arr, int m, int mid){
        int count=0;
        for(int x:arr){
         int d=x-mid;
         if(d>0)count+=d;
        }
        return count>=m;
    }
public int search(int[]arr, int m){
    int l=0;
    int h=Arrays.stream(arr).max().getAsInt();
    int ans=0;
    while(l<=h){
        
        int mid=l+(h-l)/2;
        if(isPossible(arr,m,mid)){
            ans=mid;
            l=mid+1;
        }
        else{
            h=mid-1;
        }
    }
    return ans;
}
     public void main(String[] st){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    System.out.print(search(arr,m));
   
}
}