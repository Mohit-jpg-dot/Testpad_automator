class PQueueLL
{
    public QueueNode front, rear;
    public void EnQueue(int data, int priority)
    {
        QueueNode newNode = new QueueNode(data, priority);
        // If queue is empty or new node has higher priority (smaller number) than front
        if (front == null || priority < front.priority) {
            newNode.next = front;
            front = newNode;
        } else {
            // Find the position where the new node should be inserted
            QueueNode current = front;
            while (current.next != null && current.next.priority <= priority) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }
    public int DeQueue()
    {
        // If queue is empty, return -1 as specified
        if (front == null) {
            return -1;
        }
        // Remove the highest priority element (front of the list)
        int dequeuedData = front.data;
        front = front.next;
        // If front becomes null, rear should also be null (optional clean-up)
        if (front == null) {
            rear = null;
        }
        return dequeuedData;
    }
}