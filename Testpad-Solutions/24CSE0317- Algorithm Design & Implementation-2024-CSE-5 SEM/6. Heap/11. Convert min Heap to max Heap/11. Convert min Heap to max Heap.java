static void modifyMintoMax(int array[], int n) {
        // Start from the last non-leaf node and perform max-heapify downwards
        for (int i = (n / 2) - 1; i >= 0; i--) {
            maxHeapify(array, n, i);
        }
    }
    static void maxHeapify(int[] array, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        if (left < n && array[left] > array[largest]) {
            largest = left;
        }
        if (right < n && array[right] > array[largest]) {
            largest = right;
        }
        if (largest != i) {
            int swap = array[i];
            array[i] = array[largest];
            array[largest] = swap;
            maxHeapify(array, n, largest);
        }
    }