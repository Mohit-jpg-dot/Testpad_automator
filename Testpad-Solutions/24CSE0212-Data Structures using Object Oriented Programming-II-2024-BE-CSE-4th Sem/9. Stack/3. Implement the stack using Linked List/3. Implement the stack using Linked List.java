/* class LinkList
{
  public int data; // data item
  public LinkList next; // next link in list
  public LinkList(int dd) // constructor
  { data = dd; }
} The LinkList class is given as above
*/
class LinkStack
{
  private LinkList first; // ref to first item on list
  public LinkStack() // constructor
  {
      first = null;
  }
  public boolean isEmpty()
  {
      return first == null;
  }
  public void push(int dd) {
      LinkList temp = new LinkList(dd);
      temp.next = first;
      first = temp;
  }
  public int pop() {
      if(first == null) return -1;
      int data = first.data;
      first = first.next;
      return data;
  }
}