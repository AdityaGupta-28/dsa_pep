import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class fruitsIntoBasket {
    
 public int totalFruit(int[] fruits) {
        int n= fruits.length;
        int i = 0 , j =0, max = 0;
        Map<Integer,Integer> map = new HashMap<>();
        while( j<n){
            int x = fruits[j];
         map.put(x, map.getOrDefault(x,0)+1);
        //  if(map.size()>2){
        //     map.put(fruits[i], map.get(fruits[i])-1);
        //     if(map.get(fruits[i])==0)map.remove(fruits[i]);
        //     i++;
        //  }
        //  if(map.size()<=2){
        //     max=Math.max(max,j-i+1);
        //  }

        while(map.size()>2){
            int y = fruits[i];
            map.put(y,map.get(y)-1);
            if(map.get(y)==0)map.remove(y);
            i++;
        }
        
        max=Math.max(max,j-i+1);
         j++;
        }
        return max;
    }

    
    public void main(String[]args){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();

    }


}
