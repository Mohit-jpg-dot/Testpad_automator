int checkBST(struct Node* root, int min, int max)
{
    if(root == NULL)
        return 1;
    if(root->data <= min || root->data >= max)
        return 0;
    return checkBST(root->left, min, root->data) &&
           checkBST(root->right, root->data, max);
}
int isBinarySearchTree(struct Node* root)
{
    return checkBST(root, -1000000, 1000000);
}