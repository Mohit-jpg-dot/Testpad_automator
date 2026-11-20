class Result {
    static int evaluateTree(Node t1) {
        if (t1 == null) {
            return 0;
        }
        // If it is a leaf node, it contains an operand (number)
        if (t1.leftChild == null && t1.rightChild == null) {
            return t1.data;
        }
        // Evaluate left and right subtrees
        int leftVal = evaluateTree(t1.leftChild);
        int rightVal = evaluateTree(t1.rightChild);
        // Check the operator based on its ASCII value and perform the operation
        if (t1.data == 43) { // '+'
            return leftVal + rightVal;
        } else if (t1.data == 45) { // '-'
            return leftVal - rightVal;
        } else if (t1.data == 42) { // '*'
            return leftVal * rightVal;
        } else if (t1.data == 47) { // '/'
            return leftVal / rightVal;
        }
        return 0;
    }
}