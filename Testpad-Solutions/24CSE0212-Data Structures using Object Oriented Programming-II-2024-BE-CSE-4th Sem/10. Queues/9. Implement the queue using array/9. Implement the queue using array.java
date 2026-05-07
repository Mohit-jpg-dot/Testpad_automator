import java.util.*;
class QueueArray
{
  static int SIZE=100;
  static int front=-1;
  static int rear=-1;
  static int array[]=new int[SIZE];
  QueueArray()
  {
    front=rear=-1;
  }
  void enqueue(int item) {
      if(front == -1) front =0;
      array[++rear] = item;
  }
  int dequeue() {
      if(front == -1 || front > rear)  return -1;
      return array[front++];
      }
}