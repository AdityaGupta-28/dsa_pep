package string;
import java.util.*;
public class reverseString {
    
    public String reverseString(String s){
        StringBuilder sb = new StringBuilder(s);
        int i=0; int j=s.length()-1;
        while(i<j){
            char temp = sb.charAt(i);
            sb.setCharAt(i,sb.charAt(j));
            sb.setCharAt(j, temp);
            i++; j--;
        }
        // sb.reverse();
        return sb.toString();
    }

public void main(String[] args){
    String s = "Hello";
    System.out.print(reverseString(s));
}
}
