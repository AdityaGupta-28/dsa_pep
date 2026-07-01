package string;
import java.util.*;
public class removeDuplicate {
    
    public String removeDuplicate(String s){
       Set<Character> st = new LinkedHashSet<>();
   for(char c:s.toCharArray()){
       if(!st.contains(c))st.add(c);
   }
   String ans="";
   for(char c:st){
       ans+=c;
   }
   return ans; 
    }
    public void main(String[] args){
        String s = "GeeksForgeeks";
        System.out.print(removeDuplicate(s));
    }
}
