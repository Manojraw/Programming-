#include<iostream>

#include<vector>
#include<queue>
#include<string.h>
using namespace std;
struct MinHeapNode{
    char data;
    unsigned fr;
    MinHeapNode* lift, *right;
    MinHeapNode(char data,unsigned fr):data(data),fr(fr),lift(nullptr),right(nullptr){}
};
struct compare{
    bool operator()(MinHeapNode*l,MinHeapNode*r){
      return( l->fr > r->fr);
    }
};
void printheap( MinHeapNode*root  , string str)
       {         if(!root){return;}
         if(root->data!= '$'){
          cout << root->data <<":"<<str <<"\n";}
         printheap(root->lift,str+"0");
         printheap(root->right,str+"1");
       }
  
void haffman(char data[],int arr[],int size){
    priority_queue<MinHeapNode*,vector<MinHeapNode*>,compare>drt;
    for (int i = 0; i < size; i++){
        drt.push(new MinHeapNode(data[i],arr[i]));
    }
    while(drt.size()!=0){
       MinHeapNode*lift=drt.top(); drt.pop();
       MinHeapNode*right= drt.top();drt.pop();
       MinHeapNode*top=new MinHeapNode('$',lift->fr+right->fr);
       top->lift=lift;
       top->right=right;
       drt.push(top);
    }
    printheap(drt.top()," ");
    
}
int main(){
    char arr[]={'w','k','g','h'};
    int arrt[]={1, 6,4,8};
    int size=sizeof(arr)/sizeof(arr[0]);
    haffman(arr,arrt,size);
}