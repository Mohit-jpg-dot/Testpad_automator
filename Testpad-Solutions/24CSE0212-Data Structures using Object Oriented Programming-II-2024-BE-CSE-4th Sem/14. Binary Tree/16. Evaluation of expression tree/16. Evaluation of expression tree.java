class Result {
  static int evaluateTree(Node t1) {
    if(t1 == null)
      return 0;
    // leaf node (operand)
    if(t1.leftChild == null && t1.rightChild == null)
      return t1.data;
    int left = evaluateTree(t1.leftChild);
    int right = evaluateTree(t1.rightChild);
    switch(t1.data) {
      case 43: // +
        return left + right;
      case 45: // -
        return left - right;
      case 42: // *
        return left * right;
      case 47: // /
        return left / right;
    }
    return 0;
  }
}