package string;
import java.util.*;
public class reverseString {
    
    public String reverseString(String s){
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        return sb.toString();
    }

public void main(String[] args){
    String s = "Hello";
    System.out.print(reverseString(s));
}
}
