import java.util.*;
public class alphabet {
    public static void main(String[] args){
        char ch='A';
        Scanner sc =  new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(ch+ " ");
                ch++;
            }
            System.out.println();
        }
    }
}
