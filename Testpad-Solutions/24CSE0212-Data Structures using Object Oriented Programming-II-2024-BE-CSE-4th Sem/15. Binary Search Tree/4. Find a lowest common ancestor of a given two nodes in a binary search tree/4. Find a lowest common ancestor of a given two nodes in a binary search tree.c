int lowestCommonAncestor(struct Node* root, int k1, int k2) {
    while(root != NULL)
    {
        if(k1 < root->data && k2 < root->data)
            root = root->left;
        else if(k1 > root->data && k2 > root->data)
            root = root->right;
        else
            return root->data;
    }
    return -1;
}