static int isCircular(Node head) {
    if (head == null)
        return 1;
    Node slow = head;
    Node fast = head;
    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
        if (slow == fast) {
            if (slow == head) 
                return 1;
            else 
                return 0;
        }
    }
    return 0;
}