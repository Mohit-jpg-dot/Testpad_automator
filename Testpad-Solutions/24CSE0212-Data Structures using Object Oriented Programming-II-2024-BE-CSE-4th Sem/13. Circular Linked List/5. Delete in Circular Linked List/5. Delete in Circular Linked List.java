static LinkList deleteBeg(LinkList head){
    if(head == null)
        return null;
    if(head.next == head)
        return null;
    LinkList curr = head;
    while(curr.next != head){
        curr = curr.next;
    }
    curr.next = head.next;
    return head.next;
}
static LinkList deleteEnd(LinkList head){
    if(head == null)
        return null;
    if(head.next == head)
        return null;
    LinkList curr = head;
    while(curr.next.next != head){
        curr = curr.next;
    }
    curr.next = head;
    return head;
}