import java.util.*;

public class Diamond{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n =sc.nextInt();

for(int i=0;i<n;i++){
    for(int j=0;j<n-i-1;j++ ){
        System.out.print(" ");
    }
    for(int j=0;j<2*i+1;j++){
        System.out.print("*");
    }
    System.out.println();
}

for(int i=0;i<n-1;i++){
    for(int j=0;j<=i;j++ ){
        System.out.print(" ");
    }
    for(int j=0;j<2*(n-i)-3;j++){
        System.out.print("*");
    }
    System.out.println();
}


// for(int s=0;s<=n/2;s++){
// for(int i=s;i<n/2;i++){
//     System.out.print(" ");
// }
// for(int j=0;j<=s;j++){
//     System.out.print("* ");   
// }
// System.out.println();
// }


// for(int s=n/2-1;s>=0;s--){
// for(int i=s;i<n/2;i++){
//     System.out.print(" ");
// }
// for(int j=0;j<=s;j++){
//     System.out.print("* ");   
// }
// System.out.println();
// }


}
}