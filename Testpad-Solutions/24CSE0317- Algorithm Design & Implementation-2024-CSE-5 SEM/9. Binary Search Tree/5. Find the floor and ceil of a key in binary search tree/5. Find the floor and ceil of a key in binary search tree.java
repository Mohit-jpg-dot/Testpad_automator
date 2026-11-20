class Result {
    static int floorOf ( Node root , int key ) {
        int floor = -1;
        while (root != null) {
            if (root.data == key) {
                return key;
            }
            if (root.data > key) {
                root = root.leftChild;
            } else {
                floor = root.data;
                root = root.rightChild;
            }
        }
        return floor;
    }
    static int ceilOf ( Node root , int key ) {
        int ceil = -1;
        while (root != null) {
            if (root.data == key) {
                return key;
            }
            if (root.data < key) {
                root = root.rightChild;
            } else {
                ceil = root.data;
                root = root.leftChild;
            }
        }
        return ceil;
    }
}