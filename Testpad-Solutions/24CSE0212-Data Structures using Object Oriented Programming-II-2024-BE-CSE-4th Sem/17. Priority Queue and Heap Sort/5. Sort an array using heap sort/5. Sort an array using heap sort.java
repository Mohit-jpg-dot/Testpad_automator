class Result {
    static void heapify(int array[], int n, int i) {
        int largest = i;          // Initialize largest as root
        int left = 2 * i + 1;     // left child
        int right = 2 * i + 2;    // right child
        // If left child is larger than root
        if (left < n && array[left] > array[largest])
            largest = left;
        // If right child is larger than largest so far
        if (right < n && array[right] > array[largest])
            largest = right;
        // If largest is not root
        if (largest != i) {
            int temp = array[i];
            array[i] = array[largest];
            array[largest] = temp;
            // Recursively heapify the affected sub-tree
            heapify(array, n, largest);
        }
    }
    static void heapSort(int array[], int n) {
        // Build max heap
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(array, n, i);
        // Extract elements from heap one by one
        for (int i = n - 1; i > 0; i--) {
            // Move current root to end
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            // Call heapify on reduced heap
            heapify(array, i, 0);
        }
    }
}