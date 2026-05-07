/* 
int stackArray[maxSize], top = -1,maxSize;
int isFull();
int isEmpty();
Above variables are used for Stack, maxSize and top. Also above two functions are provided. */
public void push(int j) {
  if(isFull()) return;
  stackArray[++top] = j;
}
public int pop(){
    if(isEmpty()) return -1;
    return stackArray[top--];
}
public int getMin(){
    int max =1000000;
    for(int i=0;i<=top;i++){
        if(stackArray[i] < max) max = stackArray[i];
    }
    return max;
}