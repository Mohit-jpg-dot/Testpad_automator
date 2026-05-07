/* class LinkList {
  int data;
  LinkList next;
  LinkList() {}
  LinkList(int d) {
    data=d;
  }
} */
class Result {
  static LinkList insertSorted(LinkList head, int data) {
    LinkList newNode = new LinkList(data);
    // If list is empty
    if (head == null) {
        newNode.next = newNode;
        return newNode;
    }
    LinkList curr = head;
    // Insert before head (new smallest element)
    if (data <= head.data) {
        while (curr.next != head) {
            curr = curr.next;
        }
        curr.next = newNode;
        newNode.next = head;
        return newNode;
    }
    // Insert in middle or end
    while (curr.next != head && curr.next.data < data) {
        curr = curr.next;
    }
    newNode.next = curr.next;
    curr.next = newNode;
    return head;
}
}