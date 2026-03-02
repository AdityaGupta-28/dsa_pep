import java.util.*;
public class LongSubstrWithAtMostKDistinct {
    
    public int longsub(String s, int k){
        int n=s.length();
        int i=0; int j=0; 
        int maxl = 0;
        Map<Character,Integer> map = new HashMap<>();

        while(j<n){
        char ch = s.charAt(j);
        map.put(ch,map.getOrDefault(ch,0)+1);
            while(map.size()>k){
                char c = s.charAt(i++);
                map.put(c,map.get(c)-1);
                if(map.get(c)==0)map.remove(c);
            }
            maxl = Math.max(maxl,j-i+1);
         j++;
        }
        return maxl;
    }
    public void main(String[] ssf){
   
    }
}
