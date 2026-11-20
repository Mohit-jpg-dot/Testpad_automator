class Result {
  static int searchRotatedSortedArray(int arr[], int k) {
    // Write your code here
    boolean found = false;
    int index = 0;
    for(int i=0; i<arr.length; i++) {
        if(arr[i] == k) {
            index = i; 
            found = true;
        }
    }
    if(found) {
        return index;
    } else {
        return -1;
    }
  }
}