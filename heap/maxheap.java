import java.util.*;
//  time complexity of heapify is O(nlogn)
class maxheap{
class heap{
  int arr[];
  int size=0;
  int cap;

  heap(int n){
    arr = new int[n];
    cap=n;
  }
  
  public void heapify(int ind){
    int left= 2*ind+1;
    int right = 2*ind+2;
    int largest=ind;
    if(left<size && arr[left]<arr[right])largest=right;
    if(right<size && arr[left]>arr[right])largest=left;

    if(largest!=ind){
    int temp = arr[ind];
    arr[ind] = arr[largest];
    arr[largest]=temp;
    heapify(largest);}
    
  }

  public void insert(int val){
    if(size==cap){System.out.println("Heap is full"); return;}
        int ind = size;
        int parent= (ind-1)/2;   // parent node = i-1/2

        arr[size++]=val;
       
       while(ind>0 && arr[ind]>arr[parent]){
        int temp=arr[parent];
        arr[parent]=arr[ind];
        arr[ind]=temp;
        ind = parent;
        parent= (ind-1)/2;
    } 
 
  }

  public void delete(){
    if(size==0){System.out.println("Empty"); return;}
     arr[0]=arr[size-1];
     size--;
     heapify(0);
  }

  public void print(){
    if(size==0)System.out.println("Empty heap");
    for(int i=0;i<size;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();
  }
}

public void main(String[] args){
    Scanner sc =new Scanner(System.in);

    heap obj = new heap(10);
    obj.insert(1);
    obj.insert(4);
    obj.insert(3);
    obj.insert(8);
    obj.insert(2);
    obj.print();
    obj.delete();
    obj.print();

}

}