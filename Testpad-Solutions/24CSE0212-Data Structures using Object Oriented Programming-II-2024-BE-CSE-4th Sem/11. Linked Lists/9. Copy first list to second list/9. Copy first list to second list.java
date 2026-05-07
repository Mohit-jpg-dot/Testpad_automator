static Node copyList(Node head) {
    if (head == null)
        return null;
    Node newHead = new Node(head.data);
    Node temp1 = head.next;
    Node temp2 = newHead;
    while (temp1 != null) {
        temp2.next = new Node(temp1.data);
        temp2 = temp2.next;
        temp1 = temp1.next;
    }
    return newHead;
}