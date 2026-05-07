static LinkList rotateByK(LinkList head, int k)
{
    if(head == null || head.next == null || k == 0)
        return head;
    LinkList curr = head;
    int len = 1;
    while(curr.next != null)
    {
        curr = curr.next;
        len++;
    }
    k = k % len;
    if(k == 0)
        return head;
    curr.next = head;
    head.prev = curr;
    int steps = len - k;
    LinkList newTail = head;
    for(int i = 1; i < steps; i++)
        newTail = newTail.next;
    LinkList newHead = newTail.next;
    newTail.next = null;
    newHead.prev = null;
    return newHead;
}