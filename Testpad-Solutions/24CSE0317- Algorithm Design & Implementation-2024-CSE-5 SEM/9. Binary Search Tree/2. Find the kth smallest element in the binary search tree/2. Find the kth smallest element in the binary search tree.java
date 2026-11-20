static int kSmallest(Node root, int k) {
    if (root == null) {
        return 0;
    }
    int[] count = {0};
    int[] result = {-1};
    findKth(root, k, count, result);
    return result[0] == -1 ? 0 : result[0];
}
static void findKth(Node root, int k, int[] count, int[] result) {
    if (root == null || count[0] >= k) {
        return;
    }
    findKth(root.left, k, count, result);
    count[0]++;
    if (count[0] == k) {
        result[0] = root.data;
        return;
    }
    findKth(root.right, k, count, result);
}