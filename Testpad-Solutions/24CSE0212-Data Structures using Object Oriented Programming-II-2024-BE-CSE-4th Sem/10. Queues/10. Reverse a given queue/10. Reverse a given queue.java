/* 
class QueueArray
{
  static int SIZE=10;
  static int front=-1;
  static int rear=-1;
  static int array[]=new int[SIZE];
  void enqueue(int item);
  void dequeue();
  Abobe is the queue declaration.
*/
static void reverseQueue(QueueArray q){
  // Write your code here
    int i = q.front;
    int j = q.rear;
    while(i<=j){
        int temp = q.array[i];
        q.array[i] = q.array[j];
        q.array[j] = temp;
        i++;
        j--;
    }
}