package string;
import java.util.*;
public class isSubSequence {
    
    public boolean isSubsequence(String s, String t) {
      int n1 = s.length();
      int n2= t.length();
      int j=0;
      int i=0;
      if(n1>n2)return false;
      while(i<n1 && j<n2){
        if(s.charAt(i)==t.charAt(j))i++;
        j++;
      }
      return i==n1;
    }
public void main(String[] arg){
    String s= "aaaaaa";
    String t = "bbaaaa";
    System.out.print(isSubsequence(s, t));
}

}
