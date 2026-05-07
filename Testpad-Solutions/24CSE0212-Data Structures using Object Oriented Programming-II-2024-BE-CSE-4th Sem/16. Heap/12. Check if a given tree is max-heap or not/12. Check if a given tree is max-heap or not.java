static int isMaxHeap(int array[], int n){
    // Check for all non-leaf nodes
    for(int i = 0; i <= (n/2) - 1; i++){
        int left = 2*i + 1;
        int right = 2*i + 2;
        // If left child exists and is greater than parent
        if(left < n && array[i] < array[left])
            return 0;
        // If right child exists and is greater than parent
        if(right < n && array[i] < array[right])
            return 0;
    }
    return 1;
}