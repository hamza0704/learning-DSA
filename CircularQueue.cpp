#include <iostream>
using namespace std;

class CircularQueue{
    int* arr;
    int f = 0, r = -1;
    int size, capacity;
    public:
        CircularQueue(int cap){
            capacity = size;
            arr = new int[cap];
            f = 0;
            r = -1;
    }  
    void push(int data){
        if(size == capacity){
        cout<<"Queue is full\n";
        return;
        r = (r+1)%capacity;
        arr[r] = data;
        size++;
}
    }
    void pop(){
        if(empty()){
            cout<<"Queue is empty\n";
            return;
        }
        f = (f+1)%capacity;
        size--;
    }
    int front(){
        return arr[f];
    }
    bool empty(){
        return size ==0;
    }
};
int main() {
    CircularQueue q(3);
    q.push(1);
    q.push(2);
    q.push(3);
    while(!q.empty()){
        cout<<q.front()<<endl;
        q.pop();
    }
    return 0;
}