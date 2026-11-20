static void printKLargest(int array[], int n, int k) {
        // Sort the array in ascending order
        Arrays.sort(array);
        // Print the last k elements in descending order
        StringBuilder sb = new StringBuilder();
        for (int i = n - 1; i >= n - k; i--) {
            sb.append(array[i]);
            if (i > n - k) {
                sb.append(" ");
            }
        }
        System.out.print(sb.toString());
    }