static int total = 0;
static void printAllPaths(Node root) {
    if(root == null)
        return;
    ArrayList<Integer> path = new ArrayList<>();
    solve(root, path);
    System.out.println(total);
}
static void solve(Node root, ArrayList<Integer> path)
{
    if(root == null)
        return;
    path.add(root.data);
    if(root.left == null && root.right == null)
    {
        for(int x : path)
            System.out.print(x + " ");
        System.out.println(path.size() - 1);
        total++;
    }
    else
    {
        solve(root.left, path);
        solve(root.right, path);
    }
    path.remove(path.size() - 1);
}