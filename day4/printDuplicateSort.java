

public class printDuplicateSort {
  public void main(String[] args){
    int[] arr = {2, 3, 1, 1, 3};
int n = arr.length+1;
for (int i = 0; i < n-1; i++) {
    int originalVal = arr[i] % n;
    arr[originalVal] += n;
}
for (int i = 0; i < n-1; i++) {
    if ((arr[i] / n) >= 2) {
        System.out.print(i + " ");
    }
}
  }  
}
