static Node rearrangeList(Node head) {
    if (head == null || head.next == null)
        return head;
    java.util.ArrayList<Integer> even = new java.util.ArrayList<>();
    java.util.ArrayList<Integer> odd = new java.util.ArrayList<>();
    Node temp = head;
    int pos = 1;
    while (temp != null) {
        if (pos % 2 == 0)
            even.add(temp.data);
        else
            odd.add(temp.data);
        temp = temp.next;
        pos++;
    }
    temp = head;
    int i = 0, j = 0;
    pos = 1;
    while (temp != null) {
        if (i < even.size()) {
            temp.data = even.get(i++);
        } else {
            temp.data = odd.get(j++);
        }
        temp = temp.next;
    }
    return head;
}