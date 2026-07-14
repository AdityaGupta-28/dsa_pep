import java.util.*;

public class prefix {
    int prefixEval(String s){
        Stack<Integer> st = new Stack<>();
        int n = s.length();
        for(int i=(n-1);i>=0;i--){
           char c = s.charAt(i);
           if(Character.isDigit(c))st.push(c-'0');
           else{
            int a=st.pop();
            int b=st.pop();
             int r;

             switch(c){
                case '+':
                    r = a+b;
                    st.push(r);
                    break;

                case '-':
                    r = a-b;
                    st.push(r);
                    break;

                case '*':
                    r = a*b;
                    st.push(r);
                    break;

                case '/':
                    r = a+b;
                    st.push(r);
                    break;

                case '^':
                    r = (int)Math.pow(a,b);
                    st.push(r);
                    break;

                default: st.push(0);
             }
           }


        }
        return st.pop();
    }

    public void main(String[] args){
        String s ="-+241";
     System.out.print(prefixEval(s));
    }

}
