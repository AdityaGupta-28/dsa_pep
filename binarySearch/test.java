import java.util.*;

public class test {
     public void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
       List<Integer>arr = new ArrayList<>();
       for(int j=1;j<Math.pow(2,n);j++){
        int count=0;
    for(int i=0;i<32;i++){
     if(((j>>i)&1)==1)count++;
     if(count==3){
        arr.add(j);
        break;
     }
     
    }
       }
    for(int i=0;i<arr.size();i++){
        System.out.print(arr.get(i)+" ");
    }

}
}