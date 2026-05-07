static void printKLargest(int array[], int n, int k) {
    // Sort array in ascending order
    java.util.Arrays.sort(array);
    // Print k largest elements in descending order
    for(int i = n - 1; i >= n - k; i--) {
        System.out.print(array[i]);
        if(i != n - k) {
            System.out.print(" ");
        }
    }
}