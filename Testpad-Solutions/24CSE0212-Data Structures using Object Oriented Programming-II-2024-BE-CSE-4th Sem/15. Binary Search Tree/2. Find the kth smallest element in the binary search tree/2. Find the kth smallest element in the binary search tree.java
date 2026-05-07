static int kSmallest(Node root, int k) 
{
    int[] count = new int[1];
    int[] ans = new int[1];
    inorder(root, k, count, ans);
    return ans[0];
}
static void inorder(Node root, int k, int[] count, int[] ans)
{
    if(root == null)
        return;
    inorder(root.left, k, count, ans);
    count[0]++;
    if(count[0] == k)
    {
        ans[0] = root.data;
        return;
    }
    inorder(root.right, k, count, ans);
}