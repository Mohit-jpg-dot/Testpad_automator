static Node shiftSmallLarge(Node head) {
    if (head == null || head.next == null)
        return head;
    Node temp = head;
    int min = head.data, max = head.data;
    while (temp != null) {
        if (temp.data < min) min = temp.data;
        if (temp.data > max) max = temp.data;
        temp = temp.next;
    }
    Node dummy = new Node(0);
    Node tail = dummy;
    temp = head;
    while (temp != null) {
        if (temp.data != min && temp.data != max) {
            tail.next = new Node(temp.data);
            tail = tail.next;
        }
        temp = temp.next;
    }
    Node newHead = new Node(min);
    newHead.next = dummy.next;
    Node t = newHead;
    while (t.next != null)
        t = t.next;
    t.next = new Node(max);
    return newHead;
}