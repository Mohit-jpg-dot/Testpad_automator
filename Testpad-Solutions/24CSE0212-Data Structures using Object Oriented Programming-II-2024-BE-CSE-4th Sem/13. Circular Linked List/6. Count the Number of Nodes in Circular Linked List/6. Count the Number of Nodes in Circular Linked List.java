/* 
 *  class Node {
 *    int data;
 *    Node next;
 *  };
 *
 *  The above class defines the linked list node.
 */
class Result {
  static int countNodes(Node head) {
    if(head == null)
        return 0;
    int count = 1;
    Node curr = head.next;
    while(curr != head){
        count++;
        curr = curr.next;
    }
    return count;
}
}