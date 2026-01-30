import java.util.*;


public class BrutAgressiveCow {
    public int MaxDistance(List<List<Integer>>arr){
        int gmax=1;
         for(int i=0;i<arr.size();i++){
            int min=Integer.MAX_VALUE;
            for(int j=0;j<3-1;j++){
               int d=arr.get(i).get(j+1)-arr.get(i).get(j);
               min=Math.min(min,d);
            }
            gmax=Math.max(gmax,min);
         }
         return gmax;
    }

     public void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }                                                                                    
        List<List<Integer>> ans = new ArrayList<>();
       Arrays.sort(arr);
       for(int i=1;i<(1<<n);i++){
        List<Integer> temp = new ArrayList<>();
        for(int j=0; j<n;j++){
            if ((i & (1 << j)) != 0){
              temp.add(arr[j]);
            }
        }
        if(temp.size()==3){
        ans.add(temp);}
       }

     System.out.println(MaxDistance(ans));
      
      for (List<Integer> row : ans) {
            for (Integer element : row) {
                System.out.print(element + " ");
            }
            System.out.println(); 
        }
     
    }
       
    

} 

