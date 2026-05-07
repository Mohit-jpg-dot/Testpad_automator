class Result {
  public static int findOddMan(int n, int arr[]) {
    int result = 0;
    for(int i = 0; i < n; i++) {
        result ^= arr[i];   // XOR operation
    }
    return result;
  }
}