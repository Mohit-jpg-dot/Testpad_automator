class CQStack
{
  public int maxSize; // size of stack array
  public int[] st;
  public int top; // top of stack
  public CQStack(int s) {
      maxSize =s;
      st = new int[maxSize];
      top =-1;
  }
  public void push(int j) {
      if(isFull()) return ;
      st[++top] = j;
  }
  public int pop() {
      if(isEmpty()) return -1;
      return st[top--];
  }
  public boolean isEmpty() {
      return top==-1;
  }
  public boolean isFull() {
      return top == maxSize-1;
  }
}