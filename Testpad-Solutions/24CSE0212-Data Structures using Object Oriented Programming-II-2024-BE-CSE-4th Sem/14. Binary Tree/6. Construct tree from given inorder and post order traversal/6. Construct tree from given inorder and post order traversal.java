class Result {
    static int postIndex;
    static Node buildTree(int in[], int post[], int N) {
        postIndex = N - 1;
        return construct(in, post, 0, N - 1);
    }
    static Node construct(int in[], int post[], int start, int end) {
        if(start > end)
            return null;
        Node root = new Node(post[postIndex--]);
        if(start == end)
            return root;
        int i;
        for(i = start; i <= end; i++) {
            if(in[i] == root.data)
                break;
        }
        root.rightChild = construct(in, post, i + 1, end);
        root.leftChild = construct(in, post, start, i - 1);
        return root;
    }
}