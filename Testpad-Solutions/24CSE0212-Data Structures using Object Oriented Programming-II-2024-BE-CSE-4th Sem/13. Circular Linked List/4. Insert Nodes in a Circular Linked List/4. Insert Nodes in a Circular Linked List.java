static LinkList insertBeg(LinkList head, int data) {
    LinkList newNode = new LinkList(data);
    if(head == null){
        newNode.next = newNode;
        return newNode;
    }
    LinkList curr = head;
    while(curr.next != head){
        curr = curr.next;
    }
    curr.next = newNode;
    newNode.next = head;
    return newNode;
}
static LinkList insertEnd(LinkList head, int data) {
    LinkList newNode = new LinkList(data);
    if(head == null){
        newNode.next = newNode;
        return newNode;
    }
    LinkList curr = head;
    while(curr.next != head){
        curr = curr.next;
    }
    curr.next = newNode;
    newNode.next = head;
    return head;
}