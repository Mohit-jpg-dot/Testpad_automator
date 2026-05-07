class PQueueLL
{
    public QueueNode front, rear;
    public void EnQueue(int data, int priority)
    {
        QueueNode newNode = new QueueNode(data, priority);
        // If queue is empty
        if(front == null)
        {
            front = rear = newNode;
            return;
        }
        // If new node has higher priority than front
        if(priority < front.priority)
        {
            newNode.next = front;
            front = newNode;
            return;
        }
        // Insert in proper position
        QueueNode temp = front;
        while(temp.next != null && temp.next.priority <= priority)
        {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        if(newNode.next == null)
            rear = newNode;
    }
    public int DeQueue()
    {
        if(front == null)
            return -1;
        int value = front.data;
        front = front.next;
        if(front == null)
            rear = null;
        return value;
    }
}