static int isMaxHeap(int array[], int n) {
    // Check every internal node to ensure it satisfies the max-heap property
    for (int i = 0; i <= (n - 2) / 2; i++) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        // Check left child
        if (left < n && array[i] < array[left]) {
            return 0;
        }
        // Check right child
        if (right < n && array[i] < array[right]) {
            return 0;
        }
    }
    return 1;
}