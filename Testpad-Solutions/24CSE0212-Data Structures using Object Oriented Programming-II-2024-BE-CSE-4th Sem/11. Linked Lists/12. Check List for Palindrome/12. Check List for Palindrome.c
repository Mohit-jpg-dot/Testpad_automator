int checkPalindrome(struct Node* head) {
    if(head == NULL)
        return 0;
    int arr[100000];
    int i = 0;
    struct Node* temp = head;
    while(temp != NULL){
        arr[i++] = temp->data;
        temp = temp->next;
    }
    int l = 0, r = i - 1;
    while(l < r){
        if(arr[l] != arr[r])
            return 0;
        l++;
        r--;
    }
    return 1;
}