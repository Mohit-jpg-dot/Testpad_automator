Node swapNodes(Node head, int x, int y) {
    if (x == y) return head;
    Node currX = head, currY = head;
    while (currX != null && currX.data != x)
        currX = currX.next;
    while (currY != null && currY.data != y)
        currY = currY.next;
    if (currX == null || currY == null)
        return head;
    int temp = currX.data;
    currX.data = currY.data;
    currY.data = temp;
    return head;
}