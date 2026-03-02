public #include<iostream>
#include<vector>
using namespace std;
class heap{
    public:
    vector<int> arr;


    void heapDown(int parent){
        int x=parent;
        int left=2*x+1;
        int right=2*x+2;
        int n=arr.size();
        if(left<n && arr[left]>arr[x]){
            x=left;
        }
        if(right<n && arr[right]>arr[x]){
            x=right;
        }
        if(x!=parent){
            swap(arr[x],arr[parent]);
            heapDown(x);
        }
        else{
            return;
        }
    }
    void heapUp(int child){
        int parent=(child-1)/2;
        if(arr[parent]<arr[child]){
            swap(arr[parent],arr[child]);
            heapUp(parent);
        }
        else{
            return;
        }
    }

    void heapify(vector<int> &v){
        arr=v;
        for(int i=arr.size()/2-1;i>=0;i--){
            heapDown(i);
        }
    }

    void push(int x){
        arr.push_back(x);
        heapUp(arr.size()-1);
    }
    void pop(){
        if(arr.size()==0)return;
        swap(arr[0],arr[arr.size()-1]);
        arr.pop_back();
        heapDown(0);
    }
    int top(){
        if(arr.size()==0)return -1;
        return arr[0];
    }
    bool empty(){
        return arr.size()==0;
    }
    int size(){
        return arr.size();
    }
    void printheap(){
        for(int i=0;i<arr.size();i++){
            cout<<arr[i]<<" ";
        }
        cout<<endl;
    }
    


};
int main(){
    //    1
    //  5   10
    // 10 5 1 ...
    heap h;
    h.push(1);
    h.push(5);
    h.push(10);
    cout<<h.top()<<endl;
    h.pop();
    cout<<h.top()<<endl;
    h.push(10);
    h.push(5);
    h.push(1);
    cout<<h.top()<<endl;
    
    
} heap {
    
}
