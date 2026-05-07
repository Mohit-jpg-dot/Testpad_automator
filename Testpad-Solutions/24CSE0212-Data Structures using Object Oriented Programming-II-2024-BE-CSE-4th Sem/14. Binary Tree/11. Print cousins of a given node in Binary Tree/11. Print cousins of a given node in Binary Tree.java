import java.util.*;
class Result {
  static void printCousins(Node root, int k) {
    if(root == null || root.data == k){
      System.out.print("-1");
      return;
    }
    Queue<Node> q = new LinkedList<>();
    q.add(root);
    boolean found = false;
    while(!q.isEmpty()){
      int size = q.size();
      for(int i = 0; i < size; i++){
        Node curr = q.poll();
        if((curr.leftChild != null && curr.leftChild.data == k) ||
           (curr.rightChild != null && curr.rightChild.data == k)){
          found = true;
        }
        else{
          if(curr.leftChild != null)
            q.add(curr.leftChild);
          if(curr.rightChild != null)
            q.add(curr.rightChild);
        }
      }
      if(found){
        if(q.isEmpty())
          System.out.print("-1");
        else{
          while(!q.isEmpty())
            System.out.print(q.poll().data + " ");
        }
        return;
      }
    }
    System.out.print("-1");
  }
}