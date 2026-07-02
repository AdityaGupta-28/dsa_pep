package string;
import java.util.*;
public class validPalindrome {
      public boolean isPalindrome(String s) {
        
        int i=0;
        s=s.toLowerCase();
        String st  = "";
        for(char c:s.toCharArray()){
            if(Character.isLetter(c) ||  Character.isDigit(c)){
                st+=c;
            }
        }
      int j = st.length()-1; 
        
        while(i<j){
            char c = st.charAt(i);
            char ch = st.charAt(j);
            if(c!=ch)return false;
           i++; j--;
        }
        return true;
    }

public void main(String[] args){
    String s ="A man, a plan, a canal: Panama";
    System.out.print(isPalindrome(s));
}
}
