class Result {
  static int getPairsCount(int arr[], int n, int k) {
    // Write your code here
    HashMap<Integer, Integer> st = new HashMap<>();
    int count = 0;
    for(int i=0; i<n; i++) {
        int complement = k-arr[i];
        if(st.containsKey(complement)) {
            count += st.get(complement);
        }
        st.put(arr[i], st.getOrDefault(arr[i], 0) + 1);
    }
    return count;
  }
}