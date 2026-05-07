class Result {
    static LinkList listCut(LinkList head) {
        if (head == null)
            return null;
        LinkList slow = head;
        LinkList fast = head;
        while (fast.next != head && fast.next.next != head) {
            slow = slow.next;
            fast = fast.next.next;
        }
        if (fast.next.next == head)
            fast = fast.next;
        LinkList head2 = slow.next;
        slow.next = head;
        fast.next = head2;
        return head2;
    }
}