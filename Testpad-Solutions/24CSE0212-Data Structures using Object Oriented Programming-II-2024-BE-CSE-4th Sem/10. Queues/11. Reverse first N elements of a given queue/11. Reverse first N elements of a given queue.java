/* 
class QueueArray
{
  int SIZE=50;
  int front=-1;
  int rear=-1;
  int array[]=new int[SIZE];
  void enqueue(int item);
  void dequeue();
  Abobe is the queue declaration.
*/
static void reverseKelementsQueue(QueueArray q, int k)
{   
    Stack<Integer> st = new Stack<>();
    for(int i=1; i<=k;i++){
        st.push(q.dequeue());
    }
    while(!st.isEmpty()){
        q.enqueue(st.pop());
    }
    int n = q.rear - q.front +1;
    for(int j=1;j<=n-k;j++){
        int val = q.dequeue();
        q.enqueue(val);
    }
}