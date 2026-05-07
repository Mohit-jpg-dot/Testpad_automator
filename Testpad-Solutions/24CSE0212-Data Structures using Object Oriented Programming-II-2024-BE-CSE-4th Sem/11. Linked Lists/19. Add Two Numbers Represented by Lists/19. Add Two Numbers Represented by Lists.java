/* 
  class Node {
    int data;
    Node next;
    Node(){}
    Node(int d) {
      data=d;
    }
  }
  The above class defines the linked list node.
*/
class Result {
  // Return the head of sum list
  static Node addListNumbers(Node head1, Node head2) {
    Node dummy = new Node(0);
    Node curr = dummy;
    int carry = 0;
    while(head1 != null || head2 != null || carry != 0) {
        int sum = carry;
        if(head1 != null){
            sum += head1.data;
            head1 = head1.next;
        }
        if(head2 != null){
            sum += head2.data;
            head2 = head2.next;
        }
        carry = sum / 10;
        curr.next = new Node(sum % 10);
        curr = curr.next;
    }
    return dummy.next;
}
}